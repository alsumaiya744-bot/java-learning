
package SalesManagement;

import java.util.List;

public class SalesService
{
    
    
     SalesDAO dao = new SalesDAO();

    public void createOrder(SalesModel m) throws Exception
    {
        m.setFishId(dao.getFishId(m.getFishName()));
        dao.insertOrder(m);
    }

    public void updateOrder(String id, int qty, double price) throws Exception
    {
        double total = qty * price;
        dao.updateOrder(id, qty, price, total);
    }

    public void deleteOrder(String id) throws Exception
    {
        dao.deleteOrder(id);
    }

    public void generateInvoice(String orderId) throws Exception
    {
        String invoiceId = dao.generateNextInvoiceId();
    dao.updateInvoice(orderId, invoiceId);
    }

    public List<String> getCustomerIds() throws Exception
    {
        return dao.getCustomerIds();
    }

    public String getCustomerName(String id) throws Exception
    {
        return dao.getCustomerName(id);
    }

    public List<String> getFishNames() throws Exception
    {
        return dao.getFishNames();
    }

    public List<SalesModel> getOrders() throws Exception
    {
        return dao.getOrders();
    }
 }
