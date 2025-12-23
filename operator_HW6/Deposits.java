class Deposits
{
	public static void main(String[] args)
	{
		double deposits=25000;
		byte InterestRate=7;
		byte time=4;
		double interest=(deposits*InterestRate*time)/100;
		double balance=deposits+interest;
		System.out.println("total balance after 4 years ="+balance);
		;
		
	}
	
}