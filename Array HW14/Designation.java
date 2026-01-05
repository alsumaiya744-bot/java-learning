import java.util.Scanner;
class Designation
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		Scanner obj1=new Scanner(System.in);
		System.out.print("enter number employee for storing their designation :");
		int len=obj.nextInt();
		String name[]=new String[len];
		String job[]=new String[len];
		for(int i=0;i<name.length;i++)
		{
			System.out.print("enter your name :");
			name[i]=obj1.nextLine();
			System.out.print("enter your designation :");
			job[i]=obj1.nextLine();
		}
		System.out.println("**************************************");
		for(int i=0;i<name.length;i++)
		{
			System.out.println("employee "+name[i]+" designation :"+job[i]);
		}
	}
}