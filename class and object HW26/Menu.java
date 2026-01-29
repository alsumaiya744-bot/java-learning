import java.util.Scanner;
class Menu
{
	Scanner obj=new Scanner(System.in);
	void menu()
	{
		System.out.print("enter your balance :");
		int balance=obj.nextInt();
		int choice=0;
		do
		{
			System.out.println("menu :");
			System.out.print("1. deposite\n2. withdraw\n3. display balance\n4. exit\n");
			System.out.print("enter your choice :");
			choice =obj.nextInt();
			switch(choice)
			{
				case 1:
					Deposit de=new Deposit();
					balance=de.AmountDeposit(balance);
					break;
				case 2:
					Withdraw wi=new Withdraw();
					balance=wi.AmountWithdraw(balance);
					break;
				case 3:
					DisplayBalance di=new DisplayBalance();
					di.display(balance);
					break;
				case 4:
					System.out.println("Thank You");
					break;
				default:
					System.out.println("invalid choice");
			}
		}while(choice!=4);
	}
}