
package feesmanagementsystem;
import java.util.Scanner;
public class FeesManagementSystem {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("enter the fees for student 1 : ");
       double fees1=obj.nextDouble();
       College student1=new College(fees1);
       System.out.println("enter the fees for student 2 : ");
       double fees2=obj.nextDouble();
       College student2=new College(fees2);
       College.displayCollegeDetails();
       student1.registrationFees();
       student2.registrationFees();
    }
    
}
