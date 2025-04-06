//  Реализуйте метод subArraysWithExceptionHandling, который принимает
//  два массива целых чисел. Метод должен возвращать новый массив, где
//  каждый элемент является разностью соответствующих элементов двух входных
//  массивов. Если длины массивов не равны, выбрасывайте
//  IllegalArgumentException с сообщением "Массивы разной длины". Если
//  результат разности оказывается отрицательным, выбрасывайте
//  RuntimeException с сообщением "Отрицательный результат разности".

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1_HW3 {
    public static void main(String[] args) {
        List<String> errors = new ArrayList<>();
        int[] a = {10, 20, 30};
        int[] b = {5, 15, 35};
        int[] result = subArraysWithExceptionHandling(a, b, errors);
        System.out.println(Arrays.toString(result)); // Ожидаемыйрезультат: исключение RuntimeException
        int[] c = {10, 20};
        int[] d = {5, 15, 25};
        result = subArraysWithExceptionHandling(c, d, errors); // Ожидаемый результат: исключениеIllegalArgumentException
        System.out.println(Arrays.toString(result));
// Проверяем, если были ошибки
        if (!errors.isEmpty()) {
            System.out.println("Обнаружены ошибки:");
            for (String error : errors) {
                System.out.println(error);
            }
        } else {
            System.out.println("Ошибок не обнаружено.");
        }
    }

    public static int[] subArraysWithExceptionHandling(int[] a, int[] b, List<String> errors) {
        if (a.length != b.length) {
            errors.add("Массивы разной длины");
            return new int[0]; // Возвращаем пустой массив, так какдлины массивов не совпадают
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
            if (result[i] < 0) {
                errors.add("Отрицательный результат разности в позиции" + i + ":" + result[i]);
            }
        }
        return result;
    }
}

