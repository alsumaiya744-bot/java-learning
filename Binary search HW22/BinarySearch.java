import java.util.Scanner;
class BinarySearch
{
	int binarySearch(int arr[],int searchValue)
	{
		int left=0;
		int right=arr.length-1;
		int mid=(left+right)/2;
		while(left<=right)
		{
			if(searchValue==arr[mid])
			{
				return mid;
			}
			else if(searchValue<arr[mid])
			{
				right=mid-1;
			}
			else if(searchValue>arr[mid])
			{
				left=mid+1;
			}
			mid=(left+right)/2;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the total length of the numbers :");
		int length=obj.nextInt();
		int arr[]=new int[length];
		System.out.println("enter element in sorted order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter the element "+(i+1)+" :");
			arr[i]=obj.nextInt();
		}
		System.out.print("enter the search element to find its position :");
		int searchValue=obj.nextInt();
		BinarySearch obj1=new BinarySearch();
		int index =obj1.binarySearch(arr,searchValue);
		if(index>=0)
		{
			System.out.print("The element "+searchValue+" located at index "+index);
		}
		else
		{
			System.out.print("The search value was not found");
		}
	}
}