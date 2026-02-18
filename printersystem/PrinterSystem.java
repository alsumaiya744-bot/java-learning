
package printersystem;

public class PrinterSystem {

    public static void main(String[] args) {
        HPPrinter hp=new HPPrinter();
        CanonPrinter canon=new CanonPrinter();
        hp.start();
        canon.start();
    }
    
}
