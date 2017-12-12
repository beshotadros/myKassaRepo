package com.mikeys.mykassa.mykassa;

import javax.sql.DataSource;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mikeys.mykassa.mykassa.dao.AlcoProductDAO;
import com.mikeys.mykassa.mykassa.dao.AlcoProductDAOImpl;
import com.mikeys.mykassa.mykassa.dao.OrderDAO;
import com.mikeys.mykassa.mykassa.dao.OrderDAOImpl;

 
@Configuration
public class SpringJDBCConfiguration {
    @Bean
    public DataSource dataSource() {
        
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
        //H2 database
        
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
 
    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
 
    @Bean
    public OrderDAO orderDAO(){
    	OrderDAOImpl dao = new OrderDAOImpl();
        dao.setJdbcTemplate(jdbcTemplate());
        return dao;
    }
    
    @Bean
    public AlcoProductDAO alcoProductDAO(){
    	AlcoProductDAOImpl dao = new AlcoProductDAOImpl();
        dao.setJdbcTemplate(jdbcTemplate());
        return dao;
    }
 
}
