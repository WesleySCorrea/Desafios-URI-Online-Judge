import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a , b , c;
		a = sc.nextInt(); 
		b = sc.nextInt();
		c = sc.nextInt();
		
		int Maior1 = ((a + b) + (Math.abs(a - b))) / 2;
		int Maior2 = ((Maior1 + c) + (Math.abs(Maior1 - c))) / 2;

		System.out.printf("%d eh o maior%n", Maior2);
		sc.close();
	}
}