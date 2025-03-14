package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEg {

    public static void main(String[] args) {
        //queue is a interface

        Queue<Integer> data = new LinkedList<>();

        data.add(3);
        data.add(6);
        data.add(5);
        data.add(2);
        data.add(0);

        System.out.println(data.peek()); //3
        System.out.println(data.remove()); // 3 removed
        System.out.println(data.remove()); // 6 removed

//        dequeue doubly ended queue

//        insert and remove from both front and back

        Deque<Integer> data1 = new ArrayDeque<>();

        // arraydeque has resizable array implementation
        // null elements aren't allowed and faster than linkedlist and stack
        // and not synchronized
        // when we use trees it will be helpful

        data1.add(1);
        data1.addFirst(2);
        data1.addLast(3);
        System.out.println(data1);


    }
}
