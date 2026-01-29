import java.util.Scanner;
class DetailMenu
{
	Scanner obj=new Scanner(System.in);
	String name[]=new String[0];
	int roll[]=new int[0];
	long mobileNo[]=new long[0];
	int index;
	int index1;
	int index2;
	void menu()
	{
		int choice=0;
		do
		{
			System.out.println("menu :");
			System.out.print("1. Add student details\n2. Update student details\n3. Display student details\n4. Exit\n");
			System.out.print("enter your choice :");
			choice=obj.nextInt();
			obj.nextLine();
			switch(choice)
			{
				case 1:
					AddStudentDetails add=new AddStudentDetails();
					name=add.addName(name,index++);
					roll=add.addRollNo(roll,index1++);
					mobileNo=add.addMobileNo(mobileNo,index2++);
					System.out.println("student details added successfully");
					break;
				case 2:
					UpdateStudentDetail update=new UpdateStudentDetail();
					System.out.println("which one to update name or register number or mobile number :");
					String choose=obj.nextLine();
					if(choose.equals("name"))
					{
						update.updateName(name);
					}
					else if(choose.equals("register number"))
					{
						update.updateRollNo(roll);
					}
					else if(choose.equals("mobile number"))
					{
						update.updateMobileNo(mobileNo);
					}
					break;
				case 3:
					DisplayStudentDetail display=new DisplayStudentDetail();
					display.display(name,roll,mobileNo);
					break;
				case 4:
					System.out.print("Thank You");
					break;
				default:
					System.out.print("invalid choice");
			}
		}while(choice!=4);
	}
}