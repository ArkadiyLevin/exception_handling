public class L1_Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 0;
        int result = searchElement(arr, element);
        if (result == -1) {
            System.out.println("Длина массива меньше 3.");
        } else if (result == -2) {
            System.out.println("Искомый элемент не найден.");
        } else if (result == -3) {
            System.out.println("Массив пуст.");
        } else {
            System.out.printf("Искомый элемент имеет индекс %d.", result);

        }
    }

    public static int searchElement(int[] arr, int element) {
        if (arr == null) {
            return -3;
        }
        int min_length = 3;
        if (arr.length < min_length) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -2;
    }
}
