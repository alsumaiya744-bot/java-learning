
package arrayutils;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayUtilsTest {
    
    @BeforeClass
    public static void beforeAll()
    {
        System.out.println("Testing start.....");
    }
    @Before
    public void beforeEach()
    {
        System.out.println("Unit test start");
    }
    @Test
    public void maxTest()
    {
        ArrayUtils arr=new ArrayUtils();
        int a[]={1,30,80,100,10};
        int res=arr.findMax(a);
        Assert.assertEquals(100, res);
    }
    @Test
    public void minTest()
    {
        ArrayUtils arr=new ArrayUtils();
        int a[]={1,30,80,100,10};
        int res=arr.findMin(a);
        Assert.assertEquals(1, res);
    }
    @After
    public void afterEach()
    {
        System.out.println("Unit test end");
    }
    @AfterClass
    public static void afterAll()
    {
        System.out.println("Testing end.");
    }
}
