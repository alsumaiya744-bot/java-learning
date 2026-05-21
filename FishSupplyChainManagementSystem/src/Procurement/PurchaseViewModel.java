
package Procurement;

public class PurchaseViewModel
{
    private String purchaseId, supplierId, fishType, date;
    private int quantity;
    private double weight, price;

    public PurchaseViewModel() {
    }
    
    

    public PurchaseViewModel(String purchaseId, String supplierId, String fishType,
                             int quantity, double weight, double price, String date)
    {
        this.purchaseId = purchaseId;
        this.supplierId = supplierId;
        this.fishType = fishType;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
