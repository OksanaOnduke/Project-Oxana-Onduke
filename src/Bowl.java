public class Bowl {
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
