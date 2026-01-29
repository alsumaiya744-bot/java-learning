import java.util.Scanner;
class UpdateStudentDetail 
{
	Scanner obj=new Scanner(System.in);
	void updateName(String name[])
	{
		System.out.print("enter student place to update His/Her name :");
		int index=obj.nextInt();
		obj.nextLine();
		if((index-1)<name.length)
		{
			System.out.print("enter student name to replace :");
			name[index-1]=obj.nextLine();
		}
		else
		{
			System.out.println("Sorry! There is no name in that place to update");
		}
	}
	void updateRollNo(int roll[])
	{
		System.out.print("enter student place to update His/Her register number :");
		int index=obj.nextInt();
		if((index-1)<roll.length)
		{
			System.out.print("enter student register number to replace :");
			roll[index-1]=obj.nextInt();
		}
		else
		{
			System.out.println("Sorry! There is no register number in that place to update");
		}
	}
	void updateMobileNo(long mobile[])
	{
		System.out.print("enter student place to update His/Her mobile number :");
		int index=obj.nextInt();
		if((index-1)<mobile.length)
		{
			System.out.print("enter student mobile number to replace :");
			mobile[index-1]=obj.nextLong();
		}
		else
		{
			System.out.println("Sorry! There is no mobile number in that place to update");
		}
	}
}