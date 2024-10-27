package src.SeptPractice.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue q= new PriorityQueue(5);
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.add(6);
        System.out.print(q+"\t");
    }
}
