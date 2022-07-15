import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = sc.next();
		double salario = sc.nextDouble();
		double totVendas = sc.nextDouble();

		double totSalario = salario + (totVendas * 0.15);

		System.out.printf("TOTAL = R$ %.2f%n", totSalario);
	}
}
