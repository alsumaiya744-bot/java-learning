import java.util.Scanner;
class Electricity
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("======Electricity Bill Calculation======");
		System.out.print("Enter how many units of electric power consumed :");
		int unit=obj.nextInt();
		if((unit<=100)&&(unit>0))
		{
			int amount=unit*5;
			System.out.print("Electricity Bill :"+"Rs."+amount);
		}
		else if((unit>=101)&&(unit<=200))
		{
			int amount=(100*5)+((unit-100)*7);
			System.out.print("Electricity Bill :"+"Rs."+amount);
		}
		else if(unit>200)
		{
			int amount=(100*5)+(100*7)+((unit-200)*10);
			System.out.print("Electricity Bill :"+"Rs."+amount);
		}
		else
		{
			System.out.print("invalid unit");
		}
	}
}