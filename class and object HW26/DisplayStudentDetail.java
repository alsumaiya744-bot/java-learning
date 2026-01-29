class DisplayStudentDetail 
{
	void display(String name[],int roll[],long mobileNo[])
	{
		System.out.println("*************** Student Details ***************");
		if(name.length==0)
		{
			System.out.println("There is no detail to be display");
		}
		for(int i=0;i<name.length;i++)
		{
			System.out.println("student "+(i+1)+" :");
			System.out.println("name :"+name[i]);
			System.out.println("register number :"+roll[i]);
			System.out.println("register number :"+mobileNo[i]);
		 }
	 }
}