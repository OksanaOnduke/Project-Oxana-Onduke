public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red", "Black");
        Shape rectangle = new Rectangle(4, 6, "Blue", "Green");
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Orange");

        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Color Fill: " + circle.getColorFill());
        System.out.println("Color Border: " + circle.getColorBorder());

        System.out.println("\nRectangle:");
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Color Fill: " + rectangle.getColorFill());
        System.out.println("Color Border: " + rectangle.getColorBorder());

        System.out.println("\nTriangle:");
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Color Fill: " + triangle.getColorFill());
        System.out.println("Color Border: " + triangle.getColorBorder());
        System.out.println();

        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Миша");
        Cat cat2 = new Cat("Белка");

        Bowl bowl = new Bowl(10);
        Cat.setBowl(bowl);
        cat1.eat(5);
        cat2.eat(8);
        cat1.eat(3);

        System.out.println(cat1.name + "сыт: " + cat1.isFull());
        System.out.println(cat2.name + " сыт: " + cat2.isFull());
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        dog1.run(450);
        dog1.swim(5);
        cat1.run(150);
        cat1.swim(50);
    }
}
