public class BubbleSort {
    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temporary = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temporary;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {7, 3, 9, 2, 5, 1};

        System.out.print("До сортировки:    ");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.print("После сортировки: ");
        printArray(numbers);
    }
}
