import java.util.Scanner;

public class exp4 {
    static int front = -1;
    static int rear = -1;
    static int[] queue = new int[10];
    static int size = queue.length;

    public static void addKaro(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Not Add any customer!");
        }
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            queue[rear] = data;
            System.out.println("ADD Successfully!");
        } else {
            rear = (rear + 1) % size;
            queue[rear] = data;
            System.out.println("ADD Successfully!");
        }
    }

    public static int hatado() {
        if (rear == -1 && front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int ele;
        if (front == rear) {
            ele = queue[front];
            front = -1;
            rear = -1;
            System.out.println("Customer deleted ID : " + ele);
            return ele;
        } else {
            ele = queue[front];
            System.out.println("Customer deleted ID : " + ele);
            front = (front + 1) % size;
            return ele;
        }
    }

    public static void dikhao() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.println((i + 1) + ". Customer : " + queue[i]);
            i = (i + 1) % size;
        }
        System.out.println((i + 1) + ". Customer : " + queue[rear]);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*****************************************");
            System.out.println("1. ADD A CUSTOMER");
            System.out.println("2. DELETE A CUSTOMER");
            System.out.println("3. SHOW ALL CUSTOMERS");
            System.out.println("4. EXIT");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    addKaro(id);
                    break;
                case 2:
                    hatado();
                    break;
                case 3:
                    dikhao();
                    break;
                case 4:
                    System.out.println("Thank you for your visit!😊");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice!!");
                    break;
            }
        }
    }
}