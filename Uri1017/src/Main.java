import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int v, t;

        v = sc.nextInt();
        t = sc.nextInt();

        double consumo = (double) (v * t) / 12;

        System.out.printf("%.3f\n", consumo);
        sc.close();
    }
}