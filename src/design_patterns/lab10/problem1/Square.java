package design_patterns.lab10.problem1;

public class Square implements Figure {
    private final double height;

    public Square(double height) {
        this.height = height;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }
}
