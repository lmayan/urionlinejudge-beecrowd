import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int km = sc.nextInt();
		double lit = sc.nextDouble();

		double media = km / lit;

		System.out.printf("%.3f", media);
		System.out.println(" km/l");
	}
}
