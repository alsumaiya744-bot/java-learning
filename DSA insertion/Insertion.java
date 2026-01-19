import java.util.Scanner;
class Insertion
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the length of Array :");
		int length=obj.nextInt();
		int arr[]=new int[length];
		int newarr[];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter the number "+(i+1)+" :");
			arr[i]=obj.nextInt();
		}
		System.out.print("entered numbers are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("enter the number of element to insert :");
		int insertNum=obj.nextInt();
		newarr=new int[length+insertNum];
		int insertPosition=0;
		int insertValue=0;
		for(int i=1;i<=insertNum;i++)
		{
			System.out.print("enter the insert position :");
			insertPosition=obj.nextInt();
			System.out.print("enter the insert value :");
			insertValue=obj.nextInt();
			for(int j=0;j<insertPosition;j++)
			{
				newarr[j]=arr[j];
			}
			newarr[insertPosition]=insertValue;
			for(int k=insertPosition;k<arr.length-1;k++)
			{
				newarr[k+1]=arr[k];
			}
			System.out.println("after insertion :");
			for(int m=0;m<newarr.length;m++)
			{
				if(newarr[m]!=0)
				{
					System.out.print(newarr[m]+" ");
				}
			}
			System.out.println();
			arr=newarr;
		}
	}
}