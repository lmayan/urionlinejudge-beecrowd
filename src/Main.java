import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1 = sc.nextInt();
		int qtdePeca1 = sc.nextInt();
		double vlrPeca1 = sc.nextDouble();

		int cod2 = sc.nextInt();
		int qtdePeca2 = sc.nextInt();
		double vlrPeca2 = sc.nextDouble();

		double totPedido = qtdePeca1 * vlrPeca1 + qtdePeca2 * vlrPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totPedido);
	}
}
