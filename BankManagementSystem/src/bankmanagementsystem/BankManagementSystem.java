
package bankmanagementsystem;
import java.util.Scanner;
public class BankManagementSystem {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter the principal amount : ");
        double principalAmount=obj.nextDouble();
        System.out.println("enter the year : ");
        int year=obj.nextInt();
        double interest=Bank.calculateInterest(principalAmount, year);
        System.out.println("interest rate : "+interest);
    }
    
}
