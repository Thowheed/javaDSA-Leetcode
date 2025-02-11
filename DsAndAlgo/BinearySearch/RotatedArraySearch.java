package BinearySearch;

public class RotatedArraySearch {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int[] nums2 = {7, 0, 1, 2, 4, 5, 6};

        int[] nums3 = {2, 4, 5, 6, 7, 0, 1};
        int[] nums4 = {0, 1, 2, 4, 5, 6, 7};

//        0,1,2,4,5,6,7
//                7,0,1,2,4,5,6
//                        6,7,0,1,2,4,5
//                                5,6,7,0,1,2,4
//                                        4,5,6,7,0,1,2
//                                                2,4,5,6,7,0,1

//        7,0,1,2
        System.out.println(findPivot(nums));
        int target = 2;
        int pivot = findPivot(nums);

       int result =  findTargetIndex(nums,target,pivot);

       System.out.println(result);
    }

    public static int findTargetIndex(int[] nums, int target, int pivot){

        if (nums[pivot] == target) {
            return nums[pivot];
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0,pivot-1);
        }

        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    public static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
//                System.out.println(nums[mid]);
                return mid;
            }
            if (mid > start && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int nums[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
