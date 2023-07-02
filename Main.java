import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float number = getFloatInput("Введите дробное число: ");
        System.out.println("Вы ввели: " + number);
    }

    public static float getFloatInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        float value;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (isValidFloatInput(input)) {
                value = Float.parseFloat(input);
                break;
            } else {
                System.out.println("Ошибка: введите корректное дробное число.");
            }
        }
        return value;
    }

    public static boolean isValidFloatInput(String input) {
        // Проверка формата ввода с помощью регулярного выражения
        String regex = "^[+-]?\\d+(\\.\\d+)?$";
        return input.matches(regex);
    }
}