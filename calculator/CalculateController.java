/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package calculator;

import java.awt.DisplayMode;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ansar
 */
public class CalculateController implements Initializable {

    @FXML
    private TextField txtResult;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private double num1=0;
    private String operator="";
    
    @FXML
    private void handleClick(ActionEvent event)
    {
        String value=((javafx.scene.control.Button)event.getSource()).getText();
        
        if(value.matches("[0-9]"))
        {
            txtResult.setText(txtResult.getText()+value);
        }
        
        else if(value.matches("[+\\-*/]"))
        {
           num1=Double.parseDouble(txtResult.getText());
           operator=value;
           txtResult.clear();
        }
        
        else if(value.equals("="))
        {
            double num2=Double.parseDouble(txtResult.getText());
            double result=0;
            switch(operator)
            {
                case "+":
                    result=num1+num2;
                    break;
                case "-":
                    result=num1-num2;
                    break;
                case "*":
                    result=num1*num2;
                    break;
                case "/":
                    result=num1/num2;
                    break;
            }
            txtResult.setText(String.valueOf(result));
        }
        else if(value.equals("c"))
        {
            txtResult.clear();
        }
                
    }
    
}
