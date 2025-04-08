package Sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4, 1};
        cycleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int correct = arr[start]-1;
            if (arr[correct] == arr[start]) {
                start++;
            } else {
                swap(arr,start,correct);
            }
        }
    }

    static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
