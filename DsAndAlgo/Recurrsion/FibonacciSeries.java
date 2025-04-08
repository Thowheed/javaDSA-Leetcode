package Recurrsion;

public class FibonacciSeries {

    public static void main(String[] args) {
        //formula
        //f(n) = f(n-1)+f(n-2); // this is recurrence relation

        int ans = fibo(4);
        System.out.println("fibnocci==> "+ans);
    }

    public static int fibo(int n){

//        {0,1,1,2,3,5,8,13..}
        // so if it is less than 2 we return the value itself
        if( n < 2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}
