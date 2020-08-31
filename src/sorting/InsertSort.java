package sorting;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = SortUtils.getRandomArray(5);
        sort(array);
        System.out.println("排序后的结果: " + Arrays.toString(array));
    }

    public static void sort(int[] arr) {
        int i, j, num, n = arr.length;
        // 从数组第二个遍历到数组最后一个
        for (i = 1; i < n; i++) {
            j = i - 1; // 从此次需要排序的数的前一个数开始比较
            num = arr[i]; // 将此次需要排序的数先存起来
            // 从当前需要排序的数的前一个逆序遍历至数组第一个元素
            while (j >= 0 && arr[j] > num) {  // 一直向前对比，直到 arr[j] 比 num 小为止
                // 进入这里说明 arr[i] 比 num ，需要把 num 放到 arr[i] 前面 （即二者交换位置）
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                // 交换完后继续与前面的元素对比，直至遍历到数组第一个元素
                j--;
            }
            System.out.println("第" + i + "次排序：" + Arrays.toString(arr));
        }
    }
}
