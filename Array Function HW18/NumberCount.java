import java.util.Scanner;
class NumberCount
{
	Scanner obj=new Scanner(System.in);
	int index=0;
	int[] enterNumber(int num[])
	{
			if(index<num.length)
			{
				System.out.print("Enter the number "+(index+1)+" :");
				num[index]=obj.nextInt();
				index++;
			}
			else
			{
				System.out.println("you entered number more than the give length");
			}
			return num;
	}
	void displayNumber(int num[])
	{
		for(int i=0;i<num.length;i++)
		{
			System.out.println("The number "+(i+1)+" :"+num[i]);
		}
	}
	int countPositive(int num[])
	{
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>0)
			{
				count++;
			}
		}
		return count;
	}
	int countNegative(int num[])
	{
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<0)
			{
				count++;
			}
		}
		return count;
	}
	int countZero(int num[])
	{
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==0)
			{
				count++;
			}
		}
		return count;
	}
	void menu()
	{
		int choice;
		System.out.print("Enter total number of integer :");
		int length=obj.nextInt();
		int arr[]=new int[length];
		
		do
		{
			System.out.print("Menu:\n1. Enter Number\n2. Display Number\n3. Count Positive Number\n4. Count Negative Number\n5. Count Zero\n6. Exit\n");
			System.out.print("Enter your choice :");
			choice=obj.nextInt();
			switch(choice)
			{
				case 1:
					arr=enterNumber(arr);
					break;
				case 2:
					displayNumber(arr);
					break;
				case 3:
					int pcount=countPositive(arr);
					System.out.println("positive count ="+pcount);
					break;
				case 4:
					int ncount=countNegative(arr);
					System.out.println("negative count ="+ncount);
					break;
				case 5:
					int zcount=countZero(arr);
					System.out.println("zero count ="+zcount);
					break;
				case 6:
					System.out.println("Thank You");
					break;
				default:
					System.out.print("Invalid Choice");
			}
		}while(choice!=6);
	}
	public static void main(String[] args)
	{
		NumberCount obj1=new NumberCount();
		obj1.menu();
	}
	
}