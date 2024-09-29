import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class assingment {
    static Node head = null;

    public static Node createNode(int data) {
        return new Node(data);
    }

    public static void insertNode(int data) {
        Node newNode = createNode(data);
        newNode.next = head;
        head = newNode;
    }

    public static int cycle() {
        if (head == null || head.next == null) {
            return 0;
        } else {
            Node fast = head;
            Node slow = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        insertNode(10);
        insertNode(20);
        insertNode(40);
        head.next.next = head;
        if (cycle() == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}