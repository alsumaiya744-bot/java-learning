import java.util.Scanner;
class TrafficLight
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter a colour (Red,Yellow,Green)to display traffic signal meaning :");
		String colour=obj.nextLine();
		switch(colour)
		{
			case "Red":
				System.out.println("Stop");
				break;
			case "Yellow":
				System.out.println("Wait");
				break;
			case "Green":
				System.out.println("ready to go");
				break;
			default:
				System.out.println("please enter the correct colour name");
		}
	}
	
}