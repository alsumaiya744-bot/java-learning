
package integerarraylist;

import java.util.ArrayList;

public class IntegerArrayList {
    
    
    static void sum(ArrayList<Integer> al)
    {
        int totalSum=0;
        for(Integer a:al)
        {
             totalSum=totalSum+a;
        }
        System.out.println("Sum of you entered number : "+totalSum); 
    }
}
