package BinearySearch;

import java.util.Arrays;

public class Prob1 {
    public static void main(String[] args) {
        int array[] = { 121, 1, 20, 45, 69, 80, 150, 200 };
        int descArr[] = {200,150,50,49,30,10,9};
        int target = 200;
        int target1 = 49;
        Arrays.sort(array);
        System.out.println("sorted array" + Arrays.toString(array));
        System.out.println(binarySearch(array, target));
        System.out.println("orderbinarySearch-==>"+ orderbinarySearch(descArr,target1));
    }

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = start+end/2;
            int mid = start + (end - start) / 2;

            // sometime the limit may exceed int so this formula is used instead

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;

        }
        return -1;
    }

    // orderAgnostic
    // if we handle both descending and ascending it is called orderagnostic
    static int orderbinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < end;

        while (start <= end) {
            // int mid = start+end/2;
            int mid = start + (end - start) / 2;

            // sometime the limit may exceed int so this formula is used instead

            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (arr[mid] > target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }

        }
        return -1;
    }
}
