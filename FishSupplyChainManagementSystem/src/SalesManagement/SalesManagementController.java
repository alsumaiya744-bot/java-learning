
package SalesManagement;

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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class SalesManagementController implements Initializable
{
    
    SalesService service=new SalesService();

    @FXML
    private Label lblAccount;
    @FXML
    private TextField txtPricePerUnit;
    @FXML
    private Spinner<Integer> spnQuantity;
    @FXML
    private TextField txtOrderId;
    @FXML
    private Label lblTotalPrice;
    @FXML
    private ComboBox<String> cmbFishType;
    @FXML
    private TableView<SalesModel> tblOrder;
    @FXML
    private TableColumn<SalesModel, String> colOrderID;
    @FXML
    private TableColumn<SalesModel, String> colCustomerName;
    @FXML
    private TableColumn<SalesModel, String> colFishType;
    @FXML
    private TableColumn<SalesModel, Integer> colQuantity;
    @FXML
    private TableColumn<SalesModel, Double> colPricePerUnit;
    @FXML
    private TableColumn<SalesModel, Double> colTotalPrice;
    @FXML
    private TableColumn<SalesModel, String> colOrderDate;
    @FXML
    private TableColumn<SalesModel, String> colDeliveryStatus;
    @FXML
    private TableColumn<SalesModel, String> colInvoiceStatus;
    @FXML
    private DatePicker dpDate;
    @FXML
    private ComboBox<String> cmbCustomerID;
    @FXML
    private Label lblCustomerName;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
                spnQuantity.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 1000, 1));

        // TABLE BINDING
        colOrderID.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        colCustomerName.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        colFishType.setCellValueFactory(new PropertyValueFactory<>("fishName"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colPricePerUnit.setCellValueFactory(new PropertyValueFactory<>("pricePerUnit"));
        colTotalPrice.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        colOrderDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colDeliveryStatus.setCellValueFactory(new PropertyValueFactory<>("deliveryStatus"));
        colInvoiceStatus.setCellValueFactory(new PropertyValueFactory<>("invoiceStatus"));

        try {
            cmbCustomerID.setItems(FXCollections.observableArrayList(service.getCustomerIds()));
            cmbFishType.setItems(FXCollections.observableArrayList(service.getFishNames()));
            loadTable();
        } catch (Exception e) { e.printStackTrace(); }

        cmbCustomerID.setOnAction(e -> {
            try {
                lblCustomerName.setText(service.getCustomerName(cmbCustomerID.getValue()));
            } catch (Exception ex) {}
        });

        spnQuantity.valueProperty().addListener((obs, o, n) -> calculate());
        txtPricePerUnit.textProperty().addListener((obs, o, n) -> calculate());
    }

    private void calculate()
    {
        try {
            int qty = spnQuantity.getValue();
            double price = Double.parseDouble(txtPricePerUnit.getText());
            lblTotalPrice.setText(String.valueOf(qty * price));
        } catch (Exception e) {}
    }

    @FXML
    private void btnCreateOrder(ActionEvent event)
    {
        try {
            System.out.println("Button clicked");

            String date = (dpDate.getValue() != null)
                    ? dpDate.getValue().toString()
                    : "2026-01-01";

            double total = lblTotalPrice.getText().isEmpty()
                    ? 0
                    : Double.parseDouble(lblTotalPrice.getText());

            SalesModel m = new SalesModel(
                txtOrderId.getText(),
                cmbCustomerID.getValue(),
                lblCustomerName.getText(),
                null,
                cmbFishType.getValue(),
                spnQuantity.getValue(),
                Double.parseDouble(txtPricePerUnit.getText()),
                total,
                date,
                null,
                "Generate Invoice",
                "Pending"
            );

            service.createOrder(m);
            loadTable();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnGenerateInvoice(ActionEvent event)
    {
        try {
            service.generateInvoice(txtOrderId.getText());
            loadTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnUpdate(ActionEvent event)
    {
        try {
            service.updateOrder(
                txtOrderId.getText(),
                spnQuantity.getValue(),
                Double.parseDouble(txtPricePerUnit.getText())
            );
            loadTable();
        } catch (Exception e) {}
    }

    @FXML
    private void btnDelete(ActionEvent event)
    {
        try {
            service.deleteOrder(txtOrderId.getText());
            loadTable();
        } catch (Exception e) {}
    }

    private void loadTable() throws Exception
    {
        tblOrder.getItems().clear();
        tblOrder.setItems(FXCollections.observableArrayList(service.getOrders()));
    }

    @FXML
    private void btnHome(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/AdminMenu/AdminMenu.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
   }
    

