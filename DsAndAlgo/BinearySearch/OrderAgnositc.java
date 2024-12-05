package BinearySearch;

public class OrderAgnositc {
    public static void main(String[] args) {
        int []arr = {90,75,18,12, 6,4,3,1};
        int target = 90;
        int start = 0;
        int end = arr.length-1;

        //order agnostic will find even if it is asc or desc
        System.out.println("orderAgnostic==>"+ orgerAgnostic(arr, target, start, end));

    }

    public  static int orgerAgnostic( int arr[],int target,int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target)
                return mid;
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid +1;
                }
                else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
