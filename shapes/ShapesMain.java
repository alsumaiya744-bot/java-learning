package shapes;
import java.util.Scanner;
class ShapesMain {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       boolean exit=false;
       do
       {
           System.out.println("---------- Student Area Calculator ----------");
           System.out.print("1. calculate circle area\n2. calculate square area\n3. exit\n");
           System.out.print("enter your choice : ");
           byte choice=obj.nextByte();
           switch(choice)
           {
               case 1:
                   System.out.print("enter the radius value of cicle : ");
                   double radius=obj.nextDouble();
                   CircleArea circle=new CircleArea(radius);
                   circle.calculateArea();
                   break;
               case 2:
                   System.out.print("enter the side value of square : ");
                   double side=obj.nextDouble();
                   SquareArea square=new SquareArea(side);
                   square.calculateArea();
                   break;
               case 3:
                   System.out.println("Thank You");
                   exit=true;
                   break;
               default:
                   System.out.println("invalid choice");
           }
       }while(!exit);   
    }
  
}
