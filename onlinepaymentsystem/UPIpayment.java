
package onlinepaymentsystem;

public class UPIpayment extends Payment {
    double amount;

    public UPIpayment(double amount) {
        this.amount = amount;
    }
    
    @Override
    public void run() {
        System.out.println("UPI payment of "+amount+" is completed");
    }
    
}
