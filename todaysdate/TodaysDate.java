
package todaysdate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class TodaysDate {

    public static void main(String[] args) throws IOException {
        File fi=new File("E://files//dateFile.txt");
        if(fi.createNewFile())
        {
            System.out.println("file created successfully");
        }
        else
        {
            System.out.println("file already exit");
        }
        LocalDate date=LocalDate.now();
        FileWriter fw=new FileWriter(fi);
        fw.write(date.toString());
        System.out.println("Todays date was written successfully");
        fw.close();
        
    }
    
}
