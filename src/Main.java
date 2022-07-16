import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double r = sc.nextDouble();

		double volume = (4.0 / 3) * pi * (r * r * r);

		System.out.printf("VOLUME = %.3f%n", volume);
	}
}
