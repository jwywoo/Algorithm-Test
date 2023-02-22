import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Getting Inputs
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        // Creating a list with given inputs
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");

    }
}