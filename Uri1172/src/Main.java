import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];

        for (int i = 0; i < 10; i++) {
            X[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (X[i] <= 0) {
                X[i] = 1;
            }
            System.out.println("X[" + i + "] = " + X[i]);
        }
    }
}
