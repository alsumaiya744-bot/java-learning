
package rockpaperscissorgame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGameMain {

    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        Random r=new Random();
        RockPaperScissor rrr=new RockPaperScissor();
        int num=r.nextInt(3);
        String com=null;
        String predict=null;
        boolean exit=false;
        do
        {
            System.out.print("1. Rock\n2. paper\n3. scissor\n4. exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                    com="rock";
                    predict=rrr.game(num);
                    
                    break;
                case 2:
                    com="paper";
                    predict=rrr.game(num);
                    break;
                case 3:
                    com="scissor";
                    predict=rrr.game(num);
                    break;
                case 4:
                    System.out.println("Thank You");
                    exit=true;
                    break;
                default:
                    System.out.println("invalid choice");
            }
            try 
            {
                if(choice!=4)
                {
                    if(com.equalsIgnoreCase(predict))
                    {
                        System.out.println("Draw");
                    }
                    else if(((com.equalsIgnoreCase("rock"))&&(predict.equalsIgnoreCase("scissor")))||((com.equalsIgnoreCase("scissor"))&&(predict.equalsIgnoreCase("paper")))||((com.equalsIgnoreCase("paper"))&&((predict.equalsIgnoreCase("rock")))))
                    {
                        System.out.println("user win");
                    }
                    else
                    {
                        System.out.println("computer wins");
                    }
                }
            }
            catch(NullPointerException e)
            {
                System.out.println(e.getMessage());
            }
                
        }while(!exit);
       
        
    }
    
}
