import java.util.Scanner;
import java.util.Arrays;
class MergeSort
{
	Scanner obj=new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner obj1=new Scanner(System.in);
		System.out.print("enter the length of array :");
		int len=obj1.nextInt();
		int arr[]=new int[len];
		int i=0;
		MergeSort obj2=new MergeSort();
		arr=obj2.enter(arr,i);
		int newArr[]=obj2.divide(arr);
		obj2.printArr(newArr);
		obj2.midValue(newArr);
	}
	int[] enter(int arr[],int i)
	{
		if(i<arr.length)
		{
			System.out.print("enter the element "+(i+1)+" :");
			arr[i]=obj.nextInt();
			enter(arr,(i+1));
		}
		return arr;
	}
	int[] divide(int arr[])
	{
		if(arr.length==1)
		{
			return arr;
		}
		int mid=(arr.length)/2;
		int left[]=divide(Arrays.copyOfRange(arr,0,mid));
		int right[]=divide(Arrays.copyOfRange(arr,mid,arr.length));
		return sort(left,right);
	}
	int[] sort(int left[],int right[])
	{
		int newArr[]=new int[left.length+right.length];
		int i=0;
		int j=0;
		int k=0;
		while ((i<left.length)&&(j<right.length))
		{
			if(left[i]>right[j])
			{
				newArr[k]=right[j];
				j++;
				k++;
			}
			else if(left[i]<right[j])
			{
				newArr[k]=left[i];
				i++;
				k++;
			}
		}
		while(i<left.length)
		{
			newArr[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			newArr[k]=right[j];
			j++;
			k++;
		}
		return newArr;
	}
	void midValue(int arr[])
	{
		int mid=arr.length/2;
		System.out.println("middle element :"+arr[mid]);
	}
	void printArr(int arr[])
	{
		System.out.println("sorted Array :");
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}