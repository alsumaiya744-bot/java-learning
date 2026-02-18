
package onlinepaymentsystem;

import java.util.Scanner;

public class OnlinePaymentSystem {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("------ Welcome to UPI payment ------");
        System.out.println("enter the amount to pay : ");
        double UPIAmount=obj.nextDouble();
        System.out.println("------ Welcome to Card payment ------");
        System.out.println("enter the amount to pay : ");
        double CardAmount=obj.nextDouble();
        UPIpayment upi=new UPIpayment(UPIAmount);
        CardPayment card=new CardPayment(CardAmount);
        Thread th1=new Thread(upi);
        Thread th2=new Thread(card);
        th1.start();
        th2.start();
    }
    
}
