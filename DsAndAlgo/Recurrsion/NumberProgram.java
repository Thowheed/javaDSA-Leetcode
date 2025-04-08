package Recurrsion;

public class NumberProgram {

    public static void main(String[] args) {
//        int n =1;

        print(1);
    }

    static void print(int n){
        if(n == 5){
            return;
        }

        System.out.println(n);
        print(n+1);

    }
}
