package com.mikeys.mykassa.mykassa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

public class OrderTabController {
	@FXML private ToggleButton orderButton;

	@FXML
    public void orderButtonClicked() {             
        System.out.println("orderButtonClicked");
		/*if( tab2_label_showText.getText().equals("tab2 bbb") ) {
            tab2_label_showText.setText("tab2 jjj");
        } else {
            tab2_label_showText.setText("tab2 bbb");
        }*/
    }
}
