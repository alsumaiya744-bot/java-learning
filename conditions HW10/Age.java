import java.util.Scanner;
class Age
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your age :");
		byte age=obj.nextByte();
		if((age<13)&&(age>0))
		{
			System.out.print("child");
		}
		else if((age>=13)&&(age<=19))
		{
			System.out.print("Teenager");
		}
		else if((age>=20)&&(age<=59))
		{
			System.out.print("Adult");
		}
		else if((age>=60)&&(age<=122))
		{
			System.out.print("Senior");
		}
		else
		{
			System.out.print("invalid age");
		}
	}
}