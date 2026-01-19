import java.util.Scanner;
class Traverse
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the length of Array :");
		int length=obj.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter the number "+(i+1)+" :");
			arr[i]=obj.nextInt();
		}
		System.out.print("After reversing the given number :");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}