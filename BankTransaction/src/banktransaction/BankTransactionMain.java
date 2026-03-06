
package banktransaction;

import java.util.Scanner;

public class BankTransactionMain {

    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
         System.out.println("========= WELCOME TO BANK =========");
         System.out.println("enter your balance : ");
         int balance=obj.nextInt();
         BankTransaction bank=new BankTransaction(balance);
         boolean exit=false;
         do
         {
             System.out.print("1. Deposit Amount\n2. Withdraw Amount\n3. Check balnce\n4. Exit\n");
             System.out.println("enter your choice : ");
             int choice=obj.nextInt();
             switch(choice)
             {
                 case 1:
                     System.out.println("enter the amount to deposit : ");
                     int depAmount=obj.nextInt();
                     int balanceAfterDeposit=bank.deposit(depAmount);
                     break;
                 case 2:
                     System.out.println("enter the amount to withdraw : ");
                     int withAmount=obj.nextInt();
                     int balanceAfterWithdraw=bank.withdraw(withAmount);
                     break;
                 case 3:
                     int checkedBalance=bank.checkBalance();
                     System.out.println("your current balance : "+checkedBalance);
                     break;
                 case 4:
                     System.out.println("Thank You");
                     exit=true;
                     break;
                 default:
                     System.out.println("Invalid Choice");
             }
         }while(!exit);
    }
    
}
