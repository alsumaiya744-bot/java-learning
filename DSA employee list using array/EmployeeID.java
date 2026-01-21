import java.util.Scanner;
class EmployeeID
{
	Scanner obj=new Scanner(System.in);
	int index=0;
	int[] addEmployee(int arr[])
	{
		int newArr[]=new int[index+1];
		for(int i=0;i<arr.length;i++)
		{
			newArr[i]=arr[i];
		}
		System.out.print("enter the employee "+(index+1)+" ID :");
		newArr[index]=obj.nextInt();
		index++;
		System.out.println("Employee ID added");
		return newArr;
	}
	int[] removeEmployeeID(int arr[])
	{
		int newArr[]=new int[arr.length-1];
		System.out.println("enter the removal employee ID  :");
		int employeeID=obj.nextInt();
		int deletIndex=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(employeeID==arr[i])
			{
				deletIndex=i;
			}
		}
		for(int i=0;i<deletIndex;i++)
		{
			newArr[i]=arr[i];
		}
		for(int i=deletIndex+1;i<arr.length;i++)
		{
			newArr[i-1]=arr[i];
		}
		index--;
		System.out.print("employee ID removed successfully");
		return newArr;
	}
	void displayEmployeeID(int newArr[])
	{
		for(int i=0;i<newArr.length;i++)
		{
			System.out.println("Employee "+(i+1)+" ID "+newArr[i]);
		}
	}
	void menu()
	{
		System.out.print("enter the total number of employees going to work :");
		int len=obj.nextInt();
		int arr[]=new int[0];
		int choice=0;
		do
		{
			System.out.println("menu :");
			System.out.print("1. Add employee ID\n2. Remove employee ID\n3. Display employee ID\n4. Exit\n");
			System.out.print("enter your choice :");
			choice=obj.nextInt();
			switch(choice)
			{
				case 1:
					arr=addEmployee(arr);
					break;
				case 2:
					arr=removeEmployeeID(arr);
					break;
				case 3:
					displayEmployeeID(arr);
					break;
				case 4:
					System.out.print("Thank You");
					break;
				default:
					System.out.print("invalid choice");
			}
		}while(choice!=4);
	}
	public static void main(String[] args)
	{
		EmployeeID obj1=new EmployeeID();
		obj1.menu();
	}
}