package unit3.Day13;

import java.util.NoSuchElementException;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueDemo {

    private Node front;
    private Node rear;
    private int length;

    public QueueDemo() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        int result = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        length--;
        return result;
    }

    public int first() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        return front.data;
    }

    public int last() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        return rear.data;
    }

    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo();

        queue.enqueue(10);
        queue.enqueue(45);
        queue.enqueue(89);

        System.out.println(queue.dequeue());  // Output: 10
        System.out.println(queue.first());    // Output: 45
        System.out.println(queue.last());     // Output: 89
    }
}
