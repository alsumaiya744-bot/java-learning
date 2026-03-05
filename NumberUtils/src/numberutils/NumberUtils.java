
package numberutils;

public class NumberUtils {
    int factorial(int n)
    {
        if(n!=0)
        {
            return n *factorial(n-1);
           
        }
        return 1;
    }
    boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
            
        }
         return true;
    }
}
