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