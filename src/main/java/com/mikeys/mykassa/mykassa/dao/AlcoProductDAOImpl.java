package com.mikeys.mykassa.mykassa.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mikeys.mykassa.mykassa.model.Product;

@Repository
public class AlcoProductDAOImpl implements AlcoProductDAO{

private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
 
    
	@Override
	public List<Product> getAlcoProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProduct(int id) {
		 	String sql = "select PRODUCT from Alcoholic where KEY = ?";
	        String name = jdbcTemplate.queryForObject(sql,new Object[]{id},String.class);
	        return name;
	}

	@Override
	public void updateProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct() {
		// TODO Auto-generated method stub
		
	}

}
