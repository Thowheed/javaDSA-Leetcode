package LeetOcde;


import java.util.*;

// sliding window, binary search
public class Leet209_minSize {

    public static void main(String[] args) {
//        int[] arr = {2, 3, 1, 2, 4, 3};
//        int target = 7;

//        int [] arr = {1,4,4};
//        int target = 4;

//        int [] arr = {1,1,1,1,1,1,1,1};
//        int target = 11;

//        int [] arr = {1,2,3,4,5};
//        int target = 11;

//        int[] arr = {5,1,3,5,10,7,4,9,2,8};
//        int target = 15;

        int [] arr = {8};
        int target = 7;

        int result = findTarget(arr, target);

        System.out.println("result==>" + result);


    }

    static int findTarget(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int count = arr[0];
        int indexCount = 1;
        int mapCount = 0;
        Map<Integer, Integer> intCount = new TreeMap<>();

        while (start < arr.length && end <= arr.length ) {
            if(arr[start] >= target || arr[arr.length-1] >= target){
                return 1;
            }

//            if (count == target) {
//                intCount.put(mapCount++, indexCount);
//                start++;
//
//            }

            if (end < arr.length) {
                count += arr[end];
            }
                end++;
                indexCount++;
                if (count >= target) {
                    intCount.put(mapCount++, indexCount);
                    start++;
                    count = arr[start];
                    end = start + 1;
                    indexCount = 1;
                }


        }

        System.out.println("intCount"+intCount);
        if (intCount.isEmpty()) {
            return 0;
        } else {
            return Collections.min(intCount.values());
        }

    }
}
