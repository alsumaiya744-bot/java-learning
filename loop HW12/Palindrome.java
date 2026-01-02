import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner obj= new Scanner(System.in);
		System.out.print("enter a number to check whether it is palindrome or not :");
		int num=obj.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
		while(temp>0)
		{
			rem=temp%10;
			sum=rem+(sum*10);
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.print(num+"is a palindrome");
		}
		else
		{
			System.out.print(num+"is not a palindrome");
		}
	}
}