package pl.sda.rafal.zientara.game.lesson2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pl.sda.rafal.zientara.game.lesson1.ttt.TTTGame;
import pl.sda.rafal.zientara.game.lesson1.ttt.TTTPosition;

public class TTTControler {


    @FXML
    private Button actionTopLeft;
    @FXML
    private Button actionTopCenter;
    @FXML
    private Button actionTopRight;
    @FXML
    private Button actionCenterLeft;
    @FXML
    private Button actionCenter;
    @FXML
    private Button actionCenterRight;
    @FXML
    private Button actionBottomCenter;
    @FXML
    private Button actionBottomLeft;
    @FXML
    private Button actionBottomRight;

    @FXML
    private void handleActionTopLeft() {
        performAction(new TTTPosition(0,0));

    }

    @FXML
    private void handleActionTopCenter() {
        performAction(new TTTPosition(0,1));

    }

    @FXML
    private void handleActionTopRight() {
        performAction(new TTTPosition(0,2));

    }

    @FXML
    private void handleActionCenterLeft() {
        performAction(new TTTPosition(1,0));

    }

    @FXML
    private void handleActionCenter() {
        performAction(new TTTPosition(1,1));

    }

    @FXML
    private void handleActionCenterRight() {
        performAction(new TTTPosition(1,2));

    }

    @FXML
    private void handleActionBottomCenter() {
        performAction(new TTTPosition(2,1));

    }

    @FXML
    private void handleActionBottomLeft() {
        performAction(new TTTPosition(2,0));

    }

    @FXML
    private void handleActionBottomRight() {
        performAction(new TTTPosition(2,2));

    }

    private TTTGame game;

    @FXML
    public void initialize() {
        System.out.println("hello");
    }

    private void performAction(TTTPosition position){
        game.action(position.column, position.row);
    }


}
