package com.mikeys.mykassa.mykassa.model;

public class Product {
	private int id;
	private String name;
	private int quantity;
	private float price;
	
	public Product(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + "]";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}
	
}
