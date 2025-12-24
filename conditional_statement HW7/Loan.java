import java.util.Scanner;
class Loan
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your age :");
		byte age=obj.nextByte();
		System.out.println("Enter your monthly salary :");
		int salary=obj.nextInt();
		if((age>21)&&(salary>25000))
		{
			System.out.println("you are eligible for loan");
		}
		else
		{
			System.out.println("you are not eligible for loan");
		}
	}
}