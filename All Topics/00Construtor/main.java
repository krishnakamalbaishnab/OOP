
class Rectangle {
    double length;
    double width;
    double area;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        this.area = this.length * this.width;
    }
}

public class main {
    public static void main(String[] args) {
        // Using default constructor
        Rectangle r1 = new Rectangle();
        r1.calculateArea();
        System.out.println("Area of Rectangle r1 = " + r1.area);

        // Using parameterized constructor
        Rectangle r2 = new Rectangle(5.0, 3.0);
        r2.calculateArea();
        System.out.println("Area of Rectangle r2 = " + r2.area);
    }

}
