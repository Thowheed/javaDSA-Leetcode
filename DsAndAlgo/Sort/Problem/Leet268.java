package Sort.Problem;

import java.util.Arrays;
// amazon question
public class Leet268 {
    public static void main(String[] args) {
//     int[] arr = {3,0,1};
        int[] arr = {0,1};

        cyclicSort(arr);
     int result = findMissiing(arr);
     System.out.println(Arrays.toString(arr));
     System.out.println("missingDigit==>"+result);
    }

    static void cyclicSort(int[] arr){
        int start = 0;
        int end = arr.length;

        while(start<end){
            int correct = arr[start];
            if (arr[start] < end && arr[start] != arr[correct]) {
                swap(arr,start,correct);
            }
            else{
                start++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static int findMissiing(int arr[]){
        for(int i =0;i<arr.length;i++){
            if(i != arr[i]){
                return i;
            }
        }
        return arr.length;
    }
}
