import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class exp5 {
    static Node head = null;

    public static Node createNode(int data) {
        return new Node(data);
    }

    public static void insertNodeFromBeg(int data) {
        Node newNode = createNode(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insertNodeFromEnd(int data) {
        Node newNode = createNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void insertNodeAtSpecificPos(int data, int pos) {
        Node newNode = createNode(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void deleteNodeB() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        head = head.next;
    }

    public static void deleteNodeE() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public static void deleteNodeSP(int pos) {
        if (pos == 0) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
                if (temp == null) {
                    System.out.println("Invalid position");
                    break;
                }
            }
            temp.next = temp.next.next;
        }
    }

    public static void pushAtBeginning(int data) {
        insertNodeFromBeg(data);
    }

    public static void pushAtEnd(int data) {
        insertNodeFromEnd(data);
    }

    public static void pushAtPosition(int data, int pos) {
        insertNodeAtSpecificPos(data, pos);
    }

    public static void popFromBeginning() {
        deleteNodeB();
    }

    public static void popFromEnd() {
        deleteNodeE();
    }

    public static void popFromSpecificPosition(int pos) {
        deleteNodeSP(pos);
    }

    public static void printStack() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void peek() {
        if (head != null) {
            System.out.println("Top: " + head.data);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public static void main(String[] args) {
        pushAtBeginning(10);
        pushAtBeginning(20);
        pushAtEnd(30);
        pushAtEnd(40);
        pushAtPosition(25, 2);

        printStack();

        peek();

        popFromBeginning();
        popFromEnd();
        popFromSpecificPosition(2);

        printStack();
    }
}