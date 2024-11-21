package Problem4;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public String toString() {
        return "Equilateral Triangle with side = " + super.toString();
    }
}

