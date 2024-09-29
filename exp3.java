import java.util.Scanner;

public class exp3 {
    private String[] stack;  
    private int top = -1;
    private int size = 0;

    public exp3(int isize) {
        size = isize;
        stack = new String[size];  
    }

    private boolean isFull() {
        return (top == size - 1);
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    private void resizeStack() {
        size = size * 2;
        String[] temp = new String[size];
        System.arraycopy(stack, 0, temp, 0, top + 1);
        stack = temp;
    }

    public void push(String val) {
        if (isFull()) {
            resizeStack();
        } else {
            top = top + 1;
            stack[top] = val;  
            System.out.println("\n '" + val + "' is Successfully added \n");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("\n Book not Found ! \n");
        } else {
            System.out.println("\n '" + stack[top] + "' is Successfully Provided! \n");
            top = top - 1;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(stack[top]);
        } else {
            System.out.println("No books available!\n");
        }
    }

    public void show() {
        if (!isEmpty()) {
            System.out.println("Books are:- \n");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("No books in the shelf!\n");
        }
    }

    public static void main(String[] args) {
        exp3 bookStack = new exp3(4);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("****************************************************");
            System.out.println("1. Add a returned Book");
            System.out.println("2. Remove a returned Book");
            System.out.println("3. View the top returned Book");
            System.out.println("4. View all the books");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter the book name: ");
                    String name = scanner.nextLine();
                    bookStack.push(name);
                    break;

                case 2:
                    bookStack.pop();
                    break;

                case 3:
                    System.out.println("The recent book is: \n");
                    bookStack.peek();
                    break;

                case 4:
                    bookStack.show();
                    break;

                case 5:
                    System.out.println("Thank you for your visit!\n");
                    System.exit(0);
            }

            System.out.println("****************************************************");
        }
    }
}