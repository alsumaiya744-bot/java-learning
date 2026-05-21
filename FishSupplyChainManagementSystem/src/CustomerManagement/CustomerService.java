
package CustomerManagement;

import java.util.List;

public class CustomerService
{
    
     CustomerDAO dao = new CustomerDAO();

    public void addCustomer(CustomerModel m) throws Exception
    {
        dao.insertCustomer(m);
    }

    public void updateCustomer(CustomerModel m) throws Exception
    {
        dao.updateCustomer(m);
    }

    public void deleteCustomer(String id) throws Exception
    {
        dao.deleteCustomer(id);
    }

    public List<CustomerModel> getCustomers() throws Exception
    {
        return dao.getCustomers();
    }

    public List<String> getCustomerIds() throws Exception
    {
        return dao.getCustomerIds();
    }
    
}
