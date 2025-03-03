import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Введення числа і вивід його квадрата
        System.out.print("Введіть ціле число: ");
        int num = scanner.nextInt();
        printSquare(num);

        // 2. Об'єм циліндра
        System.out.print("Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double volume = cylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume);

        // 3. Сума масиву
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Масив чисел: [10, 20, 30, 40, 50]");
        System.out.println("Сума всіх елементів масиву дорівнює " + sumArray(numbers));

        // 4. Реверс рядка
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введіть рядок: ");
        String text = scanner.nextLine();
        String reversed = reverseString(text);
        System.out.println("Рядок в зворотньому порядку: " + reversed);

        // 5. Піднесення до степеня
        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a, b));

        // 6. Вивід рядка n разів
        System.out.print("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введіть текстовий рядок: ");
        String inputText = scanner.nextLine();
        printTextMultipleTimes(n, inputText);
    }

    public static void printSquare(int num) {
        System.out.println("Квадрат числа " + num + " дорівнює " + (num * num) + ".");
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public static void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}