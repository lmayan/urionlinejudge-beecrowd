import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble() * 2;
		double b = sc.nextDouble() * 3;
		double c = sc.nextDouble() * 5;
		
		double media = (a + b + c) / 10;

		System.out.printf("MEDIA = %.1f%n", media);
		
	}
}
