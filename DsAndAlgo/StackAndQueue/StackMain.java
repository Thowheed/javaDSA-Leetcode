package StackAndQueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStackImpl stack = new CustomStackImpl(5);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(7);
        stack.push(10);
//        stack.push(10); // error is thrown since stack is full


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        DynamicStack stack1 = new DynamicStack(5);

        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(7);
        stack1.push(10);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(7);
        stack1.push(10);

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());



    }
}
