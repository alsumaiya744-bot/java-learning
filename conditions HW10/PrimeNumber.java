import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number to check it is prime or not :");
		int num=obj.nextInt();
		if(num<=1)
		{
			System.out.print("it is not a prime number");
		}
		else if((num==2)||(num==3)||(num==5)||(num==7))
		{
			System.out.print("it is a prime number");
		}
		else if((num%2!=0)||(num%3!=0)||(num%5!=0)||(num%7!=0))
		{
			System.out.print("it is a prime number");
		}
		else
		{
			System.out.print("not a prime number");
		}
	}
}
