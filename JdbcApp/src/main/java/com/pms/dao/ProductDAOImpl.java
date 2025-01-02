package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.db.DBUtility;
import com.pms.main.ProductManagementSystem;
import com.pms.query.Query;

public class ProductDAOImpl implements ProductDAO {
	Scanner sc = new Scanner(System.in);
	Connection con = DBUtility.getConnection();
	PreparedStatement ps = null;
	ResultSet rs = null;
	List<Product> products = null;

	@Override
	public void createProduct(Product product) {
		try {
			String sql = Query.CREATE_PRODUCT;
			ps = con.prepareStatement(sql);
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setInt(3, product.getQty());
			ps.setDouble(4, product.getPrice());
			int n = ps.executeUpdate();
			if (n != 0) {
				System.out.println("Succesfully one product inserted...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Product viewProduct(int productId) {
		Product product = new Product();
		try {
			ps = con.prepareStatement(Query.SELECT_PRODUCT_ID);
			ps.setInt(1, productId);
			rs = ps.executeQuery();
			while (rs.next()) {
				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setQty(rs.getInt(3));
				product.setPrice(rs.getDouble(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public List<Product> viewAllProducts() {
		Product product = null;
		products = new ArrayList<Product>();
		try {
			ps = con.prepareStatement(Query.SELECT_PRODUCTS);
			rs = ps.executeQuery();
			while (rs.next()) {
				product = new Product();
				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setQty(rs.getInt(3));
				product.setPrice(rs.getDouble(4));
				products.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return products;
	}

	@Override
	public void updateProduct(int productId, Product updateProduct) {
		try {
			ps = con.prepareStatement(Query.UPDATE_PRODUCTS);
			ps.setString(1, updateProduct.getProductName());
			ps.setInt(2, updateProduct.getQty());
			ps.setDouble(3, updateProduct.getPrice());
			ps.setInt(4, productId);
			int n = ps.executeUpdate();
			if(n!=0) {
				System.out.println("Successfully Product Updated....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteProduct(int productId) {
		try {
			ps = con.prepareStatement(Query.DELETE_PRODUCT_ID);
			ps.setInt(1, productId);
			int n = ps.executeUpdate();
			if(n!=0) {
				System.out.println("Product Successfully Delted....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void back() {
		ProductManagementSystem.main(null);
		
	}

	@Override
	public void bill() {
		List<Product> products =viewAllProducts();
		for(Product p3:products) {
			System.out.println(p3);
		}
		System.out.println("Enter Selected Product Id ?");
		int selectedId = sc.nextInt();
		System.out.println("How much Quantity do you want ?");
		int selectedQty = sc.nextInt();
		Product selectedProduct = viewProduct(selectedId);
		System.out.println("--------------------------------------");
		System.out.println("               BILL                   ");
		System.out.println("--------------------------------------");
		System.out.println(" Product Id       :   "+selectedId);
		System.out.println(" Product Name     :   "+selectedProduct.getProductName());
		System.out.println(" Product Quantity :   "+selectedQty);
		System.out.println(" Product Price    :   "+selectedProduct.getPrice());
		System.out.println("--------------------------------------");
		System.out.println(" Total Amount     :   "+(selectedQty*selectedProduct.getPrice()));
		System.out.println("---------------------------------------");
		selectedProduct.setQty(selectedProduct.getQty()-selectedQty);
		updateProduct(selectedId, selectedProduct);
		
		
	}

}
