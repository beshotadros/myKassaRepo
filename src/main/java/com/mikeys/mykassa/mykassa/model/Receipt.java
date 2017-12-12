package com.mikeys.mykassa.mykassa.model;

import java.sql.Timestamp;
import java.util.List;

public class Receipt {
	private List<Product> products;
	private int id;
	private Timestamp timestamp;
	
	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public int getId() {
		return id;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Receipt(List<Product> products) {
		super();
		this.products = products;
	}
	
}
