
package readnumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadNumbers {

    public static void main(String[] args) throws FileNotFoundException {
        int c = 0;
        File fi=new File("E://files//numberFile.txt");
        FileReader fr=new FileReader(fi);
        Scanner obj=new Scanner(fi);
        while(obj.hasNextLine())
        {
            String a=obj.nextLine();
            int b=Integer.parseInt(a);
            c+=b;
        }
        System.out.println("sum value : "+c);
    }
    
}
