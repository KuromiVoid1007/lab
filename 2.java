import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества элементов массива
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        // Создаем массив
        int[] numbers = new int[n];

        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Нахождение наибольшего числа
        int max = numbers[0]; // Инициализируем max первым элементом массива
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Вывод результата
        System.out.println("Наибольшее число в массиве: " + max);

        scanner.close();
    }
}