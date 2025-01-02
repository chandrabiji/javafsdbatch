package com.pms.dao;

import java.util.List;

import com.pms.bean.Product;

public interface ProductDAO {
	
	public void createProduct(Product product);
	public Product viewProduct(int productId);
	public List<Product> viewAllProducts();
	public void updateProduct(int productId,Product updateProduct);
	public void deleteProduct(int productId);
	public void bill();
	public void back();

}
