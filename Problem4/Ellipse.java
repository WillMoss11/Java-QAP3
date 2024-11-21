package Problem4;

public class Ellipse extends Shape {
    private double a; // Semi-major axis
    private double b; // Semi-minor axis

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void scale(double scaleFactor) {
        a *= scaleFactor;
        b *= scaleFactor;
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        // Approximation for the perimeter of an ellipse
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public String toString() {
        return "Ellipse with a = " + a + ", b = " + b + ": " + super.toString();
    }
}

