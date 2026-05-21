
package Procurement;

public class SupplierViewModel
{
    private String supplierId, name, phone, location;

    public SupplierViewModel() {
    }

    public SupplierViewModel(String supplierId, String name, String phone, String location) {
        this.supplierId = supplierId;
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    
}
