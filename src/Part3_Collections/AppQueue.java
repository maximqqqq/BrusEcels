package Part3_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AppQueue {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<>();
        Deque<String> linkedList1 = new LinkedList<>();
        Deque<String> arrayList = new ArrayDeque<>();
        Queue<String> priorityQueue = new PriorityQueue<>();
        System.out.println("arrayList========= Быстрый");
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("priorityQueue=======Сортирует");
        priorityQueue.add("B");
        priorityQueue.add("A");
        priorityQueue.add("C");
        for (String s1 : priorityQueue) {
            System.out.println(s1);
        }
    }
}
