package Sort.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet442 {
    public static void main(String[] args) {
//        int arr[] = {4,3,2,7,8,2,3,1};
        int arr[] = {1,1,2};

        cycleSort(arr);

        System.out.println(Arrays.toString(arr));

        List<Integer> result = duplicate(arr);

        System.out.println("result==> "+result);
    }

    public static void cycleSort(int[] nums){
        int start = 0;
        int end = nums.length;

        while(start < end){
            int correct = nums[start]-1;
            if(nums[start] != nums[correct]){
                swap(nums,start,correct);
            }else{
                start++;
            }

        }
    }

    public static void swap(int nums[],int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static List<Integer> duplicate(int nums[]){
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != i+1){
                list.add(nums[i]);
            }
        }

        return list;
    }
}
