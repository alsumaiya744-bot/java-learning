/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FishManagement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ansar
 */
public class FishManagementController implements Initializable {
    
    FishService service = new FishService();
    String imagePath = "";

    @FXML
    private Label lblAccount;
    @FXML
    private ComboBox<String> cmbCategory;
    @FXML
    private TextField txtPrice;
    @FXML
    private Label lblQuantity;
    @FXML
    private ImageView imgPreview;
    @FXML
    private FlowPane flowCatalog;
    @FXML
    private TableView<FishModel> tblFish;
    @FXML
    private TableColumn<FishModel, String> colFishID;
    @FXML
    private TableColumn<FishModel, String> colFishName;
    @FXML
    private TableColumn<FishModel, String> colCategory;
    @FXML
    private TableColumn<FishModel, Double> colAveragePrice;
    @FXML
    private TableColumn<FishModel, Integer> colQuantity;
    @FXML
    private TableColumn<FishModel, String> colStorageType;
    @FXML
    private TableColumn<FishModel, String> colStockStatus;
    @FXML
    private TableColumn<FishModel, String> colDate;
    @FXML
    private ComboBox<String> cmbFishID;
    @FXML
    private ComboBox<String> cmbFishName;
    @FXML
    private Label lblImgName;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        cmbCategory.getItems().addAll("Fresh Water","Salt Water");
        
        try
        {

            cmbFishID.getItems().addAll(service.getFishIds());
            cmbFishName.getItems().addAll(service.getFishNames());

            // TABLE BINDING
            colFishID.setCellValueFactory(new PropertyValueFactory<>("fishId"));
            colFishName.setCellValueFactory(new PropertyValueFactory<>("fishName"));
            colCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
            colAveragePrice.setCellValueFactory(new PropertyValueFactory<>("averagePrice"));
            colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
            colStorageType.setCellValueFactory(new PropertyValueFactory<>("storageType"));
            colStockStatus.setCellValueFactory(new PropertyValueFactory<>("stockStatus"));
            colDate.setCellValueFactory(new PropertyValueFactory<>("date"));

            // COLOR
            colStockStatus.setCellFactory(column -> new TableCell<>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);

                    if (empty || item == null) {
                        setText(null);
                        setStyle("");
                    } else {
                        setText(item);

                        if (item.equals("OK"))
                            setStyle("-fx-background-color: lightgreen;");
                        else
                            setStyle("-fx-background-color: lightcoral;");
                    }
                }
            });

            loadAll();

        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }

        cmbFishID.setOnAction(e -> loadQuantity());
    }   
    
     // USER NAME
    public void setUsername(String name)
    {
        lblAccount.setText(name);
    }
    
     // LOAD QUANTITY
    private void loadQuantity()
    {
        try {
            int qty = service.getAllFish().stream()
                    .filter(f -> f.getFishId().equals(cmbFishID.getValue()))
                    .mapToInt(FishModel::getQuantity)
                    .findFirst().orElse(0);

            lblQuantity.setText(String.valueOf(qty));

        } catch (Exception e) {
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
    
      //  IMAGE

    @FXML
    private void btnChooseFile(ActionEvent event)
    {
        FileChooser fc = new FileChooser();
        File file = fc.showOpenDialog(null);

        if (file != null) {
            imagePath = file.getAbsolutePath();
            lblImgName.setText(file.getName());
            imgPreview.setImage(new Image(file.toURI().toString()));
        }
    }
    
     //  ADD

    @FXML
    private void btnAdd(ActionEvent event)
    {
         try {

            FishModel m = new FishModel(
                cmbFishID.getValue(),
                cmbFishName.getValue(),
                cmbCategory.getValue(),
                Double.parseDouble(txtPrice.getText()),
                Integer.parseInt(lblQuantity.getText()),
                "Cold Storage", // default
                "", "", imagePath
            );

            service.addFish(m);
            loadAll();

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

            FishModel m = new FishModel(
                cmbFishID.getValue(),
                cmbFishName.getValue(),
                cmbCategory.getValue(),
                Double.parseDouble(txtPrice.getText()),
                0,
                "Cold Storage",
                "", "", imagePath
            );

            service.updateFish(m);
            loadAll();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
     //DELETE

    @FXML
    private void btnDelete(ActionEvent event)
    {
        try {
            service.deleteFish(cmbFishID.getValue());
            loadAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     // LOAD ALL
    
     private void loadAll() throws Exception
     {

        var list = service.getAllFish();

        tblFish.getItems().setAll(list);

        flowCatalog.getChildren().clear();

        for (FishModel f : list)
        {

            VBox card = new VBox(10);
            card.setStyle("-fx-padding:10; -fx-border-color:gray; -fx-background-color:white;");

            ImageView img = new ImageView();

            if (f.getImagePath() != null)
                img.setImage(new Image(new File(f.getImagePath()).toURI().toString()));

            img.setFitHeight(80);
            img.setFitWidth(120);

            card.getChildren().addAll(
                img,
                new Label(f.getFishName()),
                new Label(f.getCategory())
            );

            flowCatalog.getChildren().add(card);
        }
    }
    
}
