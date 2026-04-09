
package supermarketdetails;

public class OrderModel {
    private int orderID;
    private double purchaseAmount;
    private String orderDate;
    private int customerID;
    private int salesmanID;

    public OrderModel() {
    }

    public OrderModel(int orderID, double purchaseAmount, String orderDate, int customerID, int salesmanID) {
        this.orderID = orderID;
        this.purchaseAmount = purchaseAmount;
        this.orderDate = orderDate;
        this.customerID = customerID;
        this.salesmanID = salesmanID;
    }

    public int getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        this.salesmanID = salesmanID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
}
