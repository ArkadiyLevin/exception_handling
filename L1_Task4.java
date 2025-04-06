public class L1_Task4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1}, {1, 1, 1}, {0, 1, 0}};
        int result = sumElements(matrix);
        if (result == -1) {
            System.out.println("Кол-во строк не равно кол-во столбцов!");
        } else if (result == -2) {
            System.out.println("Массив должен содержать только 0 или 1!");
        } else {
            System.out.printf("Сумма элементов = %d", result);
        }
    }


    public static int sumElements(int[][] matrix) {
        int n = matrix.length;
        for (int[] row : matrix) {
            if (row.length != n) {
                return -1;
            }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                if (element != 0 && element != 1) {
                    return -2;
                }
            }
        }
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
}