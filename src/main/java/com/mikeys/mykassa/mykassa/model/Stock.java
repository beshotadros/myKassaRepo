package com.mikeys.mykassa.mykassa.model;

import java.util.ArrayList;

public class Stock {
	private ArrayList<Order> orders;
	
	public Stock() {
		
	}
	
	public ArrayList<Order> getOrders(){
		return orders;
	}
	
	public boolean addOrder(Order order) {
		return orders.add(order);
	}
	
	public Order deleteOrder(int order_id) {
		return orders.remove(order_id);
	}
	
	
}
