/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ArithmeticOperationSceneController implements Initializable {

    @FXML
    private TextField xTextField;
    @FXML
    private TextField yTextField;
    @FXML
    private Label resultLabel;
    @FXML
    private Button addButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addButtonOnMouseClicked(MouseEvent event) {
       String xStr= xTextField.getText(); //"12"
       String yStr= yTextField.getText(); //"13"
       int xVal=Integer.parseInt(xStr);
       int yVal=Integer.parseInt(yStr);
       
       int sum= xVal+yVal;
       //resultLabel.setText(sum);
       String resultStr=Integer.toString(sum);
       resultLabel.setText(resultStr);
       
       
       
    }

    @FXML
    private void subtractButtonOnMouseClicked(ActionEvent event) {
       resultLabel.setText(
              " X-Y = "
               +
              Integer.toString(
                      Integer.parseInt(
                         xTextField.getText()
                      )
                      -
                      Integer.parseInt(
                          yTextField.getText()
                              
                      )
              )
               
       );
               
                              
               
               
        
    }

    @FXML
    private void multiplyButtonOnMouseClicked(MouseEvent event) {
        resultLabel.setText(
              " X*Y = "
               +
              Integer.toString(
                      Integer.parseInt(
                         xTextField.getText()
                      )
                      *
                      Integer.parseInt(
                          yTextField.getText()
                              
                      )
              )
               
       );
    }

    @FXML
    private void addButtonOnMouseExited(MouseEvent event) {
    }

    @FXML
    private void addButtonOnMouseEntered(MouseEvent event) {
    }
    
}

