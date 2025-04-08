package BinaryTwoDArray;

import java.util.Arrays;

public class Prob1 {

    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
//                {1,3}
        };

        System.out.println("matrix==>"+ Arrays.toString(binarySearch(matrix,3)));
    }

    public static int[] binarySearch(int[][] arr, int target){
        int row = 0;
        int column = arr.length-1;
        while(row < arr.length && column>=0 ){
            if(arr[row][column] == target){
                return new int[]{row,column};
            }
            else if(arr[row][column] < target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
