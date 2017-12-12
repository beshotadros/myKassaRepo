package com.mikeys.mykassa.mykassa.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.mikeys.mykassa.mykassa.model.Product;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextFormatter;

public class AlcoholicsController implements Initializable{
	@FXML private ToggleButton goesserButton, ottakringerButton, schwechaterButton,
	wieselburgerDoseButton, wieselburgerFlascheButton;

	@FXML private Spinner <Integer> goesserSpinner, ottakringerSpinner, 
	schwechaterSpinner, wieselburgerDoseSpinner, wieselburgerFlascheSpinner;

	@FXML private Button addToCartButton, encashButton;
	
	@FXML private TableView<Product> kassaTable;
	@FXML private TableColumn<Product, String> productColumn; 
	@FXML private TableColumn<Product, Integer> quantityColumn;
	@FXML private TableColumn<Product, Float> overallCostColumn;
	
	private List<Spinner<Integer>> spinners;
	private  ObservableList<Product> data;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		goesserSpinner.setUserData(new String("Goesser"));
		ottakringerSpinner.setUserData(new String("Ottakringer"));
		schwechaterSpinner.setUserData(new String("Schwechater"));
		wieselburgerDoseSpinner.setUserData(new String("wieselburger Dose"));
		wieselburgerFlascheSpinner.setUserData(new String("wieselburger Flasche"));
		
		System.out.println("init alcoholics Tab");
		spinners = new ArrayList<Spinner<Integer>>();
		spinners.add(goesserSpinner);
		spinners.add(ottakringerSpinner); 
		spinners.add(schwechaterSpinner);
		spinners.add(wieselburgerDoseSpinner);
		spinners.add(wieselburgerFlascheSpinner);
		for (int i = 0; i< spinners.size(); i++) {
			formatSpinner(spinners.get(i));
		}
		
		//initialize tableview
		data =FXCollections.observableArrayList();
		productColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
		quantityColumn.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));
	}
	
	//check all spinners for values
	@FXML
	private void addToCartClicked() {
		//iterate over them all
		for (int i = 0; i< spinners.size(); i++) {
				int spinnerValue = Integer.parseInt(spinners.get(i).getEditor().getText());
			if( spinnerValue != 0) {
				Product product = new Product((String)spinners.get(i).getUserData());
				//send Product to DB to get it filled with price and ID
				/*here*/
				product.setQuantity(spinnerValue);
				data.add(product);
				System.out.println(product.toString());
				
			}
		}
		kassaTable.setItems(data);
	}
	@FXML
	private void encashClicked() {

	}
	
	private void formatSpinner(Spinner<Integer> spinner) {
		SpinnerValueFactory<Integer> factory = new IntegerSpinnerValueFactory(0, 100, 0);
		spinner.setValueFactory(factory);
		spinner.setEditable(true);
		// hook in a formatter with the same properties as the factory
		TextFormatter<Integer> formatter = new TextFormatter<Integer>(factory.getConverter(), factory.getValue());
		spinner.getEditor().setTextFormatter(formatter);
		// bidi-bind the values
		factory.valueProperty().bindBidirectional(formatter.valueProperty());
	}

	@FXML
	public void goesserClicked() {
		System.out.println("goesserButtonClicked: "+goesserSpinner.getEditor().getText());
	}
	@FXML
	public void ottakringerClicked() {
		System.out.println("goesserButtonClicked");
	}
	@FXML
	public void schwechaterClicked() {
		System.out.println("goesserButtonClicked");
	}
	@FXML
	public void wieselburgerDoseClicked() {
		System.out.println("goesserButtonClicked");
	}
	@FXML
	public void wieselburgerFlascheClicked() {
		System.out.println("goesserButtonClicked");
	}

}
