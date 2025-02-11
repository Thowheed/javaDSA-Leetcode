package BinearySearch;

public class SearchInMountain_1095 {
    public static void main(String[] args) {

//        int arr[] = {1, 3, 4, 5, 3,2, 1};
//        int arr[] = {1,5,2};
        int arr[] = {0,1,5,3,0};
//        int arr[] = {1};
        int target = 0;

//        0,1,2,4,2,1
//        if(arr.length > 1)
        System.out.println(search(arr,target));

    }

    public static int search(int arr[], int target) {
        int peak = peakIndex(arr);
        int frstTry = orgerAgnostic(arr, target, 0, peak);
        if (frstTry != -1) {
            return frstTry;
        }

        int secondTry = orgerAgnostic(arr, target, peak+1, arr.length - 1);
        return secondTry;
    }

    ;

    public static int peakIndex(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;

    }

    public static int orgerAgnostic(int arr[], int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
