import java.util.Random;
import java.util.Scanner;


public class SimpleArrayProgram {
    public static void main(String[] args) {
        int[] array = {5, 7, 55, 86, 5, 100, 1, 3, 12, 3, 4, 17, 21, 48, 99};
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Ось наш масив:");
        printArray(array);

        insertionSort(array);

        System.out.println("Відсортований масив:");
        printArray(array);

        int target = 4; // Пошук числа 4
        System.out.println("Шукаємо число: " + target);

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Число " + target + " є на позиції " + index);
        } else {
            System.out.println("Число " + target + " не знайдено.");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

