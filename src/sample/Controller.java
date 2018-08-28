package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import sample.classes.Stone;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    //לטעון רשימת שמות
    String[] shapes={"R" , "CU" , "CCR" , "SQ" , "SQEM" , "EM" , "REC" , "TRI", "PR", "HT" , "OTH", " "};

    private List<Stone> list;

    @FXML
    private TextField clientText,clientRef,perCarat,total;
    @FXML
    private ListView<Stone> stonesList;
    @FXML
    private Button okButton;
    @FXML
    private RadioButton cdgRadio,cdiorRadio,dgRadio;
    @FXML
    private HBox dgBox;
    @FXML
    private ChoiceBox shape;


    @FXML
    public void initialize(){
        shape.getItems().addAll(shapes);
        Stone s1=new Stone("dudu","R","DG",1000,1000,1,false,false);
        Stone s2=new Stone("test","R","DG",2000,2000,1,false,false);

        list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        stonesList.getItems().setAll(list);
        stonesList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }


    @FXML
    public void insertClient(ActionEvent e){
        String s=((ToggleButton)e.getSource()).getText();
        clientText.setText(s);
        checkCode();
    }

    @FXML
    public void clikList(){
        Stone s = (Stone)stonesList.getSelectionModel().getSelectedItems();
    }

    @FXML
    public void checkCode(){
        okButton.setDisable(clientText.getText().length() <= 5);
    }

    @FXML
    public void addStone(){
        clientRef.setText("");
        perCarat.setText("");
        total.setText("");
        shape.setValue(" ");


    }


}
