
package expensemanagement;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ExpenseManagementController implements Initializable
{
    ExpenseService service = new ExpenseService();

    @FXML
    private Label lblAccount;
    @FXML
    private ComboBox<String> cmbExpenseType;
    @FXML
    private TextField txtAmount;
    @FXML
    private TextField txtPaidTo;
    @FXML
    private TextField txtNotes;
    @FXML
    private TableView<ExpenseModel> tblExpense;
    @FXML
    private TableColumn<ExpenseModel, String> colExpenseID;
    @FXML
    private TableColumn<ExpenseModel, String> colExpenseType;
    @FXML
    private TableColumn<ExpenseModel, Double> colAmount;
    @FXML
    private TableColumn<ExpenseModel, String> colPaidTo;
    @FXML
    private TableColumn<ExpenseModel, String> colDate;
    @FXML
    private TextField txtExpenseId;
    @FXML
    private DatePicker dpDate;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        cmbExpenseType.getItems().addAll("Electricity","Fuel","Ice","Water","Salary","Fish Purchase","Others");
         colExpenseID.setCellValueFactory(new PropertyValueFactory<>("expenseId"));
        colExpenseType.setCellValueFactory(new PropertyValueFactory<>("expenseType"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colPaidTo.setCellValueFactory(new PropertyValueFactory<>("paidTo"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));

        loadTable();

        generateId();
    }    
    
     private void generateId()
    {
        try {
            txtExpenseId.setText(service.generateExpenseId());
        } catch (Exception e) {}
    }

    private void loadTable()
    {
        try {
            tblExpense.setItems(FXCollections.observableArrayList(service.getExpenses()));
        } catch (Exception e) {}
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
        
         try {
            ExpenseModel m = new ExpenseModel(
                txtExpenseId.getText(),
                cmbExpenseType.getValue(),
                Double.parseDouble(txtAmount.getText()),
                txtPaidTo.getText(),
                dpDate.getValue().toString(),
                txtNotes.getText()
            );

            service.addExpense(m);

            loadTable();
            generateId();

            txtAmount.clear();
            txtPaidTo.clear();
            txtNotes.clear();

        } catch (Exception e) { e.printStackTrace(); }
    }
    
      // UPDATE

    @FXML
    private void btnUpdate(ActionEvent event)
    {
         try {
            ExpenseModel m = new ExpenseModel(
                txtExpenseId.getText(),
                cmbExpenseType.getValue(),
                Double.parseDouble(txtAmount.getText()),
                txtPaidTo.getText(),
                dpDate.getValue().toString(),
                txtNotes.getText()
            );

            service.updateExpense(m);
            loadTable();

        } catch (Exception e) {}
        
    }
    
    // DELETE

    @FXML
    private void btnDelete(ActionEvent event)
    {
        
        try {
            service.deleteExpense(txtExpenseId.getText());
            loadTable();
            generateId();
        } catch (Exception e) {}
    }
    
    
}
