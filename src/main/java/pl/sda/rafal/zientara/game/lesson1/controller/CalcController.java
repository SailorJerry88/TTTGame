package pl.sda.rafal.zientara.game.lesson1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

public class CalcController {


    @FXML
    private TextField pole;
    private int value;
    private Operation currentOperation;


    @FXML
    private void handlePlusPressed(ActionEvent event) {
        value = Integer.parseInt(pole.getText());
        currentOperation = Operation.ADD;
        pole.setText(null);
    }


    @FXML
    private void handleZeroPressed(ActionEvent event) {
        System.out.println("0");
        pole.appendText("0");
    }

    @FXML
    private void handle1Pressed(ActionEvent event) {
        System.out.println("1");
        pole.appendText("1");
    }

    @FXML
    private void handle2Pressed(ActionEvent event) {
        System.out.println("2");
        pole.appendText("2");
    }

    @FXML
    private void handle3Pressed(ActionEvent event) {
        System.out.println("3");
        pole.appendText("3");
    }

    @FXML
    private void handle4Pressed(ActionEvent event) {
        System.out.println("4");
        pole.appendText("4");
    }

    @FXML
    private void handle5Pressed(ActionEvent event) {
        System.out.println("5");
        pole.appendText("5");
    }

    @FXML
    private void handle6Pressed(ActionEvent event) {
        System.out.println("6");
        pole.appendText("6");
    }

    @FXML
    private void handle7Pressed(ActionEvent event) {
        System.out.println("7");
        pole.appendText("7");
    }

    @FXML
    private void handle8Pressed(ActionEvent event) {
        System.out.println("8");
        pole.appendText("8");
    }

    @FXML
    private void handle9Pressed(ActionEvent event) {
        System.out.println("9");
        pole.appendText("9");
    }


}





