import java.util.Scanner;
class Neon
{
	public static void main(String[] ars)
	{
		Scanner obj= new Scanner(System.in);
		System.out.print("enter a number to check whether it is Neon or not :");
		int num=obj.nextInt();
		int square=num*num;
		int rem=0;
		int sum=0;
		while(square>0)
		{
			rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(num==sum)
		{
			System.out.print(num+"is a neon number");
		}
		else
		{
			System.out.print(num+"is a not neon number");
		}
	}
}