import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;

		double tri = (a * c) / 2;
		double circ = pi * (c * c);
		double trap = (a + b) * c / 2;
		double quad = b * b;
		double ret = a * b;

		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", circ);
		System.out.printf("TRAPEZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETANGULO: %.3f%n", ret);
	}
}
