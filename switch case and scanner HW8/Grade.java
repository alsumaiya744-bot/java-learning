import java.util.Scanner;
class Grade
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter your grade :");
		char grade=obj.next().charAt(0);
		switch(grade)
		{
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("very good");
				break;
			case 'C':
				System.out.println("good");
				break;
			case 'D':
				System.out.println("needs improvement");
				break;
			case 'F':
				System.out.println("fail-please try again");
				break;
			default:
				System.out.println("invalid grade");
		}
	}
	
}