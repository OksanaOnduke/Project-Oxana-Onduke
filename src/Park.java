public class Park {
    private String name;
    private Attraction attraction;

    public Park(String name) {
        this.name = name;
    }

    public void setAttraction(String name, String workingHours, double price) {
        this.attraction = new Attraction(name, workingHours, price);
    }

    // Внутренний класс Attraction
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }
    }

}