import java.util.Scanner;
class LinearSearch
{
	int linearSearch(int arr[],int searchValue)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(searchValue==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the total length of the numbers :");
		int length=obj.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter the element "+(i+1)+" :");
			arr[i]=obj.nextInt();
		}
		System.out.print("enter the search element to find its position :");
		int searchValue=obj.nextInt();
		LinearSearch obj1=new LinearSearch();
		int index =obj1.linearSearch(arr,searchValue);
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