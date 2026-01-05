import java.util.Scanner;
class MobileNumber
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter total number of mobile number to store :");
		int len=obj.nextInt();
		long num[]=new long[len];
		for(int i=0;i<num.length;i++)
		{
			System.out.print("enter the mobile number "+(i+1)+" :");
			num[i]=obj.nextLong();
		}
		System.out.println("**************************************");
		for(int i=0;i<num.length;i++)
		{
			System.out.println("mobile number "+(i+1)+" :"+num[i]);
		}
	}
}