/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package createaccount;

import java.net.URL;
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
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author ansar
 */
public class CreateAccountController implements Initializable {

    @FXML
    private PasswordField txtConfirmPassword;
    @FXML
    private ComboBox<String> cmbRole;
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private TextField txtMobileNo;
    @FXML
    private Label lblMessage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbRole.getItems().addAll("Admin");
    }    

    @FXML
    private void btnCreateAccount(ActionEvent event)
    {
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        String confirm = txtConfirmPassword.getText();
        String role = cmbRole.getValue();
        String mobile = txtMobileNo.getText();

    // 🔴 VALIDATION
    if (username.isEmpty() || password.isEmpty() || confirm.isEmpty() || role == null) {
        lblMessage.setText("Please fill all fields");
        return;
    }

    if (!password.equals(confirm)) {
        lblMessage.setText("Password does not match");
        return;
    }

    try {
        // ✅ MODEL
        UserInputModel user = new UserInputModel(username, password, role, mobile);

        // ✅ SERVICE
        UserService service = new UserService();
        service.createAccount(user);

        // ✅ UI MESSAGE
        lblMessage.setText("Account Created Successfully");

        // ⏳ WAIT 2 SEC → GO TO LOGIN
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(e -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/fishsupplychainmanagementsystem/Login.fxml"));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        pause.play();

    } catch (Exception e) {
        e.printStackTrace();
        lblMessage.setText("Error creating account or try with new user name");
    }
    }
    
}
