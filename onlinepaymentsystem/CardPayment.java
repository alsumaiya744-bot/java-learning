
package onlinepaymentsystem;

public class CardPayment extends Payment  {
    double amount;

    public CardPayment(double amount) {
        this.amount = amount;
    }
    
    @Override
    public void run() {
        System.out.println("Card payment of "+amount+" is completed");
    }
    
}
