package shoppingcartapplication;

public class Product {
    int productID;
    String productName;
    Product next;

    public Product(int productID, String productName, Product next) {
        this.productID = productID;
        this.productName = productName;
    }
    
}
