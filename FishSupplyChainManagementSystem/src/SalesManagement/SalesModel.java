
package SalesManagement;

public class SalesModel
{
    private String orderId;
    private String customerId;
    private String customerName;
    private String fishId;
    private String fishName;
    private int quantity;
    private double pricePerUnit;
    private double totalPrice;
    private String date;
    private String invoiceId;
    private String invoiceStatus;
    private String deliveryStatus;

    public SalesModel() {
    }
    
    

    public SalesModel(String orderId, String customerId, String customerName,
                      String fishId, String fishName, int quantity,
                      double pricePerUnit, double totalPrice, String date,
                      String invoiceId, String invoiceStatus, String deliveryStatus)
    {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.fishId = fishId;
        this.fishName = fishName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.totalPrice = totalPrice;
        this.date = date;
        this.invoiceId = invoiceId;
        this.invoiceStatus = invoiceStatus;
        this.deliveryStatus = deliveryStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFishId() {
        return fishId;
    }

    public void setFishId(String fishId) {
        this.fishId = fishId;
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    
    

    
}
