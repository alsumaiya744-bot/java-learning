
package longestwordinfile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LongestWordInFile {

    public static void main(String[] args) throws IOException {
        File fi=new File("E://files//longestWord.txt");
        if(fi.createNewFile())
        {
            System.out.println("file created successfully");
        }
        else
        {
            System.out.println("file already exit");
        }
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the words to find a largest letter : ");
        String str=obj.nextLine();
        FileWriter fw=new FileWriter(fi);
        fw.write(str);
        fw.close();
        FileReader fr=new FileReader(fi);
        Scanner sc=new Scanner(fi);
        String longestWord="";
        
        while(sc.hasNext())
        {
           String word=sc.next();
            if(word.length()>longestWord.length())
            {
                longestWord=word;
            }
             
        }
       System.out.println(longestWord);
    }
    
}
