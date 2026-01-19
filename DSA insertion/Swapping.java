import java.util.Scanner;
class Swapping
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the length of Array :");
		int length=obj.nextInt();
		int a[]=new int[length];
		int b[]=new int[length];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("enter the number "+(i+1)+" in a :");
			a[i]=obj.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print("enter the number "+(i+1)+" in b :");
			b[i]=obj.nextInt();
		}
		int temp[]=a;
		a=b;
		b=temp;
		System.out.print("a =");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("b =");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}