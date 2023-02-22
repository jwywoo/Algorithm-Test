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
        System.out.println(" ");
        // Bubble sort
        int sorted = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < sorted; j++ ){
                // curr and next
                int curNum = A[j];
                int nextNum = A[j + 1];
                // compare
                if (curNum > nextNum) {
                    A[j] = nextNum;
                    A[j+1] = curNum;
                }
            }
        }
        // Checking the answer
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(" ");

    }
}