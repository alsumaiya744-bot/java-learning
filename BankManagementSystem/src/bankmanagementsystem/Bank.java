
package bankmanagementsystem;

public class Bank {
   static final String BANK_NAME="IOB bank";
   static final double INTEREST_RATE=7.5;
   static double calculateInterest(double principal,int year)
   {
       double interest=(principal*INTEREST_RATE*year)/100;
       return interest;
   }
   
}
