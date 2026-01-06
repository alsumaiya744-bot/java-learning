import java.util.Scanner;
class City
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the number of state :");
		int row=obj.nextInt();
		System.out.print("enter the number of city in per state :");
		int column=obj.nextInt();
		obj.nextLine();
		String city[][]=new String[row][column];
		for(int i=0;i<city.length;i++)
		{
			System.out.println("******************************************************** ");
			for(int j=0;j<city[i].length;j++)
			{
				System.out.print("enter the name of city "+" "+(j+1)+" in "+"state "+(i+1)+" :");
				city[i][j]=obj.nextLine();
			}
		}
		System.out.println("*********cities********* ");
		for(int i=0;i<city.length;i++)
		{
			for(int j=0;j<city[i].length;j++)
			{
				System.out.printf("%-15s",(city[i][j]));
			}
			System.out.println();
		}
	}
}