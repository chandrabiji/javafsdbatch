package com.pms.bean;

import java.util.Objects;

public class Product {
	
	private int productId;
	private String productName;
	private int qty;
	private double price;
	
	public Product() {}

	public Product(int productId, String productName, int qty, double price) {
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName, qty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && productId == other.productId
				&& Objects.equals(productName, other.productName) && qty == other.qty;
	}

	public String toString() {
		return productId+"\t"+productName+"\t"+qty+"\t"+price;
	}

}
