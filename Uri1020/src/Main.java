import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Anos , Meses , Dias , Resto;
		int N = sc.nextInt();
		
		Anos = N / 365;
		Resto = N % 365;
		Meses = Resto / 30;
		Dias = Resto % 30;
	
		System.out.printf("%d ano(s)%n", Anos);
		System.out.printf("%d mes(es)%n", Meses);
		System.out.printf("%d dia(s)%n", Dias);
		sc.close();
	}
}