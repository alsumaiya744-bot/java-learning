import java.util.Scanner;
class Login
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		Scanner obj1=new Scanner(System.in);
		String user_Name[]=new String[1];
		int password[]=new int[1];
		int index=0;
		int option;
		do
		{
			System.out.println("**************************************************");
			System.out.println("menu :");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. exit");
			System.out.println("choose the option");
			option=obj.nextInt();
			switch(option)
			{
			case 1:
					System.out.println("***********Registration Page***********");
					System.out.print("enter the name :");
					user_Name[index]=obj1.nextLine();
					System.out.print("enter the password :");
					password[index]=obj.nextInt();
					break;
			case 2:
				System.out.println("***********Login Page***********");
				System.out.print("enter the name :");
				String name=obj1.nextLine();
				System.out.print("enter the password :");
				int pass=obj.nextInt();
				for(int i=0;i<user_Name.length;i++)
				{
					if(name.equals(user_Name[i]))
					{
						if(pass==password[i])
						{
							System.out.println("login successfull");
						}
						else
						{
							System.out.println("incorrect password");
						}
					}
					else
					{
						System.out.println("incorrect user name");
					}
				}
				break;
			case 3:
				System.out.println("Thank you");
				break;
			default:
				System.out.print("invalid choice");
			}
		
		}while(option<3);
	}
}