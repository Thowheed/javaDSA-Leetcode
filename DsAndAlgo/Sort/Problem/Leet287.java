package Sort.Problem;

import java.util.Arrays;

// amazon question && microsoft
public class Leet287 {
//    You must solve the problem without modifying the array nums and using only constant extra space.
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
//        int arr[] = {3,3,3,3,3};

        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("findDuplicate===> "+findDuplicate(arr));
    }

    static void cycleSort(int [] arr){
        int start =0;
        int end = arr.length;

        while(start<end){
            int correct = arr[start]-1;
            // if it is repeated like [3,3,3,3]
            // this condition fails due to 3 == 3 and start gets incremented
            if(arr[start] != arr[correct]){
                swap(arr,start,correct);
            }
            else{
                start++;
            }
        }
    }

    static void swap(int arr[],int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findDuplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i] != i+1){
                return arr[i];
            }
        }
        return -1;
    }

//    41. First Missing Positive

}
