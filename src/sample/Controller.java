package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import sample.classes.Stone;


public class Controller {
    //לטעון רשימת שמות
    String[] shapes;

    @FXML
    private TextField clientText;
    @FXML
    private ListView<Stone> stonesList;
    @FXML
    private Button okButton;
    @FXML
    private RadioButton cdgRadio,cdiorRadio,dgRadio;
    @FXML
    private HBox dgBox;
    @FXML
    private CheckBox shape;


    @FXML
    public void initialize(){

    }


    @FXML
    public void insertClient(ActionEvent e){
        String s=((ToggleButton)e.getSource()).getText();
        clientText.setText(s);
        checkCode();
    }

    @FXML
    public void checkCode(){
        okButton.setDisable((clientText.getText().length()>5)?false:true);
    }

    @FXML
    public void selectColor(){
        dgBox.setDisable(dgRadio.isSelected()?false:true);
    }
}
