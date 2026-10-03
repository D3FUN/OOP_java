public abstract class Triangle {
    protected final double sideA;
    protected final double sideB;
    protected final double sideC;

    protected Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("All sides must be positive");
        }
        if (sideA + sideB <= sideC
                || sideA + sideC <= sideB
                || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("The sides do not form a triangle");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(
                halfPerimeter
                        * (halfPerimeter - sideA)
                        * (halfPerimeter - sideB)
                        * (halfPerimeter - sideC));
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public abstract void draw();
}
