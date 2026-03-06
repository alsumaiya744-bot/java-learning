
package banktransaction;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExceptionTranscactionTest {
    
    
    @Test(expected =IllegalArgumentException.class)
    public void exceptiuonWithdrawTest()
    {
        BankTransaction bank=new BankTransaction(900);
        int res=bank.withdraw(1000);
        assertEquals(1000, res);
    }   
}
