
package financemanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FinanceManagementController implements Initializable
{
    
    FinanceService service = new FinanceService();

    @FXML
    private Label lblAccount;
    @FXML
    private DatePicker dpStartDate;
    @FXML
    private DatePicker dpEndDate;
    @FXML
    private Label lblTotalSales;
    @FXML
    private Label lblTotalExpenses;
    @FXML
    private Label lblProfitOrLoss;
    @FXML
    private Label msgProfitOrLoss;
    @FXML
    private TableView<FinanceModel> tblFinance;
    @FXML
    private TableColumn<FinanceModel, String> colDate;
    @FXML
    private TableColumn<FinanceModel, String> colDetails;
    @FXML
    private TableColumn<FinanceModel, Double> colTotalSales;
    @FXML
    private TableColumn<FinanceModel, Double> colTotalExpenses;
    @FXML
    private TableColumn<FinanceModel, Double> colProfitOrLoss;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colDetails.setCellValueFactory(new PropertyValueFactory<>("details"));
        colTotalSales.setCellValueFactory(new PropertyValueFactory<>("totalSales"));
        colTotalExpenses.setCellValueFactory(new PropertyValueFactory<>("totalExpenses"));
        colProfitOrLoss.setCellValueFactory(new PropertyValueFactory<>("profitOrLoss"));

        loadLastMonth(); // show default card values
    }    

    @FXML
    private void btnHome(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/AdminMenu/AdminMenu.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    // APPLY BUTTON

    @FXML
    private void btnApply(ActionEvent event)
    {
             try {
            String start = dpStartDate.getValue().toString();
            String end = dpEndDate.getValue().toString();

            var list = service.getFinance(start, end);

            tblFinance.setItems(FXCollections.observableArrayList(list));

            double sales = service.getTotalSales(start, end);
            double expense = service.getTotalExpenses(start, end);

            double profit = service.calculateProfit(sales, expense);

            lblTotalSales.setText(String.valueOf(sales));
            lblTotalExpenses.setText(String.valueOf(expense));
            lblProfitOrLoss.setText(String.valueOf(profit));

            msgProfitOrLoss.setText(service.getProfitLabel(profit));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     // LOAD LAST MONTH DATA (CARDS)
    
      private void loadLastMonth()
    {
        try {
            double sales = service.getLastMonthSales();
            double expense = service.getLastMonthExpenses();

            double profit = service.calculateProfit(sales, expense);

            lblTotalSales.setText(String.valueOf(sales));
            lblTotalExpenses.setText(String.valueOf(expense));
            lblProfitOrLoss.setText(String.valueOf(profit));

            msgProfitOrLoss.setText(service.getProfitLabel(profit));

        } catch (Exception e) {}
    }


    
}
