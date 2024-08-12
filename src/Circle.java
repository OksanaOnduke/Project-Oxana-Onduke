public class Circle implements Shape {
    private double radius;
    private String colorFill;
    private String colorBorder;

    public Circle(double radius, String colorFill, String colorBorder) {
        this.radius = radius;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
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