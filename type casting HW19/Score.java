import java.util.Scanner;
class Score
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("--------wrong casting score--------");
		System.out.print("enter player score :");
		long score=obj.nextLong();
		System.out.print("enter time taken by the player :");
		double time=obj.nextDouble();
		int rank=(int)score/(int)time;
		System.out.println("Rank ="+rank);
		System.out.println("--------correct casting score--------");
		int cRank=(int)(score/time);
		System.out.println("Rank ="+cRank);
	}
}