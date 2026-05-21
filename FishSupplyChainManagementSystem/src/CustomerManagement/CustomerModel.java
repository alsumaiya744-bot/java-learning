
package CustomerManagement;

public class CustomerModel
{
    private String customerId;
    private String contactPerson;
    private String companyName;
    private String phone;
    private String location;
    private String paymentTerms;

    public CustomerModel()
    {
        
    }

    public CustomerModel(String customerId, String contactPerson,
                         String companyName, String phone,
                         String location, String paymentTerms)
    {

        this.customerId = customerId;
        this.contactPerson = contactPerson;
        this.companyName = companyName;
        this.phone = phone;
        this.location = location;
        this.paymentTerms = paymentTerms;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }
    
    
    
}
