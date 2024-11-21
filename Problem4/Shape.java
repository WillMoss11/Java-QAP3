package Problem4;

public abstract class Shape implements Scalable {
    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape: area = " + area() + ", perimeter = " + perimeter();
    }
}
