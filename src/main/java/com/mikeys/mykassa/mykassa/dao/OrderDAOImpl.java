package com.mikeys.mykassa.mykassa.dao;
 
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl implements OrderDAO {
 
    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
 
    public String getOrderName(int id) {
        String sql = "select PRODUCT from STOCK where KEY = ?";
        String name = jdbcTemplate.queryForObject(sql,new Object[]{id},String.class);
        return name;
    }

 
}