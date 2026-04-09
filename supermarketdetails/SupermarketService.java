
package supermarketdetails;

import java.sql.SQLException;

public class SupermarketService {
   private boolean cusCreate=false;
   private boolean orCreate=false;
    void createCustomerTable() throws ClassNotFoundException, SQLException
    {
        SupermarketDAO sd=new SupermarketDAO();
        
        if(!cusCreate)
        {
            sd.createCustomerTable();
            cusCreate=true;
        }
        else
        {
            System.out.println("table is already created so skipped....");
        }
    }
    void createOrderTable() throws ClassNotFoundException, SQLException
    {
        SupermarketDAO sd=new SupermarketDAO();
        
        if(!orCreate)
        {
            sd.createOrderTable();
            orCreate=true;
        }
        else
        {
            System.out.println("table is already created so skipped....");
        }
    }
    void insertCustomerValues(CustomerModel sm) throws ClassNotFoundException, SQLException
    {
        SupermarketDAO sd=new SupermarketDAO();
        int result=sd.insertCustomerValues(sm);
        if(result>0)
        {
            System.out.println("valuse in customer table inserted successfully");
        }
        else
        {
            System.out.println("try again");
        }
    }
    void insertOrderValues(OrderModel om) throws ClassNotFoundException, SQLException
    {
        SupermarketDAO sd=new SupermarketDAO();
        int result=sd.insertOrderValues(om);
        if(result>0)
        {
            System.out.println("valuse in customer table inserted successfully");
        }
        else
        {
            System.out.println("try again");
        }
    }
    void displayValues(int min,int max) throws ClassNotFoundException, SQLException
    {
        SupermarketDAO sd=new SupermarketDAO();
        sd.displayValues(min, max);
        
    }
    
}
