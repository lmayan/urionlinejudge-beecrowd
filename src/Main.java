import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double kmL = 12;
		double tempo = sc.nextDouble();
		double velocMedia = sc.nextDouble();

		double litros = tempo * velocMedia / kmL;

		System.out.printf("%.3f%n", litros);
		sc.close();
	}
}
