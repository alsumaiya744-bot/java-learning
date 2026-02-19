
package shoppingcartmanagement;

import java.util.Scanner;

public class ShoppingCart {
    Scanner obj=new Scanner(System.in);
   final String cartOwnerName;

    public ShoppingCart(String cartOwnerName) {
        this.cartOwnerName = cartOwnerName;
    }
   
   class Item
   {
       String itemName;
       double price;
       int quantity;
       double bill;
       double priceHistory[];
       void addItems(String name,int quant)
       {
           itemName=name;
           
           quantity=quant;
       }
       void updatePrice(int update)
       {
           
           int updates=update;
           priceHistory =new double[updates];
           for(int i=0;i<priceHistory.length;i++)
           {
               System.out.println("enter price update "+(i+1)+" :");
               priceHistory[i]=obj.nextDouble();
           }
           price=(priceHistory.length)-1;
       }
       void calculteBill()
       {
           bill=price*quantity;
       }
       void displayCartDetails()
       {
           System.out.println("Cart owner : "+cartOwnerName);
           System.out.println("Item Name : "+itemName);
           System.out.print("Price History : ");
           for(double s:priceHistory)
           {
               System.out.print(s+" ,");
           }
           System.out.println("Latest price : "+price);
           System.out.println("--------------------------------");
           System.out.println("Total Bill : "+bill);
       }
   }
   
}
