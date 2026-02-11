
package LinkedList;

public class InsertionAndDeletion {
    Node head;
    
    void insert(int data)
    {
        Node n = new Node(data);
        
        if(head==null)
        {
            head = n;
         
        }
        else
        {
            Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next=n;  
        }
        
    }
    void delet(int key)
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        if(head.data==key)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=key)
        {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            System.out.println("key not found");
            return;
        }
        temp.next=temp.next.next;
    }
     void display()
     {
         Node temp= head;
         
         if(head==null)
         {
             System.out.println("List data is empty");
         }
         
         while(temp!=null)
         {
             System.out.print(temp.data+" ,");
             temp=temp.next;
         }
         System.out.println();
     }
}
