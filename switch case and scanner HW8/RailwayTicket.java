import java.util.Scanner;
class RailwayTicket
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter your choice (1 to 5) in order to know about class name and ticket rate :");
		byte choice=obj.nextByte();
		switch(choice)
		{
			case 1:
				System.out.println("General class");
				System.out.println("Ticket rate : 300");
				break;
			case 2:
				System.out.println("Sleeper class");
				System.out.println("Ticket rate : 500");
				break;
			case 3:
				System.out.println("AC 3 Tier class");
				System.out.println("Ticket rate : 800");
				break;
			case 4:
				System.out.println("AC 2 Tier class");
				System.out.println("Ticket rate : 1000");
				break;
			case 5:
				System.out.println("First class");
				System.out.println("Ticket rate : 1500");
				break;
			default:
				System.out.println("invalid choice please enter the correct choice (1 to 5)");
				
		}
	}
	
}