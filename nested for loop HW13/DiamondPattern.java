class DiamondPattern
{
	public static void main(String[]args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int s=3;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=(i*2-1);j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}