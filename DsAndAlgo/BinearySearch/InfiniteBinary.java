package BinearySearch;

public class InfiniteBinary {
    public static void main(String[] args) {
        int array[] = {1,22,33,44,55,66,77,88,100,101,103,110,120,150};
        int target = 1;

        System.out.println("infiniteSearch==>"+ ans(array,target));

    }
    public static int ans(int arr[], int target){
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            start = end +1;
            end = start + (end-start+1)*2;
        }
        return binarySearch(arr,target,start,end);
    };
    public static int binarySearch(int []arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
