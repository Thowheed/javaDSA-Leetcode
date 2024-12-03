package LinearSearch;

public class Prob1 {
    public static void main(String[] args) {
        int[] arr = {35,23,46,-3,-5,7,87,59};
        int target = 5;
        System.out.println(linearSearch(arr, target));
    };
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0;index<arr.length;index++){
            if(arr[index] == target){
                return index;
            }
        }

        return -1;
    }
}

