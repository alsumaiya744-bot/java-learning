
package supermarketdetails;

public class CustomerModel {
    private int cusdomerID;
    private String customerName;
    private String city;
    private short grade;
    private int salesmanID;
    public CustomerModel()
    {
        
    }

    public CustomerModel(int cusdomerID, String customerName, String city, short grade, int salesmanID) {
        this.cusdomerID = cusdomerID;
        this.customerName = customerName;
        this.city = city;
        this.grade = grade;
        this.salesmanID = salesmanID;
    }

    public int getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        this.salesmanID = salesmanID;
    }

    public int getCusdomerID() {
        return cusdomerID;
    }

    public void setCusdomerID(int cusdomerID) {
        this.cusdomerID = cusdomerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public short getGrade() {
        return grade;
    }

    public void setGrade(short grade) {
        this.grade = grade;
    }
    
    
}
