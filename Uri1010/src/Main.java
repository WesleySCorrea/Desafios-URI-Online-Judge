import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int CodP1 = sc.nextInt(); int NP1 = sc.nextInt(); double VUP1 = sc.nextDouble();
		int CodP2 = sc.nextInt(); int NP2 = sc.nextInt(); double VUP2 = sc.nextDouble();
		double VAP = ((NP1 * VUP1) + (NP2 * VUP2));
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", VAP);
		
		sc.close();
	}
}