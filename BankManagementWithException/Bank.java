
package bankmanagementwithexception;

public class Bank {
    protected double balance;

    public Bank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount)throws ArithmeticException
    {
        if(amount>balance)
        {
            throw new ArithmeticException("insufficient balance");
        }
        
            balance=balance-amount;
        
    }
    void checkBalance()
    {
        System.out.println("Balance : "+balance);
    }
}
