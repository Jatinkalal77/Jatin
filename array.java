public class array {
    static int top = -1;
    static int top1 = 10;
    static int max = 10;
    static int[] arr = new int[10];

    public static void push(int n) {
        if (top1 - top > 1) {
            top = top + 1;
            arr[top] = n;
        } else {
            System.out.println("Overflow");
        }
    }

    public static void push1(int n) {
        if (top1 - top > 1) {
            top1 = top1 - 1;
            arr[top1] = n;
        } else {
            System.out.println("Underflow");
        }
    }

    public static void main(String[] args) {
        push(1);
        push(23);
        push(13);
        push(33);
        push(43);

        push1(2);
        push1(22);
        push1(25);
        push1(21);
        push1(211);

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}