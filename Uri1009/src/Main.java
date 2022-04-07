import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		String Nome;
		Nome = sc.next();
		double SalarioFixo = sc.nextDouble();
		double TotalDeVendas = sc.nextDouble();
		double Total = (SalarioFixo + (TotalDeVendas * 0.15));
		
		System.out.printf("TOTAL = R$ %.2f%n", Total);
		
		sc.close();
	}
}
