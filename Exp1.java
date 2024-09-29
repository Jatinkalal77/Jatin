import java.util.Scanner;

public class Exp1 {
    static int maxSize = 5;
    static int currSize = 1;
    static int value;
    static int value1;
    static int value2;
    static int idx;
    static int[] arr = new int[maxSize];

    public static void addEnd(int val) {
        if (currSize < maxSize) {
            arr[currSize - 1] = val;
            currSize++;
        } else {
            System.out.println("Array is full");
        }
    }

    public static void addBeginning(int val) {
        if (currSize < maxSize) {
            for (int i = currSize - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = val;
            currSize++;
        } else {
            System.out.println("Array is full");
        }
    }

    public static void addAtIndex(int val, int index) {
        if (currSize < maxSize) {
            for (int i = currSize - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = val;
            currSize++;
        } else {
            System.out.println("Array is full");
        }
    }

    public static void printArray() {
        for (int i = 0; i < currSize; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        arr[0] = 1;
        System.out.println();

        System.out.println("Enter a value to add at the end of the array");
        value = scanner.nextInt();
        addEnd(value);
        printArray();
        System.out.println();

        System.out.println("Enter a value to add at the beginning of the array");
        value1 = scanner.nextInt();
        addBeginning(value1);
        printArray();
        System.out.println();

        System.out.println("Enter a value and index where to add in the array");
        value2 = scanner.nextInt();
        idx = scanner.nextInt();
        addAtIndex(value2, idx);
        printArray();
        System.out.println();
    }
}