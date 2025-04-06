public class L1_Task7 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        if (checkArray(arr)) {
            System.out.println("Кол-во строк и столбцов совпадает!");
        } else {
            System.out.println("Кол-во строк и столбцов не совпадает!");
        }
    }

    public static boolean checkArray(int[][] arr) {
        int rows = arr.length;
        if (rows == 0) {
            return true;

        }
        for (int i = 1; i < rows; i++) {
            if (arr[i].length != rows) {
                return false;
            }
        }
        return true;
    }
}
