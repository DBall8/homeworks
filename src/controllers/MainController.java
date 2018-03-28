package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.Mortgage;

public class MainController {

    @FXML
    Label lblamount;
    @FXML
    Label lblrate;
    @FXML
    Label lblyears;
    @FXML
    Label lblanswer;

    @FXML
    TextField txtamount;
    @FXML
    TextField txtrate;
    @FXML
    TextField txtyears;

    @FXML
    Button btncalc;

    private Mortgage m;

    public MainController(){
        this.m = new Mortgage();
    }

    @FXML
    public void handleButtonClick(ActionEvent e){

        double amount = Double.parseDouble(txtamount.getText());
        double rate = Double.parseDouble(txtrate.getText());
        int years = Integer.parseInt(txtyears.getText());

        this.m.setAmount(amount);
        this.m.setRate(rate);
        this.m.setYears(years);

        lblanswer.setText(Double.toString(this.m.calculateMonthlyPayment()));
    }

}
