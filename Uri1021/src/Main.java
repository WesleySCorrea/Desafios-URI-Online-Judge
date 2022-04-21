import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        int m = (int) n;

        int quant100 = m / 100;
        int rest100 = m % 100;
        int quant50 = rest100 / 50;
        int rest50 = rest100 % 50;
        int quant20 = rest50 / 20;
        int rest20 = rest50 % 20;
        int quant10 = rest20 / 10;
        int rest10 = rest20 % 10;
        int quant5 = rest10 / 5;
        int rest5 = rest10 % 5;
        int quant2 = rest5 / 2;
        int rest2 = rest5 % 2;
        int quantMoedas1 = rest2 / 1;
        double restMoedas = (n - m) * 100;
        int quantMoedas50 = (int) restMoedas / 50;
        int restMoedas50 = (int) restMoedas % 50;
        int quantMoedas25 = restMoedas50 / 25;
        int restMoedas25 = restMoedas50 % 25;
        int quantMoedas10 = restMoedas25 / 10;
        int restMoedas10 = restMoedas25 % 10;
        int quantMoedas5 = restMoedas10 / 5;
        int restMoedas5 = restMoedas10 % 5;
        int quantMoedas1c = restMoedas5 / 1;
        int restMoedas1c = restMoedas5 % 1;

        System.out.println("NOTAS:");
        System.out.println(quant100 + " nota(s) de R$ 100.00");
        System.out.println(quant50 + " nota(s) de R$ 50.00");
        System.out.println(quant20 + " nota(s) de R$ 20.00");
        System.out.println(quant10 + " nota(s) de R$ 10.00");
        System.out.println(quant5 + " nota(s) de R$ 5.00");
        System.out.println(quant2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(quantMoedas1 + " moeda(s) de R$ 1.00");
        System.out.println(quantMoedas50 + " moeda(s) de R$ 0.50");
        System.out.println(quantMoedas25 + " moeda(s) de R$ 0.25");
        System.out.println(quantMoedas10 + " moeda(s) de R$ 0.10");
        System.out.println(quantMoedas5 + " moeda(s) de R$ 0.05");
        System.out.println(quantMoedas1c + " moeda(s) de R$ 0.01");
    }
}