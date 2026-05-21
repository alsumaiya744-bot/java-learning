/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Procurement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.scene.control.cell.PropertyValueFactory;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ansar
 */
public class ProcurementController implements Initializable {

    @FXML
    private Label lblAccount;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtPhone;
    @FXML
    private ComboBox<String> cmbLocation;
    @FXML
    private RadioButton rbPaid;
    @FXML
    private RadioButton rbPending;
    @FXML
    private TextField txtPurchaseID;
    @FXML
    private ComboBox<String> cmbSupplierID;
    @FXML
    private TextField txtFishType;
    @FXML
    private TextField txtQuantity;
    @FXML
    private TextField txtWeight;
    @FXML
    private TextField txtUnitPrice;
    @FXML
    private Label lblTotalPrice;
    @FXML
    private RadioButton rbCash;
    @FXML
    private RadioButton rbOnline;
    @FXML
    private TableColumn<SupplierViewModel, String> colSupplierID;
    @FXML
    private TableColumn<SupplierViewModel, String> colName;
    @FXML
    private TableColumn<SupplierViewModel, String> colPhoneNo;
    @FXML
    private TableColumn<PurchaseViewModel,String> colPurchaseID;
    @FXML
    private TableColumn<PurchaseViewModel,String> colFishType;
    @FXML
    private TableColumn<PurchaseViewModel,Integer> colQuantity;
    @FXML
    private TableColumn<PurchaseViewModel,Double> colWeight;
    @FXML
    private TableColumn<PurchaseViewModel,Double> colPrice;
    @FXML
    private TableColumn<PurchaseViewModel,String> colDate;
    @FXML
    private TableView<SupplierViewModel> tblSupplier;
    @FXML
    private TableView<PurchaseViewModel> tblPurchase;
    @FXML
    private TableColumn<PurchaseViewModel,String> colSupplierID_P;
    
    ProcurementService service=new ProcurementService();
    @FXML
    private TableColumn<SupplierViewModel, String> colLocation;
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        cmbLocation.getItems().addAll(
        "Chennai",
        "Madurai",
        "Tuticorin",
        "Rameswaram",
        "Nagapattinam"
        );

        cmbLocation.setValue("Chennai");
        
        //  Radio Button Groups
        ToggleGroup paymentGroup = new ToggleGroup();
        rbPaid.setToggleGroup(paymentGroup);
        rbPending.setToggleGroup(paymentGroup);

        ToggleGroup methodGroup = new ToggleGroup();
        rbCash.setToggleGroup(methodGroup);
        rbOnline.setToggleGroup(methodGroup);

        //  Table Bindings (IMPORTANT)
        colSupplierID.setCellValueFactory(new PropertyValueFactory<>("supplierId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colPhoneNo.setCellValueFactory(new PropertyValueFactory<>("phone"));
        colLocation.setCellValueFactory(new PropertyValueFactory<>("location"));

        colPurchaseID.setCellValueFactory(new PropertyValueFactory<>("purchaseId"));
        colSupplierID_P.setCellValueFactory(new PropertyValueFactory<>("supplierId"));
        colFishType.setCellValueFactory(new PropertyValueFactory<>("fishType"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colWeight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));

        try {
            loadSuppliers();
            loadSupplierIDs();
            loadPurchases();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
     // ================= USER =================

    public void setUsername(String username) 
    {
        lblAccount.setText(username);
    }

    
    
    @FXML
    private void btnHome(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/AdminMenu/AdminMenu.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    // ================= SUPPLIER =================
    
    @FXML
    private void btnAdd(ActionEvent event) 
    {
        try {
            if (txtName.getText().isEmpty() || txtPhone.getText().isEmpty()||cmbLocation.getValue()==null) {
                showAlert("Please fill all supplier fields");
                return;
            }

            SupplierInputModel model = new SupplierInputModel(
                    txtName.getText(),
                    txtPhone.getText(),
                    cmbLocation.getValue(),
                    rbPaid.isSelected() ? "Paid" : "Pending"
            );

            service.addSupplier(model);

            loadSuppliers();
            loadSupplierIDs();
            clearSupplierFields();

            showAlert("Supplier Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnUpdate(ActionEvent event) 
    {
         try 
         {
            service.updateSupplierByPhone(txtPhone.getText(),
                    new SupplierInputModel(
                            txtName.getText(),
                            txtPhone.getText(),
                            cmbLocation.getValue(),
                            rbPaid.isSelected() ? "Paid" : "Pending"
                    ));

            loadSuppliers();
            showAlert("Updated Successfully");

        } 
         catch (Exception e) 
         {
            e.printStackTrace();
         }
    }

    @FXML
    private void btnDelete(ActionEvent event)
    {
         try 
         {
            service.deleteSupplierByPhone(txtPhone.getText());

            loadSuppliers();
            loadSupplierIDs();
            clearSupplierFields();

            showAlert("Deleted Successfully");

        } 
         catch (Exception e) 
         {
            e.printStackTrace();
         }
    }
    
     private void loadSuppliers() throws Exception 
     {
        tblSupplier.setItems(FXCollections.observableArrayList(service.getSuppliers()));
     }

    private void loadSupplierIDs() throws Exception
    {
        cmbSupplierID.setItems(FXCollections.observableArrayList(service.getSupplierIds()));
    }

    private void clearSupplierFields()
    {
        txtName.clear();
        txtPhone.clear();
        cmbLocation.setValue(null);
    }
    // ================= PURCHASE =================

    @FXML
    private void btnCalculate(ActionEvent event)
    {
        try 
        {
            int qty = Integer.parseInt(txtQuantity.getText());
            double price = Double.parseDouble(txtUnitPrice.getText());

            double total = service.calculateTotal(qty, price);
            lblTotalPrice.setText(String.valueOf(total));

        } 
        catch (Exception e) 
        {
            showAlert("Enter valid numbers");
        }
    }

    @FXML
    private void btnSavePurchase(ActionEvent event)
    {
        try
        {
            if (txtPurchaseID.getText().isEmpty()) {
                showAlert("Enter Purchase ID");
                return;
            }

            PurchaseInputModel model = new PurchaseInputModel(
                    txtPurchaseID.getText(),
                    cmbSupplierID.getValue(),
                    txtFishType.getText(),
                    Integer.parseInt(txtQuantity.getText()),
                    Double.parseDouble(txtWeight.getText()),
                    Double.parseDouble(txtUnitPrice.getText()),
                    Double.parseDouble(lblTotalPrice.getText()),
                    rbCash.isSelected() ? "Cash" : "Online"
            );

            service.addPurchase(model);

            loadPurchases();
            clearPurchaseFields();

            showAlert("Purchase Saved");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnClear(ActionEvent event) 
    {
         try
         {
            service.deletePurchase(txtPurchaseID.getText());

            loadPurchases();
            clearPurchaseFields();

            showAlert("Purchase Deleted");

        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private void loadPurchases() throws Exception 
    {
        tblPurchase.setItems(FXCollections.observableArrayList(service.getPurchases()));
    }

    private void clearPurchaseFields()
    {
        txtPurchaseID.clear();
        txtFishType.clear();
        txtQuantity.clear();
        txtWeight.clear();
        txtUnitPrice.clear();
        lblTotalPrice.setText("");
    }
     // ================= ALERT =================
    
    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(msg);
        alert.show();
    }
    
}
