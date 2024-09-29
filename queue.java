import java.util.Scanner;

public class queue {
    static int front = -1;  //to delete
    static int rear = -1;   // to insert
    static int[] queue = new int[5];
    static int size = queue.length;

    public static boolean isFull() {
        if (rear == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEmpty() {
        if (front == -1 || (front > rear)) {
            return true;
        } else {
            return false;
        }
    }

    public static void enqueue(int val) {
        if (isFull()) {
            System.out.println("Overflow");
        } else {
            rear = rear + 1;
            queue[rear] = val;
            if (front == -1) {
                front = 0;
            }
        }
    }

    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        } else {
            int ele = queue[front];
            System.out.println(" The deleted element is : " + ele);
            front = front + 1;
            return ele;
        }
    }

    public static void peek() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(" The peek element is : " + queue[front]);
        }
    }

    public static void show() {
        System.out.println("The element in queue is : ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            enqueue(i * 3);
        }
        dequeue();
        dequeue();
        peek();
        show();
    }
}