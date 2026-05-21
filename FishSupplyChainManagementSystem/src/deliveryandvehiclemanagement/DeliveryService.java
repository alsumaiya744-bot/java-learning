
package deliveryandvehiclemanagement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DeliveryService
{
    
    DeliveryDAO dao = new DeliveryDAO();

    public String generateDeliveryId()
    {
        return "DEL-" + System.currentTimeMillis();
    }

    public String getCurrentTime()
    {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(f);
    }

    public void assignVehicle(DeliveryModel m) throws Exception
    {
        dao.insertDelivery(m);
    }

    public void updateDelivery(DeliveryModel m) throws Exception
    {
        dao.updateDelivery(m);
    }

    public void deleteDelivery(String id) throws Exception
    {
        dao.deleteDelivery(id);
    }

    public List<String> getInvoiceIds() throws Exception
    {
        return dao.getInvoiceIds();
    }

    public List<DeliveryModel> getDeliveries() throws Exception
    {
        return dao.getDeliveries();
    }
    
    public List<String> getDeliveryIds() throws Exception
    {
            return dao.getDeliveryIds();
        }
    
}
