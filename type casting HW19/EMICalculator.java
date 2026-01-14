import java.util.Scanner;
class EMICalculator
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
			System.out.println("--------correct EMI--------");
			System.out.print("enter principal amount in (long) :");
			long principal=obj.nextLong();
			System.out.print("enter rate of interest in (float) :");
			float rate=obj.nextFloat();
			System.out.print("enter time in year :");
			int time=obj.nextInt();
			float simple_Interest=(principal*rate*time)/100;
			float total=principal+simple_Interest;
			int timeInMonth=time*12;
			float EMI= total/timeInMonth;
			System.out.println("EMI per month :"+EMI);
			System.out.println("--------wrong EMI--------");
			int wrongRate=(int)rate;
			float wrongSimple_Interest=(float)(principal*wrongRate*time)/100;
			float wrongtotal=wrongSimple_Interest+principal;
			float wrongEMI= wrongtotal/timeInMonth; 
			System.out.print("EMI per month :"+wrongEMI);
		}
	}