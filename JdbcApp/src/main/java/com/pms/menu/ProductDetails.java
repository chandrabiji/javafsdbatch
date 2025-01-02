package com.pms.menu;

import java.util.List;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm;
import com.pms.bean.Product;
import com.pms.dao.ProductDAOImpl;

public class ProductDetails {

	public static Scanner sc = new Scanner(System.in);
	public static ProductDAOImpl dao = new ProductDAOImpl();
	Product product = null;
	static int n = 1;

	public static void adminMenu() {
		System.out.println("---------------------------------");
		System.out.println("|      ADMIN MAIN MENU          |");
		System.out.println("---------------------------------");
		System.out.println("|    1. ADD PRODUCT             |");
		System.out.println("|    2. VIEW PRODUCT            |");
		System.out.println("|    3. VIEW ALL PRODUCTS       |");
		System.out.println("|    4. UPDATE PRODUCT          |");
		System.out.println("|    5. DELETE PRODUCT          |");
		System.out.println("|    6. BACK                    |");
		System.out.println("---------------------------------");
		System.out.println("Select Your choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			while (n == 1) {
				System.out.println("Enter Product Id ");
				int pid = sc.nextInt();
				System.out.println("Enter Product Name ?");
				String name = sc.next();
				System.out.println("Enter Product Qty ?");
				int qty = sc.nextInt();
				System.out.println("Enter Product Price ?");
				double price = sc.nextDouble();
				dao.createProduct(new Product(pid, name, qty, price));
				System.out.println("Do you want to add more product press 1 else any number ?");
				n = sc.nextInt();
			}
			adminMenu();
			break;
		case 2:
			System.out.println("Enter your search Product Id ?");
			Product product = dao.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------");
			System.out.println(product);
			adminMenu();
			break;
		case 3:
			List<Product> products = dao.viewAllProducts();
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------");
			for (Product p1 : products) {
				System.out.println(p1);
			}
			adminMenu();
			break;
		case 4:
			dao.viewAllProducts();
			System.out.println("Which Product do you want to update ?");
			int productId = sc.nextInt();
			Product p2 = dao.viewProduct(productId);
			System.out.println("Select which Field do you want to update 1.Name 2.Qty 3.Price");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Updated Prdocut Name ?");
				String updateName = sc.next();
				p2.setProductName(updateName);
				break;
			case 2:
				System.out.println("Enter Updated Product Quantity ?");
				int updateQty = sc.nextInt();
				p2.setQty(updateQty);
				break;
			case 3:
				System.out.println("Enter Updated Product Price ?");
				double updatePrice = sc.nextDouble();
				p2.setPrice(updatePrice);
				break;
			default:
				System.out.println("Please select your choice range 1-3 only");
			}
			System.out.println("Your selected update product details are :");
			System.out.println(p2);
			dao.updateProduct(productId, p2);
			adminMenu();
			break;
		case 5:
			System.out.println("Which Product do you want to delete ?");
			dao.deleteProduct(sc.nextInt());
			adminMenu();
			break;
		case 6:
			dao.back();
			break;
		default:
			System.out.println("Please select your choice range 1-6 only");
			break;
		}
	}

	public static void customerMenu() {
		System.out.println("---------------------------------");
		System.out.println("|     CUSTOMER MAIN MENU        |");
		System.out.println("---------------------------------");
		System.out.println("|    1. VIEW PRODUCT            |");
		System.out.println("|    2. VIEW ALL PRODUCTS       |");
		System.out.println("|    3. BILL                    |");
		System.out.println("|    4. BACK                    |");
		System.out.println("---------------------------------");
		System.out.println("Select Your choice ?");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Enter your search Product Id ?");
			Product product = dao.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------");
			System.out.println(product);
			customerMenu();
			break;
		case 2:
			List<Product> products = dao.viewAllProducts();
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------");
			for (Product p1 : products) {
				System.out.println(p1);
			}
			customerMenu();
			break;
		case 3:
			dao.bill();
			customerMenu();
			break;
		case 4:
			dao.back();
			break;
		default:
			System.out.println("Please select your choice range 1-4 only");

			break;

		}
	}

}
