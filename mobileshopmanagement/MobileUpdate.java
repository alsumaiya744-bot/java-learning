
package mobileshopmanagement;

public class MobileUpdate {
    Mobile head;
    void insertAtHead(int mobileID,String mobileName,double price)
    {
        Mobile newMobile=new Mobile(mobileID, mobileName, price);
        if(head==null)
        {
            head=newMobile;
        }
        else
        {
            newMobile.next=head;
            head=newMobile;
        }
    }
    void insertAtTail(int mobileID,String mobileName,double price)
    {
        Mobile newMobile=new Mobile(mobileID, mobileName, price);
        Mobile temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newMobile;
    }
    void display()
    {
        Mobile temp=head;
        boolean latest=true;
        if(head==null)
        {
            System.out.println("There is no mobile on the stock");
            return;
        }
        while(temp!=null)
        {
            
            if(latest)
           {
                System.out.println("-------- LATEST VERSION --------");
                System.out.println("Mobile ID : "+temp.mobileID);
                System.out.println("Brand Name : "+temp.brandName);
                System.out.println("Price : Rs. "+temp.price);
                 temp=temp.next;
                 latest=false;
            }
            
            
                System.out.println("-------- UPDATE VERSION --------");
                System.out.println("Mobile ID : "+temp.mobileID);
                System.out.println("Brand Name : "+temp.brandName);
                System.out.println("Price : Rs. "+temp.price);
            
            temp=temp.next;
        }
    }
}
