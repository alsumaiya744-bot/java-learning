
package orderstatustracking;

public class OrderTrack {
    OrderStatus status;
    void showOrderStatus()
    {
        System.out.println("====== ORDER STATUS ======");
        for(OrderStatus order:OrderStatus.values())
        {
            System.out.println(order);
        }
    }
    void checkOrder(String order)
    {
        order=order.toUpperCase();
        status=OrderStatus.valueOf(order);
        if(status==status.PLACED)
        {
            System.out.println("your order is successfully placed");
        }
        else if(status==status.SHIPPED)
        {
            System.out.println("your order is shipped");
        }
        else if(status==status.DELIVERED)
        {
            System.out.println("your order is delivered successfully");
        }
        else if(status==status.CANCELLED)
        {
            System.out.println("sorry! your order is cancelled");
        }
        else
        {
            System.out.println("sorry! you entered status not in the list");
        }
    }
        
}
