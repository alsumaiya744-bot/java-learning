
package genericstoragebox;

import java.util.Arrays;

public class StorageBox <V>{
    V values[];
    void addValues(V values[])
    {
      this.values=values;
       
    }
    void display()
    {
        if(values!=null)
        {
            System.out.println(Arrays.toString(values));
        }
        else
        {
            System.out.println("value did not stored yet");
        }
    }
}
