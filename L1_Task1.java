public class L1_Task1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int min_length = 3;

        int result = checkArrayLength(arr, min_length);
        System.out.println(result);
    }
    public static int checkArrayLength(int[] arr, int min_length){
        if (arr.length < min_length){
            return  -1;
        }
        else {
            return arr.length;
        }
    }
}
