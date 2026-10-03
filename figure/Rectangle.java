public abstract class Rectangle {
    protected final double width;
    protected final double height;

    protected Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive");
        }
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public abstract void draw();
}
