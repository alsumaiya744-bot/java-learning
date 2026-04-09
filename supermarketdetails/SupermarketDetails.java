
package supermarketdetails;

import java.sql.SQLException;
import java.util.Scanner;

public class SupermarketDetails {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner obj=new Scanner(System.in);
        SupermarketService ss=new SupermarketService();
        boolean exit=false;
        do
        {
            System.out.println("1. create table for customer\n2. create table for order\n3.insert values into customer\n4. insert values into order\n5. display vlaues\n6. exit");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                    ss.createCustomerTable();
                    break;
                case 2:
                    ss.createOrderTable();
                    break;
                case 3:
                     System.out.println("enter customer id : ");
                     int customerID=obj.nextInt();
                     obj.nextLine();
                     System.out.println("enter customer name : ");
                     String customerName=obj.nextLine();
                     System.out.println("enter city name : ");
                     String city=obj.nextLine();
                     System.out.println("enter grade : ");
                     short grade=obj.nextShort();
                     System.out.println("enter salesman id : ");
                     int salesmanID=obj.nextInt();
                     CustomerModel cm=new CustomerModel(customerID, customerName, city, grade, salesmanID);
                     ss.insertCustomerValues(cm);
                     break;
                case 4 :
                    System.out.println("enter order number : ");
                    int orderNO=obj.nextInt();
                    System.out.println("enter purchase amount : ");
                    double purAmt=obj.nextDouble();
                    obj.nextLine();
                    System.out.println("enter order date : ");
                    String date=obj.nextLine();
                    System.out.println("enter customer id : ");
                    int customersID=obj.nextInt();
                    System.out.println("enter salesman id : ");
                    int salesmansID=obj.nextInt();
                    OrderModel or=new OrderModel(orderNO, purAmt, date, customersID, salesmansID);
                    ss.insertOrderValues(or);
                    break;
                case 5:
                    System.out.println("enter minimum range : ");
                    int min=obj.nextInt();
                    System.out.println("enter maximum range : ");
                    int max=obj.nextInt();
                    ss.displayValues(min, max);
                    break;
                case 6:
                    System.out.println("Thank You");
                    exit=true;
                    break;
                default :
                    System.out.println("invalid choice");
                    
            }
        }while(!exit);
    }
    
}
