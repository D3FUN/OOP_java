public abstract class Square {
    protected final double side;

    protected Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public abstract void draw();
}
