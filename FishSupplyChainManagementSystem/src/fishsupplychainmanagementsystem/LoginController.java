/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package fishsupplychainmanagementsystem;

import java.io.IOException;
import java.net.URL;
import javafx.util.Duration;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    
    @FXML
    private PasswordField password;
    @FXML
    private ComboBox<String> role;
    @FXML
    private Label message;
    @FXML
    private TextField userName;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        role.getItems().addAll("Admin");
}    

    @FXML
    private void login(ActionEvent event) 
    {
        String enteredUsername = userName.getText();
        String enteredPassword = password.getText();
        String enteredRole = role.getValue();

        if (enteredUsername.isEmpty() || enteredPassword.isEmpty() || enteredRole == null) {
            message.setText("Please fill all fields");
            return;
        }

        try 
        {
            LoginService service = new LoginService();

            LoginModel user = service.getUser(enteredUsername);

            if (user == null) {
                message.setText("User not found");
                return;
            }

        if (enteredPassword.equals(user.getPassword()) &&
            enteredRole.equals(user.getRole())) 
        {

            message.setText("Login Successful");

            PauseTransition pause = new PauseTransition(Duration.seconds(2));
            pause.setOnFinished(e -> {
                try 
                {
                    String page = enteredRole.equals("Admin") ? "/AdminMenu/AdminMenu.fxml" : "/shop.fxml";
                    Parent root = FXMLLoader.load(getClass().getResource(page));
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(new Scene(root));
                } 
                catch (Exception ex) 
                {
                    ex.printStackTrace();
                }
            });
            pause.play();

        } 
        else 
        {
            message.setText("Incorrect Password or Role");
        }

       } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }

    @FXML
    private void reset(ActionEvent event)
    {
        String username = userName.getText();

        if (username.isEmpty()) {
            message.setText("Enter username to delete");
            return;
        }

        try {
            LoginService service = new LoginService();

            service.deleteUser(username);

            message.setText("Data Cleared Successfully");

            // ⏳ WAIT 2 SECONDS → GO TO CREATE ACCOUNT
            PauseTransition pause = new PauseTransition(Duration.seconds(2));

            pause.setOnFinished(e -> {
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("/createaccount/CreateAccount.fxml"));
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(new Scene(root));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });

        pause.play();

       } 
       catch (Exception e) 
       {
        e.printStackTrace();
        message.setText("Error deleting data");
       }
    }

    @FXML
    private void createAccount(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/createaccount/CreateAccount.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    

    

    
}
