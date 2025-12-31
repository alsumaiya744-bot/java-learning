class MultiplicationTableDoWhileLoop
{
	public static void main(String[] args)
	{
		int i=1;
		System.out.println("print multiplication table of 5(up to 10) using do-While loop :");
		do
		{
			System.out.println(i+"*5"+" ="+(i*5));
			i++;
		}while(i<=10);
	}
}