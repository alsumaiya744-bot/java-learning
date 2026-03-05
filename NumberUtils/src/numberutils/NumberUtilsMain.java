
package numberutils;

public class NumberUtilsMain {

    
    public static void main(String[] args) {
       
            
        NumberUtils num=new NumberUtils();
        int res=num.factorial(5);
        System.out.println(res);
        boolean r=num.isPrime(121);
        System.out.println(r);
    }
    
}
