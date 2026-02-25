
package removeextraspace;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class RemoveExtraSpace{

    public static void main(String[] args){
        try
        {
            File fi=new File("E://files//textWithSpace.txt");
            if(fi.createNewFile())
            {
                System.out.println("file created successfully");
            }
            else
            {
                System.out.println("file already exit");
            }
             FileWriter fw=new FileWriter(fi);
             fw.write("I       am          sumaiya");
             fw.close();
             FileReader fr=new FileReader(fi);
             boolean lastWasSpace=false;
             int ch;
             
             FileWriter file=new FileWriter("E:\\files\\fileWithoutSpace.txt");
             while((ch=fr.read())!=-1)
             {
                 char c=(char)ch;
                 if(Character.isWhitespace(c))
                 {
                     if(!lastWasSpace)
                     {
                         file.write(' ');
                         lastWasSpace=true;
                     }
                     
                 }
                 else
                 {
                         file.write(c);
                         lastWasSpace=false;
                 }
             }
             
               fr.close();
             System.out.println("space was removed successfully");
             file.close();
        }
        catch(IOException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
    }
    
}
