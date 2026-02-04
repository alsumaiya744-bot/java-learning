package shapes;
public class CircleArea extends Shape {

    CircleArea(double value) {
        super(value);
    } 
    @Override
    void calculateArea() {
        double circleArea=(3.14)*value*value;
        System.out.println("Area of circle : "+circleArea);
    }
    
}
