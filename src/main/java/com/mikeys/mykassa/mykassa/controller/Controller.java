package com.mikeys.mykassa.mykassa.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.util.StringConverter;
import javafx.beans.value.ObservableValue;

public class Controller implements Initializable{
	/*@FXML
	private ToggleButton goesser;
	@FXML
	private Spinner<Integer> goesserCounter;
	@FXML
	private Tab alcoTab;
	static AlcoholicTab alcoholicTab = new AlcoholicTab();
	 */


	@FXML private TabPane tabPane;

	//###################################Inject part#############################################
	// Inject tab content
	@FXML private Tab kassaTab; //from TabPaneRootView.fxml: <Tab fx:id="tab1_foo" ...>
	@FXML private Tab orderTab; //from TabPaneRootView.fxml: <Tab fx:id="tab2_bar" ...>

	// Inject tab controller
	@FXML private KassaTabController xxx_kassaTab_xxxController;//TabPaneRootView.fxml_include_fx:id="xxx_tab1foo_xxx" + "Controller"
	@FXML private OrderTabController xxx_orderTab_xxxController;//TabPaneRootView.fxml_include_fx:id="xxx_tab2bar_xxx" + "Controller"
	//###########################################################################################


	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("init");
		tabPane.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends Tab> observable,
				Tab oldValue, Tab newValue) -> {                                                                                                    
					if (newValue == orderTab) {
						System.out.println("- 2.Tab bar -");
						System.out.println("xxx_orderTab_xxxController=" + xxx_orderTab_xxxController); //if =null => inject problem 
						try {
						xxx_orderTab_xxxController.orderButtonClicked();
						}catch(NullPointerException e) {
							e.printStackTrace();
						}
					} else if (newValue == kassaTab) {
						System.out.println("- 1.Tab foo -");
						System.out.println("xxx_kassaTab_xxxController=" + xxx_kassaTab_xxxController); //if =null => inject problem
						//xxx_kassaTab_xxxController.goesserClicked();
					} else {
						System.out.println("- another Tab -");
					}
				});
	}

	/*public void alcoTabSelected() {
		alcoholicTab.
	}

	public void goesserToggled(ActionEvent event) {
		System.out.println("goesser Toggled "+goesserCounter.getEditor().getText());
		goesserCounter.getValue();


	}
	 */
	/*public void toggleTheButton(ActionEvent event) {
		System.out.println("toggler Clicked!");

		String str = "i am a test";

		txtField1.setText(str);
	}

	public void showDateTime(ActionEvent event) {
		System.out.println("Button Clicked!");

		Date now = new Date();

		DateFormat df = new SimpleDateFormat("dd-;;-yyyy HH:mm:ss-SSS");

		String dateTimeString = df.format(now);

		myTextField.setText(dateTimeString);
	}*/
}

class MyConverter extends StringConverter<Integer> {

	@Override
	public String toString(Integer object) {
		return object + "";
	}

	@Override
	public Integer fromString(String string) {
		return Integer.parseInt(string);
	}

}
