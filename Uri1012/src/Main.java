import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a , b , c;
		a = sc.nextDouble(); b = sc.nextDouble(); c = sc.nextDouble();
		
		double Tri = ( a * c / 2);
		double Cir = ( 3.14159 * (Math.pow(c, 2)));
		double Tra = ((( a + b) * c) / 2);
		double Qua = (Math.pow(b, 2));
		double Ret = ( a * b);
	
		System.out.printf("TRIANGULO: %.3f%n", Tri);
		System.out.printf("CIRCULO: %.3f%n", Cir);
		System.out.printf("TRAPEZIO: %.3f%n", Tra);
		System.out.printf("QUADRADO: %.3f%n", Qua);
		System.out.printf("RETANGULO: %.3f%n", Ret);
		sc.close();
	}
}