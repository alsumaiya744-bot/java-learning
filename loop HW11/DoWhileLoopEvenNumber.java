class DoWhileLoopEvenNumber
{
	public static void main(String[] args)
	{
		int a=1;
		System.out.println("print even number from 1 to 30 using do-while loop :");
		do
		{
			if(a%2==0)
			{
				System.out.println(a+"is the even number");
			}
			a++;
		}while(a<=30);
	}
}