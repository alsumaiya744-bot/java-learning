
package printermanagersingleton;

public class PrinterManagerSingleton {

    public static void main(String[] args) {
        PrinterManager p1=PrinterManager.getInstance();
        PrinterManager p2=PrinterManager.getInstance();
        p1.print();
        p2.print();
        System.out.println(p1==p2);
    }
    
}
