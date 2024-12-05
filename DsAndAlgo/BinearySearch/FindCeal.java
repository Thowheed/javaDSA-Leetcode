package BinearySearch;

public class FindCeal {

    public static void main(String[] args) {
        int array[] = { 2, 3, 5, 14, 16, 18 };
        int target = 15;
        System.out.println(cealingOfANumber(array, target));
    }

    static int cealingOfANumber(int array[], int target) {
        if (target > array[array.length - 1])
            return -1;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target)
                return mid;
            else if (target < array[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return array[start];
        // wwe are returning start because it will be nearer and loops end.
    }
}
