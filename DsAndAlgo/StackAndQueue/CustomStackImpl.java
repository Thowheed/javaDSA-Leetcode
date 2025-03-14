package StackAndQueue;

public class CustomStackImpl {

    protected int[] data;
    int ptr = -1;
    private static final int DEFAULT_SIZE = 10;

    public  CustomStackImpl(){
        this(DEFAULT_SIZE);
        // setting default size for the array in initial
    }

    public CustomStackImpl(int size){
        this.data = new int[size];
    }

    //adding and returning true and increasing pointer

    public boolean push(int value){

        //array may be full at a time when it reaches last index so we should check it

        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = value;

        return true;

    }

    public boolean isFull(){
        return ptr == data.length-1; // ptr is at last index
    }

    private boolean isEmpty(){
        return ptr == -1;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;

//        or
//       return data[ptr--];
    }

    public int peek() throws StackException{
        //return what is at top

        if(isEmpty()){
            throw new StackException("Cannot peek an empty stack");
        }
        return data[ptr];
    }



}
