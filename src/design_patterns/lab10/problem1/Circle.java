package design_patterns.lab10.problem1;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * radius * Math.PI;
    }
}
