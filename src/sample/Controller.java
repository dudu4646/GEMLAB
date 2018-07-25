package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import sample.classes.Stone;


public class Controller {
    @FXML
    private TextField clientText;
    @FXML
    private ListView<Stone> stonesList;


    @FXML
    public void insertClient(ActionEvent e){
        String s=((ToggleButton)e.getSource()).getText();
        clientText.setText(s);
    }
}
