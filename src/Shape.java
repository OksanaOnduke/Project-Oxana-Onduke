interface Shape {
    double calculateArea();

    default double calculatePerimeter() {
        return 0;
    }

    String getColorFill();

    String getColorBorder();
}