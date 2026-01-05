import java.util.Scanner;
class PeopleHeight
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter total number of people :");
		int len=obj.nextInt();
		float height[]=new float[len];
		for(int i=0;i<height.length;i++)
		{
			System.out.print("enter the height of "+(i+1)+" :");
			height[i]=obj.nextFloat();
		}
		System.out.println("**************************************");
		for(int i=0;i<height.length;i++)
		{
			System.out.println("height of person "+(i+1)+" :"+height[i]);
		}
	}
}