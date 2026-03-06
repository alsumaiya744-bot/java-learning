
package stringoperations;

import java.util.Arrays;

public class StringOperations {
    int stringLength(String str)
    {
        int length=str.length();
        return length;
    }
    String stringReverse(String str)
    {
       StringBuilder sb=new StringBuilder(str);
       sb.reverse();
       return sb.toString();
    }
    String stringUpper(String str)
    {
        String upStr=str.toUpperCase();
        return upStr;
    }
}
