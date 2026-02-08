package shoppingcartapplication;

public class ShoppingCart {
    Product head;
    void insertProduct(int productID,String productName)
    {
        Product newProduct=new Product(productID, productName, head);
        if(head==null)
        {
            head=newProduct;
        }
        else
        {
            Product temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newProduct;
        }
    }
    void display()
    {
        Product temp=head;
        if(head==null)
        {
            System.out.println("There is no item in the cart");
        }
        while(temp!=null)
        {
            System.out.println("Product ID : "+temp.productID);
            System.out.println("Product Name : "+temp.productName);
            temp=temp.next;
        }
            
    }
}
