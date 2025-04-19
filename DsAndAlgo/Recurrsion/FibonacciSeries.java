package Recurrsion;

public class FibonacciSeries {

    public static void main(String[] args) {
        //formula
        //f(n) = f(n-1)+f(n-2); // this is recurrence relation

        int ans = fibo(4);
//        int ans = fibo(50);
        System.out.println("fibnocci==> "+ans);

        // recursive call
        // if you are calling a function again and again you can consider it as a seperate call in stack


//        print(n+1);
        // this is call tail recursion
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
