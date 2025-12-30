import java.util.Scanner;
class CheckMultiplication
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number to check whether it is multiple by (3 or 7)or not :");
		int num=obj.nextInt();
		if(num!=0)
		{
			if((num%3==0)&&(num%7==0))
			{
				System.out.println("Multiple of 3 and 7");
			}
			else if(num%3==0)
			{
				System.out.println("Multiple of 3");
			}
			else if(num%7==0)
			{
				System.out.println("Multiple of 7");
			}
			else
			{
				System.out.println("Not a Multiple of 3 or 7");
			}
		}
		else
		{
			System.out.println("enter non zero number");
		}
	}
}