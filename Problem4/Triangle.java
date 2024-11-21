package Problem4;

public class Triangle extends Shape {
    private double a, b, c; // Sides of the triangle

    public Triangle(double a, double b, double c) {
        if (a + b > c && b + c > a && c + a > b) { // Check triangle inequality
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("Sides do not form a valid triangle.");
        }
    }

    @Override
    public void scale(double scaleFactor) {
        a *= scaleFactor;
        b *= scaleFactor;
        c *= scaleFactor;
    }

    @Override
    public double area() {
        // Using Heron's formula
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle with sides a = " + a + ", b = " + b + ", c = " + c + ": " + super.toString();
    }
}

