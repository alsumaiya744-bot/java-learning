
package randomnumber;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
    int count;
    Random r=new Random();
    int generateNum=r.nextInt(100)+1;
    void numberGuessing()
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100 :  ");
        int guessNum=obj.nextInt();
        if(count<=10)
        {
            if(guessNum==generateNum)
            {
                System.out.println("correct! you own");
                System.out.println("number of attempt taken is "+count);
                return;
            }
            else if (guessNum>generateNum)
            {
                System.out.println("Your guess is too high");
                ++count;
                numberGuessing();
            }
            else if(guessNum<generateNum)
            {
                System.out.println("Your guess is too low");
                ++count;
                numberGuessing();
            }
            else
            {
                System.out.println("invalid guess");
            }
        }
        else
        {
            System.out.println("maximum attempt is 10");
        }  
    }
}
