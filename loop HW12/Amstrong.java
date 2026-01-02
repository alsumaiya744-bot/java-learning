import java.util.Scanner;
class Amstrong
{
	public static void main(String[] args)
	{
		Scanner obj= new Scanner(System.in);
		System.out.print("enter a number to check whether it is Amstrong or not :");
		int num=obj.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		temp=num;
		while(temp>0)
		{
			rem=temp%10;
			int power=1;
			for(int i=1;i<=count;i++)
			{
				power=rem*power;
			}
			sum=sum+power;
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println(num+"is a Armstrong number");
		}
		else
		{
			System.out.println(num+"is not a Armstrong number");
		}
	}
}