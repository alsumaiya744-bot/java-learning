import java.util.Scanner;
class Deposit
{
	Scanner obj=new Scanner(System.in);
	int AmountDeposit(int balance)
	{
		System.out.print("enter the amount to be deposit :");
		int deposit=obj.nextInt();
		balance=balance+deposit;
		System.out.println("Amount "+deposit+" deposited successfully");
		return balance;
	}
}