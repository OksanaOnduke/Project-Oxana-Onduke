public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String colorFill;
    private String colorBorder;

    public Triangle(double sideA, double sideB, double sideC, String colorFill, String colorBorder) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getColorFill() {
        return colorFill;
    }

    @Override
    public String getColorBorder() {
        return colorBorder;
    }
}
