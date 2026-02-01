
package Matrix;


public class SpiralForm {
    void matrixSpiralForm(int[][] multiArr)
    {
        for(int i=0;i<multiArr.length;i++)
        {
            if((i+1)%2==0)
            {
                for(int j=multiArr[i].length-1;j>=0;j--)
                {
                    System.out.print(multiArr[i][j]+",");
                }
            }
            else
            {
                for(int j=0;j<multiArr[i].length;j++)
                {
                    System.out.print(multiArr[i][j]+",");
                }
            }
            
        }
    }
}
