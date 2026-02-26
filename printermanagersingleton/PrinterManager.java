
package printermanagersingleton;

public class PrinterManager {
    private static PrinterManager printer;

    private  PrinterManager() {
        System.out.println("printer created");
    }
    public static PrinterManager getInstance()
    {
        if(printer==null)
        {
            printer=new PrinterManager();
        }
        return printer;
    }
    void print()
    {
        System.out.println("printing document");
    }
}
