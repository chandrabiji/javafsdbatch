package com.pms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.main.ProductManagementSystem;

public class ProductDAOImpl implements ProductDAO {
	Scanner sc = new Scanner(System.in);
	Product product = null;
	static ArrayList<Product> originalList = new ArrayList<Product>();
	static ArrayList<Product> tempList = new ArrayList<Product>();

	@Override
	public void addProduct() {
		int n = 1;
		while (n == 1) {
			System.out.println("Enter Product Id ?");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name ?");
			String pname = sc.next();
			System.out.println("Enter Product Qty ?");
			int qty = sc.nextInt();
			System.out.println("Enter Product Price ?");
			double price = sc.nextDouble();
			product = new Product(pid, pname, qty, price);
			originalList.add(product);
			System.out.println("Do you want to add more products press 1 else any number");
			n = sc.nextInt();
		}
		System.out.println("Successfully Products added....");
	}

	@Override
	public Product viewProduct(int productId) {
		product = null;
		for (Product p : originalList) {
			if (p.getProductId() == productId) {
				product = p;
				break;
			}
		}
		return product;
	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return originalList;
	}

	@Override
	public void updateProduct(int prodcutId) {
		tempList = new ArrayList<Product>();
		for (Product p : originalList) {
			if (p.getProductId() == prodcutId) {
				System.out.println("Select Updated Filed : 1.Name  2. Qty  3.Price");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter Updated Product Name ?");
					p.setProductName(sc.next());
					break;
				case 2:
					System.out.println("Enter Updated Product Qty ?");
					p.setQty(sc.nextInt());
					break;
				case 3:
					System.out.println("Enter Updated Product Price ?");
					p.setPrice(sc.nextDouble());
					break;
				default:
					System.out.println("Your choice must be 1-3 only");
				}
				tempList.add(p);
			} else {
				tempList.add(p);
			}
		}
		originalList = new ArrayList<Product>();
		for (Product p1 : tempList) {
			originalList.add(p1);
		}
		System.out.println("Successfully Product Updated....");
	}

	@Override
	public void deleteProduct(int productId) {
		tempList = new ArrayList<Product>();
		for (Product p : originalList) {
			if (p.getProductId() != productId) {
				tempList.add(p);
			}
		}
		originalList = new ArrayList<Product>();
		for (Product p1 : tempList) {
			originalList.add(p1);
		}
		System.out.println("Successfully Product Deleted....");
	}

	@Override
	public void bill() {
		double totalAmount = 0.0;
		int qty = 0;
		List<Product> availableProducts = viewAllProducts();
		if (availableProducts.isEmpty()) {
			System.out.println("No Products available");
			return;
		}
		System.out.println("Available Products List");
		for (Product p2 : availableProducts) {
			System.out.println(
					p2.getProductId() + "\t" + p2.getProductName() + "\t" + p2.getQty() + "\t" + p2.getPrice());
		}
		// Loop to allow user to select multiple products and enter quantity
		boolean continueBilling = true;
		while (continueBilling) {
			System.out.println("Which Product do you want to buy ?");
			int productId = sc.nextInt();
			// Exit Condition
			if (productId == 0) {
				break;
			}
			// Find product by id
			Product selectedProduct = null;
			for (Product p3 : availableProducts) {
				if (p3.getProductId() == productId) {
					selectedProduct = p3;
					break;
				}
			}
			// if product is found
			if (selectedProduct != null) {
				System.out.println("Enter No of Product Quantity (" + selectedProduct.getQty() + ")?");
				qty = sc.nextInt();
				// Check if enough stock is available
				if (qty <= selectedProduct.getQty()) {

					totalAmount = qty * selectedProduct.getPrice();
					selectedProduct.setQty(selectedProduct.getQty() - qty);
				} else {
					System.out.println("Not enough stock availale for " + selectedProduct.getProductName());
				}
			} else {
				System.out.println("Product with Id : " + productId + " not found");
			}
			// Ask if user wants to continue adding more products to the bill
			System.out.println("Do you want to add another Product ? press 1 forYes ,0 for No ");
			int choice = sc.nextInt();
			if (choice == 0) {
				continueBilling = false;
			}
			System.out.println("---------------Bill Summary-------------------");
			System.out.println("Product Id          " + selectedProduct.getProductId());
			System.out.println("Product Name        " + selectedProduct.getProductName());
			System.out.println("Selected Qty        " + qty);
			System.out.println("Per unit Price      " + selectedProduct.getPrice());
			System.out.println("------------------------------------------------");
			System.out.println("Total Amount        " + totalAmount);
			System.out.println("------------------------------------------------");
			System.out.println("Thank you for shoppig with us!");
		}

	}

	@Override
	public void back() {
		ProductManagementSystem.main(null);

	}

}
