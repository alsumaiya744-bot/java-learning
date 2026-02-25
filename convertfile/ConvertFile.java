
package convertfile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConvertFile {

    public static void main(String[] args) throws IOException {
        File fi=new File("E://files//textFile.txt");
        if(fi.createNewFile())
        {
            System.out.println("file created successfully");
        }
        else
        {
            System.out.println("file already exit");
        }
        FileWriter fw=new FileWriter(fi);
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the text to convert it to upper case : ");
        String text=obj.nextLine();
        fw.write(text);
        
        fw.close();
        FileReader fr=new FileReader(fi);
        Scanner sc = new Scanner(fi);
        String upStr=null;
        while(sc.hasNextLine())
        {
            String str=sc.nextLine();
            upStr=str.toUpperCase();
        }
        
        System.out.println("================================================");
        System.out.println("converted text from lowercase to uppercase : ");
        System.out.println(upStr);
        System.out.println("================================================");
        fr.close();
        File fi1=new File("E://files//upperTextFile.txt");
        if(fi1.createNewFile())
        {
            System.out.println("file created successfully");
        }
        else
        {
            System.out.println("file already exit");
        }
        FileWriter fw1=new FileWriter(fi1);
        fw1.write(upStr);
        fw1.close();
        System.out.println("That converted text was stored in another file successfully");
    }
    
}
