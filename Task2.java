public class Task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // Define and populate the intArray
            
            int d = 0;
            if (d != 0) {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                System.out.println("Ошибка: деление на ноль.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Исключение: " + e);
        }
    }
}
