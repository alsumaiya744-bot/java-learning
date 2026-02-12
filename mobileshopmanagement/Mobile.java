
package mobileshopmanagement;

public class Mobile {
    int mobileID;
    String brandName;
    double price;
    Mobile next;
    public Mobile(int mobileID, String brandName, double price) {
        this.mobileID = mobileID;
        this.brandName = brandName;
        this.price = price;
    }
    
}
