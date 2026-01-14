import java.util.Scanner;
class Balance
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("--------wrong casting balance--------");
		System.out.print("enter balance :");
		double balance=obj.nextDouble();
		System.out.print("enter withdrawal amount :");
		float withdrawal=obj.nextFloat();
		double balanceAferWithdrawal=((int)balance-(int)withdrawal);
		System.out.println("Balance Afer Withdrawal :"+balanceAferWithdrawal);
		System.out.println("--------correct casting balance--------");
		double cBalanceAferWithdrawal=balance-(int)withdrawal;
		System.out.println("Balance Afer Withdrawal :"+cBalanceAferWithdrawal);
	}
}