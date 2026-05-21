
package workermanagement;

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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class WorkerManagementController implements Initializable
{
    WorkerService service = new WorkerService();

    @FXML
    private Label lblAccont;
    @FXML
    private TextField txtWorkerName;
    @FXML
    private ComboBox<String> cmbRole;
    @FXML
    private TableView<WorkerModel> tblWorker;
    @FXML
    private TableColumn<WorkerModel, String> colWorkerID;
    @FXML
    private TableColumn<WorkerModel, String> colName;
    @FXML
    private TableColumn<WorkerModel, String> colRole;
    @FXML
    private TableColumn<WorkerModel, String> colAttendance;
    @FXML
    private TableColumn<WorkerModel, Double> colSalary;
    @FXML
    private ComboBox<String> cmbWorkerId;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
            colWorkerID.setCellValueFactory(new PropertyValueFactory<>("workerId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colRole.setCellValueFactory(new PropertyValueFactory<>("role"));
        colAttendance.setCellValueFactory(new PropertyValueFactory<>("attendance"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        cmbRole.setItems(FXCollections.observableArrayList("Loader","Packer","Driver"));

        loadData();
    }

    
    

    private void loadData() {
        try {
            tblWorker.setItems(FXCollections.observableArrayList(service.getWorkers()));
            cmbWorkerId.setItems(FXCollections.observableArrayList(service.getWorkerIds()));
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
    
     // REGISTER

    @FXML
    private void btnRegisterWorker(ActionEvent event)
    {
            try {

            if (txtWorkerName.getText().isEmpty() || cmbRole.getValue() == null) {
                System.out.println("Enter all fields!");
                return;
            }

            String id = service.generateWorkerId();

            WorkerModel m = new WorkerModel(
                    id,
                    txtWorkerName.getText(),
                    cmbRole.getValue(),
                    "Absent",
                    0
            );

            service.registerWorker(m);
            loadData();

            txtWorkerName.clear();
            cmbRole.setValue(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // UPDATE

    @FXML
    private void btnUpdate(ActionEvent event)
    {
         try {

            if (cmbWorkerId.getValue() == null) {
                System.out.println("Select Worker ID");
                return;
            }

            WorkerModel m = new WorkerModel(
                    cmbWorkerId.getValue(),
                    txtWorkerName.getText(),
                    cmbRole.getValue(),
                    null,
                    0
            );

            service.updateWorker(m);
            loadData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     // DELETE

    @FXML
    private void btnDelete(ActionEvent event)
    {
          try {

            if (cmbWorkerId.getValue() == null) {
                System.out.println("Select Worker ID");
                return;
            }

            service.deleteWorker(cmbWorkerId.getValue());
            loadData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
      // ATTENDANCE BUTTON

    @FXML
    private void attendanceButton(ActionEvent event)
    {
         try {

            if (cmbWorkerId.getValue() == null) {
                System.out.println("Select Worker ID");
                return;
            }

            service.markAttendance(cmbWorkerId.getValue());
            loadData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
}
