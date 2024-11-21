package Problem3;

public class Ellipse extends Shape {
    private double a, b;  // Semi-major and semi-minor axes

    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a < b) {
            // Swap values if a is less than b
            double temp = a;
            a = b;
            b = temp;
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * (Math.pow(a * a + b * b, 0.5) - Math.pow(Math.abs(a - b), 2) / 2);
    }
}

