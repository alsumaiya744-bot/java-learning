
package FishManagement;

public class FishModel
{
    private String fishId;
    private String fishName;
    private String category;
    private double averagePrice;
    private int quantity;
    private String storageType;
    private String stockStatus;
    private String date;
    private String imagePath;

    public FishModel() {
    }
    
    
    
     public FishModel(String fishId, String fishName, String category,
                     double averagePrice, int quantity,
                     String storageType, String stockStatus,
                     String date, String imagePath) {

        this.fishId = fishId;
        this.fishName = fishName;
        this.category = category;
        this.averagePrice = averagePrice;
        this.quantity = quantity;
        this.storageType = storageType;
        this.stockStatus = stockStatus;
        this.date = date;
        this.imagePath = imagePath;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
     
     

}
