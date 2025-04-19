package Sort.Problem;


import java.util.Arrays;

// first missing positive number
public class Leet_41 {

    public static void main(String[] args) {
        int arr[] = {1,2,0};
//        int arr[] = {3, 4, -1, 1};
        cycleSort(arr);


        System.out.println("cycleSort==> " + Arrays.toString(arr));

        int result = positiveInt(arr);

        System.out.println("result==>" + result);
    }

    static void cycleSort(int arr[]) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int correct = arr[start]-1;
            if (arr[start] >0 && arr[start] <= end && arr[start] != arr[correct]) {
                swap(arr, start, correct);
            } else {
                start++;
            }
        }
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int positiveInt(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                return i+1;
            }
        }

        return arr.length+1;
    }
}
