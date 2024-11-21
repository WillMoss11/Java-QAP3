package Problem3;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side, side);  // All sides are equal for an equilateral triangle
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side1, 2);  // Area for equilateral triangle
    }

    @Override
    public double getPerimeter() {
        return 3 * side1;  // Perimeter for equilateral triangle
    }
}


