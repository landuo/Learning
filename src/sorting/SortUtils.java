package sorting;

import java.util.Arrays;
import java.util.Random;

public class SortUtils {
    public static int[] getRandomArray() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("生成随机数组：" + Arrays.toString(arr));
        return arr;
    }

    public static int[] getRandomArray(int length) {
        int[] arr = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("生成随机数组：" + Arrays.toString(arr));
        return arr;
    }
}
