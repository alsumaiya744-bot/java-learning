
package stringoperations;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringOperationTest {
    String str;
    int length;
    String reverse;
    String uppercase;
    StringOperations so=new StringOperations();

    public StringOperationTest(String str, int length, String reverse, String uppercase) {
        this.str = str;
        this.length = length;
        this.reverse = reverse;
        this.uppercase = uppercase;
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> stringTest()
    {
        return Arrays.asList(new Object[][]{
            {"apple",5,"elppa","APPLE"},{"pineapple",9,"elppaenip","PINEAPPLE"},{"sumaiya",7,"ayiamus","SUMAIYA"}
        });
    }
    @Test
    public void stringLengthTest()
    {
        assertEquals(length,so.stringLength(str));
    }
    @Test
    public void stringReverseTest()
    {
        assertEquals(reverse,so.stringReverse(str));
    }
    @Test
    public void stringUppercaseTest()
    {
        assertEquals(uppercase, so.stringUpper(str));
    }
}
