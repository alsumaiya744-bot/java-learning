
package Procurement;

import java.util.List;

public class ProcurementService
{
     ProcurementDAO dao = new ProcurementDAO();

    public double calculateTotal(int qty, double price)
    {
        return qty * price;
    }

    // SUPPLIER
    public void addSupplier(SupplierInputModel m) throws Exception
    {
        dao.insertSupplier(m);
    }

    public void updateSupplierByPhone(String phone, SupplierInputModel m) throws Exception
    {
        dao.updateSupplierByPhone(phone, m);
    }

    public void deleteSupplierByPhone(String phone) throws Exception
    {
        dao.deleteSupplierByPhone(phone);
    }

    public List<SupplierViewModel> getSuppliers() throws Exception
    {
        return dao.getSuppliers();
    }

    public List<String> getSupplierIds() throws Exception
    {
        return dao.getSupplierIds();
    }

    // PURCHASE
    public void addPurchase(PurchaseInputModel m) throws Exception
    {
        dao.insertPurchase(m);
    }

    public void deletePurchase(String id) throws Exception
    {
        dao.deletePurchase(id);
    }

    public List<PurchaseViewModel> getPurchases() throws Exception
    {
        return dao.getPurchases();
    }
}
