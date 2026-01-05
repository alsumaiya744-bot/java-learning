import java.util.Scanner;
class Electricity
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter number of month to fill electricity consumption for each month :");
		int len=obj.nextInt();
		double EB[]=new double[len];
		for(int i=0;i<EB.length;i++)
		{
			System.out.print("enter the electricity (EB) unit consumption for "+(i+1)+"st month"+" :");
			EB[i]=obj.nextDouble();
		}
		System.out.println("**************************************");
		for(int i=0;i<EB.length;i++)
		{
			System.out.println("electricity (EB) unit consumption for "+(i+1)+"st month"+" :"+EB[i]);
		}
	}
}