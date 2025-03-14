package StackAndQueue;

import java.util.Stack;

public class StackEg {
    public static void main(String[] args) {

        //this is a class
        Stack<Integer> data = new Stack<>();

        data.add(1);
        data.push(2);

        System.out.println(data);
        data.pop();
        System.out.println(data);
        data.pop();
        System.out.println(data);

//        this gives error
//        data.pop();
//        System.out.println(data);

    }
}
