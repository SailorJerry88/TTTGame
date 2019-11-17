package pl.sda.rafal.zientara.game.lesson1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.math.BigDecimal;

public class CalcController {


    @FXML
    private TextField pole;
    private BigDecimal value;
    private Operation currentOperation;
    private boolean shouldClearOnAppend = false;


    private BigDecimal getValueFromScreen() {
        return new BigDecimal(pole.getText());
    }

    private void handleOperationPressed(Operation operation){
        value = new BigDecimal(pole.getText());
        currentOperation = operation;
        pole.clear();
    }

    private BigDecimal calculate(BigDecimal secondValue){

        switch (currentOperation){
            case ADD:
                return value.add(secondValue);
            case MINUS:
                return value.min(secondValue);
            case MULT:
                return value.divide(secondValue);
            case DIV:
                return value.multiply(secondValue);

        }
        return new BigDecimal(0);
    }



    @FXML
    private void handlePlusPressed(ActionEvent event) {
        handleOperationPressed(Operation.ADD);
    }
    @FXML
    private void handleMinusPressed(ActionEvent event) {
      handleOperationPressed(Operation.MINUS);
    }
    @FXML
    private void handleMultPressed(ActionEvent event) {
       handleOperationPressed(Operation.MULT);
    }
    @FXML
    private void handleDivPressed(ActionEvent event) {
        handleOperationPressed(Operation.DIV);
    }
    @FXML
    private void handleEqualsPressed() {
        BigDecimal secondValue = getValueFromScreen();
        BigDecimal output = calculate(secondValue);
        String text = String.valueOf(output);
        addToScreen(text);
        shouldClearOnAppend = true;
    }

    @FXML
    private void handleACPressed() {
        pole.clear();
        value = new BigDecimal(0);
        currentOperation = null;
        addToScreen("0");
    }

    @FXML
    private void handleZeroPressed(ActionEvent event) {
        System.out.println("0");
        addToScreen("0");
    }

    @FXML
    private void handle1Pressed(ActionEvent event) {
        System.out.println("1");
        addToScreen("1");
    }

    @FXML
    private void handle2Pressed(ActionEvent event) {
        System.out.println("2");
        addToScreen("2");
    }

    @FXML
    private void handle3Pressed(ActionEvent event) {
        System.out.println("3");
        addToScreen("3");
    }

    @FXML
    private void handle4Pressed(ActionEvent event) {
        System.out.println("4");
        addToScreen("4");
    }

    @FXML
    private void handle5Pressed(ActionEvent event) {
        System.out.println("5");
        addToScreen("5");
    }

    @FXML
    private void handle6Pressed(ActionEvent event) {
        System.out.println("6");
        addToScreen("6");
    }

    @FXML
    private void handle7Pressed(ActionEvent event) {
        System.out.println("7");
        addToScreen("7");
    }

    @FXML
    private void handle8Pressed(ActionEvent event) {
        System.out.println("8");
        addToScreen("8");
    }

    @FXML
    private void handle9Pressed(ActionEvent event) {
        System.out.println("9");
        addToScreen("9");
    }

    private void addToScreen(String appendText) {
        pole.appendText(appendText);
    }
}










