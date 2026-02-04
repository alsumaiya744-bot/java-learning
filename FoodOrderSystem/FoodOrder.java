package FoodOrderSystem;
public class FoodOrder extends Customer implements Order {
    String foodName;
    double price;

    public FoodOrder(String customerName,String foodName,double price) {
        super(customerName);
        this.foodName=foodName;
        this.price=price;
    }

    @Override
    public void placeOreder() {
        System.out.println("Order placed successfully");
    }

    @Override
    public void showBill() {
        System.out.println("Bill Amount of "+foodName+" : "+price);
    }
    
}
