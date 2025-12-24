import java.util.Scanner;
class ChecksAlphabet
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch=obj.next().charAt(0);
		int a=ch;
		if(((a>=65)&&(a<=90))||((a>=97)&&(a<=122)))
		{
			System.out.println(ch+"is an alphabet");
		}
		else
		{
			System.out.println(ch+"is not an alphabet");
		}
	}
}