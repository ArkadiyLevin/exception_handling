public class L1_Task3 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1}, {1, 1, 1}, {0,3, 0}};
        int sum = sumElements(matrix);
        System.out.println(sum);
    }


    public static int sumElements(int[][] matrix) {
        int n = matrix.length;
        for (int[] row : matrix) {
            if (row.length != n) {
                throw new RuntimeException("Кол-во строк не равно кол-во столбцов!");
            }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                if (element != 0 && element != 1) {
                    throw new RuntimeException("Массив должен содержать только 0 или 1!");
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
