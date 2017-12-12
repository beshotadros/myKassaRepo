package com.mikeys.mykassa.mykassa;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mikeys.mykassa.mykassa.dao.AlcoProductDAO;
import com.mikeys.mykassa.mykassa.dao.OrderDAO;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application
{
    public static void main( String[] args )throws SQLException
    {
    	launch(args);
    	AnnotationConfigApplicationContext applicationContext = 
    			new AnnotationConfigApplicationContext(SpringJDBCConfiguration.class);
    	
    	System.out.println("test1");
        OrderDAO orderDAO = applicationContext.getBean(OrderDAO.class);
        String orderName = orderDAO.getOrderName(1);
        System.out.println("Ordername name is " + orderName);
 
        
        /*AlcoProductDAO alcoProductDAO = applicationContext.getBean(AlcoProductDAO.class);
        String alcoProductName = alcoProductDAO.getProduct(1);
        System.out.println("alcoProductName name is " + alcoProductName);*/
        
        applicationContext.close();
    }
    
    @Override
	public void start(Stage primaryStage) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("/com/mikeys/mykassa/mykassa/controller/MainView.fxml"));
    		//Scene scene = new Scene(root, 400,400);
    		//scene.getStylesheets().add(getClass().getResource("applicateion.css").toExternalForm());
    		primaryStage.setTitle("MyApplication");
    		primaryStage.setScene(new Scene(root));
    		primaryStage.show();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
