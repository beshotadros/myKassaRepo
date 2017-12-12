package com.mikeys.mykassa.mykassa.model;


import java.sql.Timestamp;

public class Order {
	private int id;
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public boolean isReceipt() {
		return receipt;
	}

	public void setReceipt(boolean receipt) {
		this.receipt = receipt;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getQuantity_piece() {
		return quantity_piece;
	}

	public void setQuantity_piece(int quantity_piece) {
		this.quantity_piece = quantity_piece;
	}

	public float getCost_price_sum() {
		return cost_price_sum;
	}

	public void setCost_price_sum(float cost_price_sum) {
		this.cost_price_sum = cost_price_sum;
	}

	public float getCost_price_piece() {
		return cost_price_piece;
	}

	public void setCost_price_piece(float cost_price_piece) {
		this.cost_price_piece = cost_price_piece;
	}

	public Timestamp getDate_time() {
		return date_time;
	}

	public void setDate_time(Timestamp date_time) {
		this.date_time = date_time;
	}

	public int getId() {
		return id;
	}

	private Product product;
	private boolean receipt;
	private String provider;
	private int quantity_piece;
	private float cost_price_sum;
	private float cost_price_piece;
	private Timestamp date_time;
	
	public Order(int id, Product product, boolean receipt, String provider, int quantity_piece, 
			float cost_price_sum, float cost_price_piece, Timestamp date_time) {
		this.id=id;
		this.product=product;
		this.receipt=receipt;
		this.provider=provider;
		this.quantity_piece=quantity_piece;
		this.cost_price_sum=cost_price_sum;
		this.cost_price_piece=cost_price_piece;
		this.date_time=date_time;
	}
	
	
}
