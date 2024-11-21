package Problem3;

public abstract class Shape {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    // Getter
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}

