
package CustomerManagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class CustomerManagementController implements Initializable {
    
    CustomerService service = new CustomerService();


    @FXML
    private Label lblAccount;
    @FXML
    private TextField txtCustomerId;
    @FXML
    private TextField txtContactPerson;
    @FXML
    private TextArea AreaCompanyName;
    @FXML
    private TextField txtPhoneNumber;
    @FXML
    private ComboBox<String> cmbLocation;
    @FXML
    private ComboBox<String> cmbPaymentTerms;
    @FXML
    private TableView<CustomerModel> tblCustomer;
    @FXML
    private TableColumn<CustomerModel, String> colCustomerID;
    @FXML
    private TableColumn<CustomerModel, String> colContactPerson;
    @FXML
    private TableColumn<CustomerModel, String> colCompanyName;
    @FXML
    private TableColumn<CustomerModel, String> colPhoneNo;
    @FXML
    private TableColumn<CustomerModel, String> colLocation;
    @FXML
    private TableColumn<CustomerModel, String> colPayTerms;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
         cmbLocation.getItems().addAll("Chennai","Madurai","Trichy","Salem");
         cmbPaymentTerms.getItems().addAll("Cash","Credit","UPI");

        // TABLE BINDING
        colCustomerID.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        colContactPerson.setCellValueFactory(new PropertyValueFactory<>("contactPerson"));
        colCompanyName.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        colPhoneNo.setCellValueFactory(new PropertyValueFactory<>("phone"));
        colLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        colPayTerms.setCellValueFactory(new PropertyValueFactory<>("paymentTerms"));

        loadCustomers();
        
    }    
    
     // LOAD
    private void loadCustomers()
    {
        try
        {
            tblCustomer.setItems(FXCollections.observableArrayList(service.getCustomers()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnHome(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/AdminMenu/AdminMenu.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    
     // ADD

    @FXML
    private void btnAdd(ActionEvent event)
    {
        try
        {
            CustomerModel m = new CustomerModel(
                txtCustomerId.getText(),
                txtContactPerson.getText(),
                AreaCompanyName.getText(),
                txtPhoneNumber.getText(),
                cmbLocation.getValue(),
                cmbPaymentTerms.getValue()
            );

            service.addCustomer(m);
            loadCustomers();
            clearFields();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
     // UPDATE

    @FXML
    private void btnUpdate(ActionEvent event)
    {
        try {
            CustomerModel m = new CustomerModel(
                txtCustomerId.getText(),
                txtContactPerson.getText(),
                AreaCompanyName.getText(),
                txtPhoneNumber.getText(),
                cmbLocation.getValue(),
                cmbPaymentTerms.getValue()
            );

            service.updateCustomer(m);
            loadCustomers();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     // DELETE

    @FXML
    private void btnDelete(ActionEvent event)
    {
        try
        {
            service.deleteCustomer(txtCustomerId.getText());
            loadCustomers();
            clearFields();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    private void clearFields()
    {
        txtCustomerId.clear();
        txtContactPerson.clear();
        AreaCompanyName.clear();
        txtPhoneNumber.clear();
        cmbLocation.setValue(null);
        cmbPaymentTerms.setValue(null);
    }

    
 }
    

