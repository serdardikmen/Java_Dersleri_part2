package javadersleri.ders2;

import java.util.Scanner;

public class Else_if {
	public static void main(String[] args) {

		System.out.println("L�tfen Notunuzu  Giriniz...");
		Scanner scanner = new Scanner(System.in);
		int not = scanner.nextInt();

		if (not >= 90) {
			System.out.println("AA");
		} else if (not >= 80) {
			System.out.println("BA");
		} else if (not >= 70) {
			System.out.println("BB");
		} else if (not >= 60) {
			System.out.println("CB");
		} else if (not >= 50) {
			System.out.println("CC");
		} else {
			System.out.println("Dersten Kald�n�z...");
		}

	}
}
