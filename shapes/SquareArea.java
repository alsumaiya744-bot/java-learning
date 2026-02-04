package shapes;
public class SquareArea extends Shape {

    SquareArea(double value)
    {
        super(value);
    }
    @Override
    void calculateArea() {
        double squareArea=value*value;
        System.out.println("Area of square : "+squareArea);
    }
    
}
