import java.util.Scanner;
class ArrayReverse
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
			System.out.println("you entered number more than the given length");
		}
		return num;
	}
	void displayNumber(int num[])
	{
		for(int i=0;i<num.length;i++)
		{
				if(num[i]!=0)
				{
					System.out.println("The number "+(i+1)+" :"+num[i]);
				}
		}
	}
	void reverse(int num[])
	{
		for(int i=num.length-1;((i<num.length)&&(i>=0));i--)
		{
			if(num[i]!=0)
			{
				System.out.println("The number "+(i+1)+" :"+num[i]);
			}
		}
	}
	void menu()
	{
		int choice;
		System.out.print("Enter total number of integer :");
		int length=obj.nextInt();
		int arr[]=new int[length];
		do
		{
			System.out.print("Menu:\n1. Enter Number\n2. Display Number\n3. Reverse Number\n4. Exit\n");
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
					reverse(arr);
					break;
				case 4:
					System.out.print("Thank You");
					break;
				default:
					System.out.print("Invalid Choice");
			}
		}while(choice!=4);
	}
	public static void main(String[] args)
	{
		ArrayReverse obj1=new ArrayReverse();
		obj1.menu();
	}
	
}