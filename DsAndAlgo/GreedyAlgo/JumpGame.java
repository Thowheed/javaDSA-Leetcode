package GreedyAlgo;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr =  {2,3,1,1,4};
        int [] arr1 = {3,2,1,0,4};
        System.out.println(findPlace(arr1));

    }

    public static boolean findPlace(int [] nums){
//        if(nums.length == 1){
//            return false;
//        }
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start < end) {
//            if (nums[start] > 0) {
//                start += nums[start];
//                System.out.println("start"+start+"end"+end);
//                if (start == end) {
//                    return true;
//                }
//               return false;
//                System.out.println("Inside outer if");
//            }
//            else{
//                return false;
//            }
//
//
//        }
//        System.out.println("outside");
//        return false;

        // the above approach failed

//        [2,3,1,1,4]
        int stepsLeft = nums[0];
        for(int i = 1;i<nums.length;i++){
                // minusing step for every one step
                stepsLeft--;

                if(stepsLeft<0){
                    return false;
                }
                if(i == nums.length-1){
                    return true;
                }

                if(stepsLeft < nums[i]){
                    stepsLeft= nums[i];
                }

        }
        return true;
    }
}

