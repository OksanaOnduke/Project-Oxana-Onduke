public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5]; {
            persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
            persArray[1] = new Person("Petrov Petr", "Tester", "petrov@mailbox.com", "892312313", 30000, 31);
            persArray[2] = new Person("Maksimov Maksim", "Director", "maksimov@mailbox.com", "892312314", 40000, 32);
            persArray[3] = new Person("Romanov Roman", "Project Manager", "romanov@mailbox.com", "892312315", 30000, 33);
            persArray[4] = new Person("Novikov Ilya", "Systems Analyst", "novikov@mailbox.com", "892312316", 30000, 34);

            Park park = new Park("Парк приключений");
            park.setAttraction("Американские горки", "10:00 - 20:00", 500.0);
        }
    }
}



