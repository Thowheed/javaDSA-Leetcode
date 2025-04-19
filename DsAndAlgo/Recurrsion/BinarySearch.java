package Recurrsion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,10,15,22,30,100,122};
        int start = 0;
        int end = arr.length-1;

        int target = 100;

        int result = binarySearch(arr,start,end,target);
        System.out.println("result-==> "+result);
    }

    static int binarySearch(int arr[], int start, int end, int target){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target) {
            return mid;
        }
        else if(target < arr[mid]){
            return binarySearch(arr, start,mid -1,target);
        }
        else {
            return binarySearch(arr,mid+1,end,target);
        }
    }
}
