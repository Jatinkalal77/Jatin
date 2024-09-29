import java.util.Scanner;

public class exp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][][][] arr = new int[2][2][2][2];

        System.out.println("Enter elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int p = 0; p < 2; p++) {
                        arr[i][j][k][p] = scanner.nextInt();
                    }
                }
            }
        }

        System.out.println("The elements are:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int p = 0; p < 2; p++) {
                        System.out.print(arr[i][j][k][p] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}