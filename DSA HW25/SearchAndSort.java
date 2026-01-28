import java.util.Scanner;
import java.util.Arrays;
class SearchAndSort
{
	Scanner obj=new Scanner(System.in);
	int index=0;
	int[] enterElement(int arr[])
	{
		int newArr[]=new int[index+1];
		for(int i=0;i<arr.length;i++)
		{
			newArr[i]=arr[i];
		}
		System.out.print("enter the element "+(index+1)+" :");
		newArr[index]=obj.nextInt();
		index++;
		return newArr;
	}
	void display(int arr[],int i)
	{
		if(i<arr.length)
		{
			System.out.println(arr[i]);
			display(arr,++i);
		}
	}
	int[] bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
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
		return arr;
	}
	int[] divide(int arr[])
	{
		if(arr.length==1)
		{
			return arr;
		}
		int mid=arr.length/2;
		int left[]=divide(Arrays.copyOfRange(arr,0,mid));
		int rigth[]=divide(Arrays.copyOfRange(arr,mid,arr.length));
		return merge(left,rigth);
	}
	int[] merge(int left[],int rigth[])
	{
		int newArr[]=new int[left.length+rigth.length];
		int i=0;
		int j=0;
		int k=0;
		while((i<left.length)&&(j<rigth.length))
		{
			if(left[i]<=rigth[j])
			{
				newArr[k]=left[i];
				i++;
				k++;
			}
			else if(left[i]>=rigth[j])
			{
				newArr[k]=rigth[j];
				j++;
				k++;
			}
		}
		while(i<left.length)
		{
			newArr[k]=left[i];
			i++;
			k++;
		}
		while(j<rigth.length)
		{
			newArr[k]=rigth[j];
			j++;
			k++;
		}
		return newArr;
	}
	int linearSearch(int arr[],int searchValue,int i)
	{
		if(i<arr.length)
		{
			if(arr[i]==searchValue)
			{
				return i;
			}
			else
			{
				return linearSearch(arr,searchValue,++i);
			}
		}
		return -1;
	}
	int binarySearch(int arr[],int searchValue,int left,int rigth)
	{
		if(left<=rigth)
		{
			int mid=(left+rigth)/2;
			if(arr[mid]==searchValue)
			{
				return mid;
			}
			else if(arr[mid]<searchValue)
			{
				left=mid+1;
			}
			else if(arr[mid]>searchValue)
			{
				rigth=mid-1;
			}
			return binarySearch(arr,searchValue,left,rigth);
		}
		return -1;
	}
	void printArr(int arr[])
	{
		System.out.println("Sorted Array :");
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	void menu()
	{
		int arr[]=new int[0];
		int choice=0;
		do
		{
			System.out.println("Menu :");
			System.out.print("1. enter element\n2. display the array\n3. sort the array\n4. search for an element\n5. exit\n");
			System.out.print("enter you choice :");
		    choice=obj.nextInt();
			switch(choice)
			{
				case 1:
					arr=enterElement(arr);
					break;
				case 2:
					System.out.println("******** Element in Array ********");
					display(arr,0);
					break;
				case 3:
					System.out.println("Sort Menu :");
					System.out.print("1. bubble sort\n2. merge sort\n");
					System.out.println("enter your choice :");
					int choice1=obj.nextInt();
					if(choice1==1)
					{
						System.out.println("********** Bubble Sort **********");
						arr=bubbleSort(arr);
						printArr(arr);
					}
					else
					{
						System.out.println("********** Merge Sort **********");
						arr=divide(arr);
						printArr(arr);
					}
					break;
				case 4:
					System.out.println("Search Menu :");
					System.out.print("1. linear search\n2. binary search\n");
					System.out.print("enter your choice :");
					int choice2=obj.nextInt();
					System.out.println("enter the search value :");
					int searchValue=obj.nextInt();
					int i=0;
					if(choice2==1)
					{
						System.out.println("********** Linear Search **********");
						int result=linearSearch(arr,searchValue,i);
						if(result>=0)
						{
							System.out.println("element "+searchValue+" found at index "+result);
						}
						else
						{
							System.out.println("element "+searchValue+" not found");
						}
					}
					else
					{
						System.out.println("********** Binary Search **********");
						int left=0;
						int rigth=arr.length;
						int result=binarySearch(arr,searchValue,left,rigth);
						if(result>=0)
						{
							System.out.println("element "+searchValue+" found at index "+result);
						}
						else
						{
							System.out.println("element "+searchValue+" not found");
						}
					}
					break;
					case 5:
						System.out.println("Thank You");
						break;
					default:
						System.out.println("Invalid choice");
			}
		}while(choice!=5);
	}
	public static void main(String[] args)
	{
		SearchAndSort obj1=new SearchAndSort();
		obj1.menu();
	}
}
