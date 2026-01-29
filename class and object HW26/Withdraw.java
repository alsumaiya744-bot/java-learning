import java.util.Scanner;
class Withdraw
{
	Scanner obj=new Scanner(System.in);
	int AmountWithdraw(int balance)
	{
		System.out.print("enter the amount to be withdraw :");
		int withdraw=obj.nextInt();
		if(balance>=withdraw)
		{
			balance=balance-withdraw;
			System.out.print("Amount "+withdraw+" withdrawed successfully");
			return balance;
		}
		else
		{
			System.out.println("your balance is insufficiant for withdraw");
		}
		return balance;
	}
}