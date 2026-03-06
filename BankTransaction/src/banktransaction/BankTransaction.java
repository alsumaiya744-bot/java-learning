
package banktransaction;

public class BankTransaction {
     int balance;

    public BankTransaction(int balance) {
        this.balance = balance;
    }
    
    int deposit(int amount)
    {
        balance=balance+amount;
        return balance;
    }
    int withdraw(int amount) throws IllegalArgumentException
    {
            if(balance<amount)
            {
                throw new IllegalArgumentException();
            }
            else
            {
                balance-=amount;
                return balance;
            }
        
    }
    int checkBalance()
    {
        return balance;
    }
}
