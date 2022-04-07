import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int numFun , horasTrabalhadas;
		double valorPorHora , salario;
			
		numFun = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorPorHora;
			
		System.out.printf("NUMBER = %d%n" , numFun);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}