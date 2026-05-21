/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package deliveryandvehiclemanagement;

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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class DeliveryAndVehicleManagementController implements Initializable
{
    
    DeliveryService service=new DeliveryService();

    @FXML
    private Label lblAccount;
    @FXML
    private ComboBox<String> cmbVehicleNumber;
    @FXML
    private ComboBox<String> cmbDriverName;
    @FXML
    private ComboBox<String> cmbFuelType;
    @FXML
    private ComboBox<String> cmbCapacity;
    @FXML
    private ComboBox<String> cmbInvoice;
    @FXML
    private ComboBox<String> cmbDeliveryLocation;
    @FXML
    private ComboBox<String> cmbDeliveryStatus;
    @FXML
    private TableView<DeliveryModel> tblDelivery;
    @FXML
    private TableColumn<DeliveryModel, String> colDeliveryID;
    @FXML
    private TableColumn<DeliveryModel, String> colInvoiceID;
    @FXML
    private TableColumn<DeliveryModel, String> colVehicleNo;
    @FXML
    private TableColumn<DeliveryModel, String> colDriver;
    @FXML
    private TableColumn<DeliveryModel, String> colFuelType;
    @FXML
    private TableColumn<DeliveryModel, String> colCapacity;
    @FXML
    private TableColumn<DeliveryModel, String> colLocation;
    @FXML
    private TableColumn<DeliveryModel, String> colDispatchTime;
    @FXML
    private TableColumn<DeliveryModel, String> colStatus;
    @FXML
    private TableColumn<DeliveryModel, String> colViewMap;
    @FXML
    private ComboBox<String> cmbDeliveryId;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
         colDeliveryID.setCellValueFactory(new PropertyValueFactory<>("deliveryId"));
        colInvoiceID.setCellValueFactory(new PropertyValueFactory<>("invoiceId"));
        colVehicleNo.setCellValueFactory(new PropertyValueFactory<>("vehicleNo"));
        colDriver.setCellValueFactory(new PropertyValueFactory<>("driverName"));
        colFuelType.setCellValueFactory(new PropertyValueFactory<>("fuelType"));
        colCapacity.setCellValueFactory(new PropertyValueFactory<>("capacity"));
        colLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        colDispatchTime.setCellValueFactory(new PropertyValueFactory<>("dispatchTime"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        try {
            cmbInvoice.setItems(FXCollections.observableArrayList(service.getInvoiceIds()));
            loadTable();
        } catch (Exception e) { e.printStackTrace(); }

        cmbVehicleNumber.setItems(FXCollections.observableArrayList("TN01A1234","TN02B5678"));
        cmbDriverName.setItems(FXCollections.observableArrayList("John","Arun","Kavi"));
        cmbFuelType.setItems(FXCollections.observableArrayList("Diesel","Petrol"));
        cmbCapacity.setItems(FXCollections.observableArrayList("500kg","1000kg"));
        cmbDeliveryLocation.setItems(FXCollections.observableArrayList("Chennai","Trichy","Madurai"));
        cmbDeliveryStatus.setItems(FXCollections.observableArrayList("Pending","In Transit","Delivered"));
        try {
        cmbDeliveryId.setItems(
            FXCollections.observableArrayList(service.getDeliveryIds())
        );
    } catch (Exception e) {
        e.printStackTrace();
    }

        addMapButton();
        
    }    

    @FXML
    private void btnHome(ActionEvent event) throws IOException
    {
        
        Parent root = FXMLLoader.load(getClass().getResource("/AdminMenu/AdminMenu.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    
     // ASSIGN VEHICLE

    @FXML
    private void btnAssignVehicle(ActionEvent event)
    {
        
         try {
        DeliveryModel m = new DeliveryModel(
            service.generateDeliveryId(),
            cmbInvoice.getValue(),
            cmbVehicleNumber.getValue(),
            cmbDriverName.getValue(),
            cmbFuelType.getValue(),
            cmbCapacity.getValue(),
            cmbDeliveryLocation.getValue(),
            service.getCurrentTime(),
            cmbDeliveryStatus.getValue()
        );

        service.assignVehicle(m);
        loadTable();
            try {
        cmbDeliveryId.setItems(
            FXCollections.observableArrayList(service.getDeliveryIds())
        );
    } catch (Exception e) {
        e.printStackTrace();
    }

    } catch (Exception e) { e.printStackTrace(); }
    }
    
    // ✅ UPDATE 

    @FXML
    private void btnUpdate(ActionEvent event)
    {
             try {
        String id = cmbDeliveryId.getValue(); // ✅ from combo

        if (id == null) return;

        DeliveryModel m = new DeliveryModel(
            id, // ✅ IMPORTANT
            cmbInvoice.getValue(),
            cmbVehicleNumber.getValue(),
            cmbDriverName.getValue(),
            cmbFuelType.getValue(),
            cmbCapacity.getValue(),
            cmbDeliveryLocation.getValue(),
            service.getCurrentTime(),
            cmbDeliveryStatus.getValue()
        );

        service.updateDelivery(m);
        loadTable();
            try {
    cmbDeliveryId.setItems(
        FXCollections.observableArrayList(service.getDeliveryIds())
    );
} catch (Exception e) {
    e.printStackTrace();
}

    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    @FXML
    private void btnDelete(ActionEvent event)
    {
            try {
        String id = cmbDeliveryId.getValue(); // ✅ from combo

        if (id != null)
        {
            service.deleteDelivery(id);
            loadTable();
                try {
    cmbDeliveryId.setItems(
        FXCollections.observableArrayList(service.getDeliveryIds())
    );
} catch (Exception e) {
    e.printStackTrace();
}
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
     // VIEW MAP BUTTON
    
         private void addMapButton()
    {
        TableColumn<DeliveryModel, Void> colMap = new TableColumn<>("View Map");

        colMap.setCellFactory(param -> new TableCell<>()
        {
            private final Button btn = new Button("View Map");

            {
                btn.setOnAction(e ->
                {
                    DeliveryModel data = getTableView().getItems().get(getIndex());
                    openMap(data.getLocation());
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty)
            {
                super.updateItem(item, empty);
                setGraphic(empty ? null : btn);
            }
        });

        tblDelivery.getColumns().add(colMap);
    }

    private void openMap(String location)
    {
        try {
            String url = "https://www.google.com/maps/search/?api=1&query="
                    + location.replace(" ", "%20");

            java.awt.Desktop.getDesktop().browse(new java.net.URI(url));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // =========================================================
    private void loadTable() throws Exception
    {
        tblDelivery.setItems(FXCollections.observableArrayList(service.getDeliveries()));
    }

    
    
}
