
package numberutils;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumberUtilsTest {
    
    @BeforeClass
    public static void beforeAll()
    {
        System.out.println("Testing start..,");
    }
    @Before
    public void beforeEach()
    {
        System.out.println("unit test start");
    }
    @Test
    public void factorialTest()
    {
        NumberUtils num=new NumberUtils();
        int res=num.factorial(5);
        Assert.assertEquals(120, res);
    }
    @Test
    public void primeTrueTest()
    {
        NumberUtils num=new NumberUtils();
        boolean res=num.isPrime(3);
        Assert.assertTrue(res);
    }
    @Test
    public void primeFalseTest()
    {
        NumberUtils num=new NumberUtils();
        boolean res=num.isPrime(10);
        Assert.assertFalse(res);
    }
    @After 
    public void afterEach()
    {
        System.out.println("unit test start");
    }
    @AfterClass
    public static void afterAll()
    {
        System.out.println("Testing end..,");
    }
}
