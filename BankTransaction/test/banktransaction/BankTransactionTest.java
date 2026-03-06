
package banktransaction;


import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class BankTransactionTest {
    int balance=5000;
    int amount;
    int depositBalance;
    int withdrawBalance;
    int afterBalance;
    
    public BankTransactionTest(int amount, int depositBalance, int withdrawBalance,int afterBalance) {
        
        this.amount = amount;
        this.depositBalance = depositBalance;
        this.withdrawBalance = withdrawBalance;
        this.afterBalance=afterBalance;
    }
    
    @Parameterized.Parameters
    public static Collection<Object []> balanceTest()
    {
        return Arrays.asList(new Object[][] {
        {2000,7000,3000,5000},{5000,10000,0,5000},{1000,6000,4000,5000}
        });
    }
    @Test
    public void depositTest()
    {
        BankTransaction bank=new BankTransaction(balance);
        assertEquals(depositBalance, bank.deposit(amount));
    }
    @Test
    public void withdrawTest() 
    {
        BankTransaction bank=new BankTransaction(balance);
        assertEquals(withdrawBalance, bank.withdraw(amount));
    }
    @Test
    public void balanceCheckTest()
    {
        BankTransaction bank=new BankTransaction(balance);
        assertEquals(afterBalance,bank.checkBalance());
    }
}
