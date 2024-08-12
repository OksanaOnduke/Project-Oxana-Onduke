import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a = 9, b = 7;
        String s = "hbbuj";
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        counter(a, b);
        plusOrMinus(4);
        negativeNumber(a);
        printStrings(a,s);
        years(a);
        massive1();
        massive2();
        massive3();
        massive4();
        massive5(a,b);
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = -3;
        int b = 2;
        if (a + b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = 100;
        if (value > 0 & value <= 100)
            System.out.println("Желтый");
        if (value <= 0)
            System.out.println("Красный");
        else
            System.out.println("Зеленый");
    }

    static void compareNumbers() {
        int a = 1002;
        int b = 721;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    static boolean counter(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


    static void plusOrMinus(int a) {
        if (a >= 0)
            System.out.println("число положительное");
        else
            System.out.println("число отрицительное");
    }

    static boolean negativeNumber(int a) {
        return a < 0;
    }

    static void printStrings(int a, String s) {
        int j = a;
        while (j != 0) {
            System.out.println(s);
            j--;
        }
    }

    static boolean years(int a) {
        return a % 4 == 0 && a % 400 == 0;
    }

    static void massive1() {
        int[] data = {1, 1, 0, 0, 1, 0};
        data[0] = 1;
        int j = 0;
        while (j < data.length) {
            if (data[j] == 0) {
                data[j] = 1;
            } else {
                data[j] = 0;
            }
            j++;
            if (j == data.length)
                System.out.println(Arrays.toString(data));
        }
    }

    static void massive2() {
        int[] data = new int[100];
        data[0] = 1;
        for (int i = 1; i < data.length + 1; i++) {
            System.out.println(i);
        }
    }


    static void massive3() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int j = 0;
        while (j < data.length) {
            if (data[j] < 6)
                data[j] = data[j] * 2;
            j++;
            if (j == data.length) {
                System.out.println(Arrays.toString(data));
            }
        }
    }

    static void massive4() {
        int[][] data = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    data[i][j] = 1;
                }
            }
        }
        for (int l = 0; l < data.length; l++) {
            System.out.println(Arrays.toString(data[l]));
        }
    }

    static void massive5(int a, int b) {
        int[] data=new int[a];
        for (int i = 0; i < b+2 ; i++) {
            data[i] = b;
        }
    }
}


