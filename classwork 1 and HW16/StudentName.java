import java.util.Scanner;
class StudentName
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		Scanner obj1=new Scanner(System.in);
		System.out.print("enter the total number of students :");
		int num=obj.nextInt();
		String name[]=new String[num];
		int index=0;
		int option;
		do
		{
			System.out.println("**************************************************");
			System.out.println("menu :");
			System.out.println("1. Add student");
			System.out.println("2. see the student list");
			System.out.println("3. Exit");
			System.out.println("choose the option");
			option=obj.nextInt();
			switch(option)
			{
			case 1:
					if(index<name.length)
					{
					System.out.print("enter the name of student"+" "+(index+1)+" :");
					name[index]=obj1.nextLine();
					index++;
					}
					else
					{
						System.out.println("you entered data more than given length");
					}
					break;
			case 2:
				System.out.println("***********Student Name***********");
				for(int i=0;i<name.length;i++)
				{
					if(name[i]!=null)
					{
					System.out.println("The name of student"+" "+(i+1)+" :"+name[i]);
					}
				}
				break;
			case 3:
				System.out.print("Thank you");
				break;
			default:
				System.out.print("invalid choice");
			}
		
		}while(option<3);
	}
}