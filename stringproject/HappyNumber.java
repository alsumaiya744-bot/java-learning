
package stringproject;
import java.util.HashSet;
import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        while (num != 1 && !set.contains(num)) {
            set.add(num);
            num = sumOfSquares(num);
        }

        if (num == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
    }

    public static int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
    

