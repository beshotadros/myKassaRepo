package com.mikeys.mykassa.mykassa.dao;

import java.util.List;

import com.mikeys.mykassa.mykassa.model.Product;

public interface AlcoProductDAO {
	public List<Product> getAlcoProducts();
	public String getProduct(int id);
	public void updateProduct();
	public void deleteProduct();
}
