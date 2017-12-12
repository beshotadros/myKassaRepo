package com.mikeys.mykassa.mykassa.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class KassaTabController implements Initializable{

	@FXML private TabPane tabPane;
	
	@FXML private Tab alcoholics; //from TabPaneRootView.fxml: <Tab fx:id="tab1_foo" ...>
	@FXML private Tab nonAlcoholics; //from TabPaneRootView.fxml: <Tab fx:id="tab2_bar" ...>

	// Inject tab controller
	@FXML private AlcoholicsController xxx_alcoholics_xxxController;//TabPaneRootView.fxml_include_fx:id="xxx_tab1foo_xxx" + "Controller"
	@FXML private NonAlcoholicsController xxx_nonAlcoholics_xxxController;
	
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("init Kassa Tab");
		tabPane.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends Tab> observable,
				Tab oldValue, Tab newValue) -> {                                                                                                    
					if (newValue == nonAlcoholics) {
						System.out.println("nonAlcoholics");
						/*System.out.println("xxx_nonAlcoholics_xxxController=" + xxx_nonAlcoholics_xxxController); //if =null => inject problem 
						try {
						xxx_orderTab_xxxController.orderButtonClicked();
						}catch(NullPointerException e) {
							e.printStackTrace();
						}*/
					} else if (newValue == alcoholics) {
						System.out.println("alcoholics");
						//System.out.println("xxx_kassaTab_xxxController=" + xxx_kassaTab_xxxController); //if =null => inject problem
						//xxx_kassaTab_xxxController.goesserClicked();
					} else {
						System.out.println("- another Tab -");
					}
				});
	}
}
