import java.util.Scanner;
class Citizenship
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter age :");
		byte age=obj.nextByte();
		if(age>=60)
		{
			System.out.println("Senior Citizen");
		}
		else
		{
			System.out.println("Not a Senior Citizen");
		}
	}
}