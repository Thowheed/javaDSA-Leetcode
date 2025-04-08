package RandomProblem;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Even_oddswap {
    
    
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Try programiz.pro");
        int start = 0;
        int end = a.length-1;
        while(start < end){
            if(a[start]%2 == 0 ){
                start++;
            }
            else if(a[end]%2 !=0 ){
                end--;
            }
            else{
               int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }

        // while(start <= end){
        //     int temp;
        //     if(a[start]%2 == 0 ){
        //         temp = a[start];
        //         a[start] = a[end];
        //         a[end] = temp;
        //         start++;
        //         end--;
        //     }
        //     else if(a[start]%2 !=0 && a[end]%2 != 0){
        //         start++;
        //     }
        //     else{
        //         start++;
        //         end--;
        //     }
        // }
        System.out.println(Arrays.toString(a));
    }
}