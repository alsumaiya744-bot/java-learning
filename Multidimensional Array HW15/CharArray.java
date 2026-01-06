import java.util.Scanner;
class CharArray
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		char ch[][]=new char[4][5];
		for(int i=0;i<ch.length;i++)
		{
			System.out.println("******************************************************** ");
			for(int j=0;j<ch[i].length;j++)
			{
				System.out.print("enter the character at "+i+","+j+" index:");
				ch[i][j]=obj.next().charAt(0);
			}
		}
		System.out.println("*********Characters********* ");
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				ch [i][j]=Character.toUpperCase(ch[i][j]);
				System.out.print((ch[i][j])+" ");
			}
			System.out.println();
		}
	}
}