import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ValorEntrada = sc.nextInt();
		int Valor = Math.abs(ValorEntrada);
		int Qnt100 = Valor / 100;
		int Rest100 = Valor % 100;
		int Qnt50 = Rest100 / 50;
		int Rest50 = Rest100 % 50;
		int Qnt20 = Rest50 / 20;
		int Rest20 = Rest50 % 20;
		int Qnt10 = Rest20 / 10;
		int Rest10 = Rest20 % 10;
		int Qnt5 = Rest10 / 5;
		int Rest5 = Rest10 % 5;
		int Qnt2 = Rest5 / 2;
		int Rest2 = Rest5 % 2;
		int Qnt1 = Rest2 / 1;
		
		System.out.println(Valor);
		System.out.printf("%d nota(s) de R$ 100,00%n", Qnt100);
		System.out.printf("%d nota(s) de R$ 50,00%n", Qnt50);
		System.out.printf("%d nota(s) de R$ 20,00%n", Qnt20);
		System.out.printf("%d nota(s) de R$ 10,00%n", Qnt10);
		System.out.printf("%d nota(s) de R$ 5,00%n", Qnt5);
		System.out.printf("%d nota(s) de R$ 2,00%n", Qnt2);
		System.out.printf("%d nota(s) de R$ 1,00%n", Qnt1);
		sc.close();
	}
}