package Sort.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet448 {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        cycleSort(arr);
        System.out.print("arr==>  "+ Arrays.toString(arr));


        List<Integer> result = findTheMissingDigit(arr);

        System.out.println("result==>  "+result);



    }

    static void cycleSort(int arr[]){
        int start = 0;
        int end = arr.length;

        while(start<end){
            int correct = arr[start]-1;

            if(arr[correct] != arr[start] ){
                swap(arr,start,correct);
            }
            else {
                start++;
            }
        }

    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static List<Integer> findTheMissingDigit(int arr[]){
        List<Integer> result = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(i+1 != arr[i]){
                result.add(i+1);
            }
        }

        return result;
    }
}
