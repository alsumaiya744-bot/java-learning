import java.util.Scanner;
class Movie
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		Scanner obj1=new Scanner(System.in);
		System.out.print("enter total list of your favirot movie :");
		int len=obj.nextInt();
		String movie[]=new String[len];
		for(int i=0;i<movie.length;i++)
		{
			System.out.print("enter your favirot movie "+(i+1)+" :");
			movie[i]=obj1.nextLine();
		}
		System.out.println("**************************************");
		for(int i=0;i<movie.length;i++)
		{
			System.out.println("favirot movie "+(i+1)+" :"+movie[i]);
		}
	}
}
