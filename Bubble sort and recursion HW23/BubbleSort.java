import java.util.Scanner;
class BubbleSort
{
	int bubbleSort(int arr[])
	{
		int i=0;
		for(i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printArr(arr);
		return i;	
	}
	void printArr(int arr[])
	{
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the number of element :");
		int length=obj.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter the number "+(i+1)+" :");
			arr[i]=obj.nextInt();
		}
		BubbleSort obj1=new BubbleSort();
		int pass=obj1.bubbleSort(arr);
		System.out.print("The number of pass :"+pass);
	}
}