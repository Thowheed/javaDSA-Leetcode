package Leetcode;

public class Leet88 {
    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;

        int[] nums1 = {0};
        int m = 0;

//        int [] nums2 = {2,5,6};
//        int n = 3;

        int [] nums2 = {1};
        int n = 1;

        int count = n;
        n=n-1;

        for(int i = nums1.length-1; i>=0;i--){
            if(i == (n+count)-1){
                break;
            }
                nums1[i] = nums2[n];
                n = (n > 0) ? n - 1 : 0;
                if (i != 0 && nums2[n] < nums1[i - 1]) {
                    int temp = nums1[i - 1];
                    nums1[i - 1] = nums1[i];
                    nums1[i] = temp;

                }

        }

        for(int num: nums1){
            System.out.println("num==>"+num);
        }
    }
}
