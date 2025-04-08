package Sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[]arr={5,10,1,3,2,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int last = arr.length-i-1;

            int maxIndex = findMax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];

        arr[first]= arr[second];
        arr[second] = temp;
    }

    static int findMax(int [] arr,int start,int last){
        int max = start;

        for(int i = start;i<=last;i++){
            if(arr[max] < arr[i])
                max = i;
        }

        return max;
    }
}
