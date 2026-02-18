
package printersystem;

public class CanonPrinter extends Thread implements Printer{
    
    @Override
    public void run()
    {
        print();
    }
    @Override
    public void print() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ex) {
            System.getLogger(CanonPrinter.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        System.out.println("Canon printer printing.........");
    }
    
}
