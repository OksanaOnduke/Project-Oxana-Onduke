class Animal {
    protected String name;
    protected static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        // Пустой метод для переопределения в подклассах
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private final int maxRunDistance = 200;
    private boolean isFull;
    private static Bowl bowl;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(int amount) {
        if (bowl.getFood() >= amount) {
            bowl.reduceFood(amount);
            isFull = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не хватает еды в миске, чтобы поесть.");
        }
    }

    public static void setBowl(Bowl bowl) {
        Cat.bowl = bowl;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }
}

class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " еды в миску.");
        }
    }

    public void reduceFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }

    public int getFood() {
        return food;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Рекс");
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Барсик");

        Bowl bowl = new Bowl(10);  // Создаем миску с 10 единицами еды
        Cat.setBowl(bowl);  // Устанавливаем миску для котов

        cat1.eat(5);  // Кот пытается поесть 5 единиц
        cat2.eat(8);  // Кот пытается поесть 8 единиц
        cat1.eat(3);  // Кот пытается поесть 3 единицы

        System.out.println(cat1.name + " сыт: " + cat1.isFull());
        System.out.println(cat2.name + " сыт: " + cat2.isFull());
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        dog1.run(450);
        dog1.swim(5);
        cat1.run(150);
        cat1.swim(50);  // Попытка плавания кота
    }
}








