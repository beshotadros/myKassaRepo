package com.mikeys.mykassa.mykassa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

public class NonAlcoholicsController {
@FXML private ToggleButton colaDoseButton;
	
	@FXML
    public void colaDoseClicked() {
        System.out.println("colaDoseButtonClicked");
		/*if( tab1_label_showText.getText().equals("tab1 aaa") ) {
            tab1_label_showText.setText("tab1 iii");
        } else {
            tab1_label_showText.setText("tab1 aaa");
        }*/
    }
	
}
