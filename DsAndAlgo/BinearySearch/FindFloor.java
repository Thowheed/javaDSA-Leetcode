package BinearySearch;

public class FindFloor {
    public static void main(String[] args) {
        int array[] = { 2, 3, 5, 14, 16, 18 };
        int target = 15;
        System.out.println(floorOfANumber(array, target));
    }

    static int floorOfANumber(int array[], int target) {
        if (target < array[0])
            return -1;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return array[end];
    }
}
