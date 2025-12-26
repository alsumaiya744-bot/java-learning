import java.util.Scanner;
class AreaCalculator
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("enter a shape name (Circle,Square,Rectangle,Triangle) :");
		String shape=obj.nextLine();
		switch(shape)
		{
			case "Circle":
				System.out.print("enter radius value :");
				float radius=obj.nextFloat();
				float circleArea=3.14f*radius*radius;
				System.out.print("Circle area :"+circleArea+"square units");
				
				break;
			case "Square":
				System.out.print("enter a side value :");
				float side=obj.nextFloat();
				float SquareArea=side*side;
				System.out.print("Square area :"+SquareArea+"square units");
				break;
			case "Rectangle":
				System.out.print("enter length value :");
				float length=obj.nextFloat();
				System.out.print("enter breadth value :");
				float breadth=obj.nextFloat();
				float RectangleArea=length*breadth;
				System.out.printf("Rectangle area :%.2f",RectangleArea+"square units");
				break;
			case "Triangle":
				System.out.print("enter a base value :");
				float base=obj.nextFloat();
				System.out.print("enter a height value :");
				float height=obj.nextFloat();
				float TriangleArea=0.5f*base*height;
				System.out.print("Triangle area :"+TriangleArea+"square units");
				break;
			default:
				System.out.print("invalid shape name");
		}
	}
}