
package Matrix;

import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the row length : ");
        int row=obj.nextInt();
        System.out.print("enter th column length : ");
        int column=obj.nextInt();
        int multiArr[][]=new int[row][column];
        for(int i=0;i<multiArr.length;i++)
        {
            for(int j=0;j<multiArr[i].length;j++)
            {
                System.out.print("enter the element at index "+i+","+j+" : ");
                multiArr[i][j]=obj.nextInt();
            }
        }
        SpiralForm sp=new SpiralForm();
        sp.matrixSpiralForm(multiArr);
    }
}
