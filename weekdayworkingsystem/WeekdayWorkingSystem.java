
package weekdayworkingsystem;

import java.util.Scanner;

public class WeekdayWorkingSystem {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       DaysDetails dd=new DaysDetails();
       boolean exit=false;
       do
       {
           System.out.println("========= MENU =========");
           System.out.print("1. check if day is working day\n2. check day is weekend\n3. display all days\n4. exit\n");
           System.out.println("=========================");
           System.out.println("enter your choice : ");
           int choice=obj.nextInt();
           obj.nextLine();
           switch(choice)
           {
               case 1:
                   System.out.println("enter the name of day : ");
                   String dayName=obj.nextLine();
                   dd.checkWeekdays(dayName);
                   break;
               case 2:
                   System.out.println("enter the name of day : ");
                   String dayNam=obj.nextLine();
                   dd.checkWeekendDays(dayNam);
                   break;
               case 3:
                   dd.display();
                   break;
               case 4:
                   System.out.println("Thank You");
                   exit=true;
                   break;
               default:
                   System.out.println("invalid choice");
           }
       }while(!exit);
    }
    
}
