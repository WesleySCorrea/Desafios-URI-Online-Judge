import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Horas , Minutos , Segundos , Resto;
		int N = sc.nextInt();
		
		Horas = N / 3600;
		Resto = N % 3600;
		Minutos = Resto / 60;
		Segundos = Resto % 60;
	
		System.out.printf("%d:%d:%d%n", Horas , Minutos , Segundos);
		sc.close();
	}
}