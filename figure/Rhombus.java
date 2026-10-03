public abstract class Rhombus {
    protected final double side;
    protected final double height;

    protected Rhombus(double side, double height) {
        if (side <= 0 || height <= 0) {
            throw new IllegalArgumentException("Side and height must be positive");
        }
        this.side = side;
        this.height = height;
    }

    public double calculateArea() {
        return side * height;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public abstract void draw();
}
