class Savings
{
	public static void main(String[] args)
	{
		double DepositAmount=50000;
		byte InterestRate=6;
		byte Time=5;
		double Interest=(DepositAmount*InterestRate*Time)/100;
		double balance=DepositAmount+Interest;
		System.out.println("interest Arun will earn :"+Interest);
		System.out.println("Arun total balace after 5 years :"+balance);
		
		
	}
	
}