public class Main {
public static void main(String[] args) {
        String[][] testArray = {
        {"1", "2", "3", "4"},
        {"5", "6", "7", "8"},
        {"9", "10", "11", "12"},
        {"13", "14", "15", "16"}
        };

        try {
        ArrayProcessor processor = new ArrayProcessor(testArray);
        int result = processor.processArray();
        System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
        System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
        System.err.println("Ошибка данных массива: " + e.getMessage());
        }
        }
        }