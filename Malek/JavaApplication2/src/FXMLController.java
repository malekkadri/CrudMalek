/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import com.sun.jdi.connect.spi.Connection;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import users.Users;

/**
 * FXML Controller class
 *
 * @author Malik
 */
public class FXMLController implements Initializable {

    @FXML
    private TextField tfid;
    @FXML
    private TextField tflogin;
    @FXML
    private TextField tfemail;
    @FXML
    private TextField tfpassword;
    @FXML
    private TextField tfname;
    @FXML
    private TextField tfsurname;
    @FXML
    private Button btninsert;
    @FXML
    private Button btnupdate;
    @FXML
    private Button btndelete;
    @FXML
    private TableView<Users> tvusers;
    @FXML
    private TableColumn<Users, Integer> colid;
    @FXML
    private TableColumn<Users, String> collogin;
    @FXML
    private TableColumn<Users, String> coldemail;
    @FXML
    private TableColumn<Users, String> coldpassword;
    @FXML
    private TableColumn<Users, String> colname;
    @FXML
    private TableColumn<Users, String> colsurname;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tflogin(ActionEvent event) {
    }

    @FXML
    private void tfemain(ActionEvent event) {
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
   
    }
        