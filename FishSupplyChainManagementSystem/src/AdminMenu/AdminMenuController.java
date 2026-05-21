
package AdminMenu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AdminMenuController implements Initializable
{
    
      AdminService service = new AdminService();

    @FXML
    private Label lblAccount;
    @FXML
    private PieChart pieChart;
    @FXML
    private Label lblTotalFishPurchased;
    @FXML
    private Label lblTotalFishPurchasedToday;
    @FXML
    private Label lblTotalExpense;
    @FXML
    private Label lblTotalExpenseToday;
    @FXML
    private Label lblTotalSales;
    @FXML
    private Label lblTotalSalesToday;
    @FXML
    private Label lblNetProfit;
    @FXML
    private Label lblNetProfitToday;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
        loadCards();
        loadPieChart();
        
    }    
    
     //  LOAD CARDS
    
    private void loadCards()
    {
        try {
            double totalFish = service.getTotalFish();
            double todayFish = service.getTodayFish();

            double totalExpense = service.getTotalExpense();
            double todayExpense = service.getTodayExpense();

            double totalSales = service.getTotalSales();
            double todaySales = service.getTodaySales();

            double netProfit = service.getNetProfit();
            double todayProfit = service.getTodayProfit();

            lblTotalFishPurchased.setText(String.valueOf(totalFish));
            lblTotalFishPurchasedToday.setText(String.valueOf(todayFish));

            lblTotalExpense.setText(String.valueOf(totalExpense));
            lblTotalExpenseToday.setText(String.valueOf(todayExpense));

            lblTotalSales.setText(String.valueOf(totalSales));
            lblTotalSalesToday.setText(String.valueOf(todaySales));

            lblNetProfit.setText(String.valueOf(netProfit));
            lblNetProfitToday.setText(String.valueOf(todayProfit));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //  LOAD PIE CHART
    
     private void loadPieChart()
    {
        try {
            ObservableList<PieChart.Data> list = FXCollections.observableArrayList();

            for (DashboardModel m : service.getPieChartData())
            {
                list.add(new PieChart.Data(m.getLabel(), m.getValue()));
            }

            pieChart.setData(list);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void btnProcurement(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/procurement/Procurement.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void btnFishManagement(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/FishManagement/FishManagement.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void btnCustomer(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/CustomerManagement/CustomerManagement.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void btnSales(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/SalesManagement/SalesManagement.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void btnDelivery(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/deliveryandvehiclemanagement/DeliveryAndVehicleManagement.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void btnWorker(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/workermanagement/WorkerManagement.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void btnFinance(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/financemanagement/FinanceManagement.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void btnExpense(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("/expensemanagement/ExpenseManagement.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    
}
