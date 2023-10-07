package com.example.dictionaryoop2023;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField input;

    @FXML
    private Label output;

    @FXML
    void translate(ActionEvent event) {
        output.setText(input.getText());
    }

}
