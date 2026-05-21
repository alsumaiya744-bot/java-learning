
package Procurement;

public class PurchaseInputModel 
{
    private String purchaseId, supplierId, fishType, paymentMethod;
    private int quantity;
    private double weight, unitPrice, totalPrice;

    public PurchaseInputModel() {
    }
    
    

    public PurchaseInputModel(String purchaseId, String supplierId, String fishType,
                              int quantity, double weight,
                              double unitPrice, double totalPrice,
                              String paymentMethod)
    {

        this.purchaseId = purchaseId;
        this.supplierId = supplierId;
        this.fishType = fishType;
        this.quantity = quantity;
        this.weight = weight;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
}
