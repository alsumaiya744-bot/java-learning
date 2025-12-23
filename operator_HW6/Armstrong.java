class Armstrong
{
	public static void main(String[] args)
	{
		int a=1234;
		int b=a%10;
		int c=a/10;
		int d=a%10;
		int e=a/10;
		int f=a%10;
		int g=a/10;
		int h=(b*b*b*b)+(d*d*d*d)+(f*f*f*f)+(g*g*g*g);
		boolean i=(a==h);
		System.out.println("The given number is Armstrong ?"+i);
	}
	
}