import java.util.Scanner;
class Result
{
	Scanner obj=new Scanner(System.in);
	byte mark1;
	byte mark2;
	byte mark3;
	int total_mark;
	int percentage;
	void inputMarks()
	{
		System.out.print("enter the mark1 :");
		mark1=obj.nextByte();
		System.out.print("enter the mark2 :");
		mark2=obj.nextByte();
		System.out.print("enter the mark3 :");
		mark3=obj.nextByte();
	}
	void calculateTotal()
	{
		total_mark=mark1+mark2+mark3;
		System.out.println("Total mark :"+total_mark);
	}
	void calculatePercentage()
	{
		percentage=(total_mark*100)/300;
		System.out.println("Total percentage :"+percentage);
		
	}
	void displayResult()
	{
		if(percentage>=40)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");	
		}
	}
	void displayGrade()
	{
		if(percentage>=75)
		{
			System.out.println("A grade");
		}
		else if((percentage>=60)&&(percentage<=74))
		{
			System.out.println("B grade");
		}
		else if((percentage>=40)&&(percentage<=59))
		{
			System.out.println("C grade");
		}
		else if(percentage<40)
		{
			System.out.println("F grade");
		}
	}
	public static void main(String[] args)
	{
		Scanner obj1=new Scanner(System.in);
		Result obj2=new Result();
		obj2.inputMarks();
		int choice;
		do
		{
			System.out.print("Menu :\n1. Display Total\n2. Display Percentage\n3. Display Result\n4. Display Grade\n5. Exit\n");
			System.out.print("enter your choice :");
			choice=obj1.nextInt();
			switch(choice)
			{
				case 1:
					obj2.calculateTotal();
					break;
				case 2:
					obj2.calculatePercentage();
					break;
				case 3:
					obj2.displayResult();
					break;
				case 4:
					obj2.displayGrade();
					break;
				case 5:
					System.out.print("Thank You");
					break;
				default:
				System.out.println("invalid choice");
			}
		}while(choice!=5);
	}
}
