
package genericcalculator;

public class Calculator<I extends Number>{
   
    
    
    void addDouble(I a,I b)
    {
        System.out.println("Result : "+(a.doubleValue()+b.doubleValue()));
    }
    void subDouble(I a,I b)
    {
         System.out.println("Result : "+(a.doubleValue()-b.doubleValue()));
    }
    void addInt(I a,I b)
    {
        System.out.println("Result : "+(a.intValue()+b.intValue()));
    }
    void subInt(I a,I b)
    {
         System.out.println("Result : "+(a.intValue()-b.intValue()));
    }
}
