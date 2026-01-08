import java.util.Scanner;
class Bank
{
	Scanner obj=new Scanner(System.in);
	float balance;
	void inputBalance()
	{
		System.out.print("enter the balance :");
		balance=obj.nextFloat();
	}
	void deposit()
	{
		System.out.print("enter the amount to be deposite :");
		float deposite_Amount=obj.nextFloat();
		System.out.println("Amount Deposited Successfully");
		balance=balance+deposite_Amount;
		System.out.println("Balance ="+balance);		
	}
	void withdraw()
	{
		System.out.print("enter the amount to be withdraw :");
		float withdraw_Amount=obj.nextFloat();
		if(balance>=withdraw_Amount)
		{
			System.out.println("Amount Withdrawn Successfully");	
			balance=balance-withdraw_Amount;
			System.out.println("Balance after withdraw ="+balance);	
		}
		else
		{
			System.out.println("Your balance is low Sorry! unable to withdraw");	
		}
	}
	void displayBalance()
	{
		System.out.println(" Current Balance ="+balance);	
	}
	public static void main(String[] args)
	{
		Scanner obj1=new Scanner(System.in);
		Bank obj2=new Bank();
		obj2.inputBalance();
		byte choice;
		do
		{
			System.out.print("Menu\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit\n");
			System.out.print("Enter your choice :");
			choice=obj1.nextByte();
			switch(choice)
			{
				case 1:
					obj2.deposit();
					break;
				case 2:
					obj2.withdraw();
					break;
				case 3:
					obj2.displayBalance();
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