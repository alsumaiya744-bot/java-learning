import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int mark[][]=new int[3][3];
		for(int i=0;i<mark.length;i++)
		{
			System.out.println("******************************************************** ");
			for(int j=0;j<mark[i].length;j++)
			{
				System.out.print("enter the mark of subject"+" "+(j+1)+" of student"+" "+(i+1)+" :");
				mark[i][j]=obj.nextInt();
			}
		}
		System.out.println("*********Students Mark********* ");
		for(int i=0;i<mark.length;i++)
		{
			for(int j=0;j<mark[i].length;j++)
			{
				System.out.print((mark[i][j])+" ");
			}
			System.out.println();
		}
	}
}