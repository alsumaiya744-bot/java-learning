import java.util.Scanner;
class AddStudentDetails
{
	Scanner obj=new Scanner(System.in);
	String[] addName(String name[],int index)
	{
		String NewName[]=new String[index+1];
		for(int i=0;i<name.length;i++)
		{
			NewName[i]=name[i];
		}
		System.out.print("enter student "+(index +1)+" name :");
		NewName[index]=obj.nextLine();
		return NewName;
	}
	int[] addRollNo(int roll[],int index1)
	{
		int NewRoll[]=new int[index1+1];
		for(int i=0;i<roll.length;i++)
		{
			NewRoll[i]=roll[i];
		}
		System.out.print("enter student "+(index1 +1)+" register number :");
		NewRoll[index1]=obj.nextInt();
		return NewRoll;
	}
	
	long[] addMobileNo(long mobileNo[],int index2)
	{
		long NewMobileNo[]=new long[index2+1];
		for(int i=0;i<mobileNo.length;i++)
		{
			NewMobileNo[i]=mobileNo[i];
		}
		System.out.print("enter student "+(index2 +1)+" mobile number :");
		NewMobileNo[index2]=obj.nextLong();
		return 	NewMobileNo;
	}
}