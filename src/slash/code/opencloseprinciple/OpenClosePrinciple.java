package slash.code.opencloseprinciple;

public class OpenClosePrinciple {}
abstract class Shape{
    abstract public void calculateArea();
}
    class Rectangle extends Shape{
        double height;
        double width;

        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }

        @Override
        public void calculateArea() {
            System.out.println(height*width);

        }
    }
    class Circle extends Shape{
    double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public void calculateArea() {
            System.out.println(3.14*radius*radius);
        }
    }
    class Triangle extends  Shape{
    double base;
    double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public void calculateArea() {
            System.out.println(0.5*base*height);
        }
    }

    class AreaCalculator{


        public void calculate(Shape shape){
            shape.calculateArea();

        }
    }

    class Area{

        public static void main(String[] args) {
            AreaCalculator cal=new AreaCalculator();
            cal.calculate(new Rectangle(20,10));
            cal.calculate(new Circle(10));
            cal.calculate(new Triangle(10,5));

        }
    }


