import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 60;
		int y = 90;
		int dif = y - x;
		int hora = 60;
		int calc = 60 / dif;

		int tempo = sc.nextInt();

		int distanciaXY = tempo * calc;

		System.out.println(distanciaXY + " minutos");
		sc.close();
	}
}
