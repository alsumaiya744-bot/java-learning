class Scholarship
{
	public static void main(String[] args)
	{
		int Mark=65;
		boolean mark1=Mark>70;
		boolean Attendance=true;
		boolean Discipline=true;
		System.out.println("Pass & Eligible for Scholarship :"+((mark1)&&(Attendance)&&(Discipline)));
		System.out.println("Pass & Eligible for Scholarship :"+((mark1)||(Attendance)||(Discipline)));
		System.out.println("Pass & Eligible for Scholarship :"+((mark1)&&(Attendance)||(Discipline)));
		int mark=92;
		boolean mark2=mark>70;
		System.out.println("Pass & Eligible for Scholarship :"+((mark2)&&(Attendance)&&(Discipline)));
		
		
	}
	
}