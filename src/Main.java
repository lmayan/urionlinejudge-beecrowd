import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int horas = sc.nextInt();
		double vlrHoras = sc.nextDouble();

		double salary = horas * vlrHoras;

		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salary);
	}
}
