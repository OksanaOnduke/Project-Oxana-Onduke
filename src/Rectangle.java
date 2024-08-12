public class Rectangle implements Shape {
    private double length;
    private double width;
    private String colorFill;
    private String colorBorder;

    public Rectangle(double length, double width, String colorFill, String colorBorder) {
        this.length = length;
        this.width = width;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
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