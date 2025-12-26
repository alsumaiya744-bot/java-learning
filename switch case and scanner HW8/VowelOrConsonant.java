import java.util.Scanner;
class VowelOrConsonant
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter a character to check weather it is vowel or consonant:");
		char ch=obj.next().charAt(0);
		if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))
		{
		switch(Character.toLowerCase(ch))
		{
			case 'a':
				System.out.println("vowel");
				break;
			case'e':
				System.out.println("vowel");
				break;
			case 'i':
				System.out.println("vowel");
				break;
			case 'o':
				System.out.println("vowel");
				break;
			case 'u':
				System.out.println("vowel");
				break;
			default:
				System.out.println("consonant");
			
		}
		}
		else
		{
			System.out.println("invalid character");
		}
	}
	
}