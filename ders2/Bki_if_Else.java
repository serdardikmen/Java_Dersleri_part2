package javadersleri.ders2;

import java.util.Scanner;

public class Bki_if_Else {

	public static void main (String [] args ) {
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kilonuzu Giriniz...");
		int kilo = scanner.nextInt();
		System.out.println("Boyunuzu Giriniz ( Örnek 1,80)");
		double boy = scanner.nextDouble();
		double bki = (kilo /(boy * boy ));
		
		if (bki < 18.5 ) {
		System.out.println(" Zayýf ");
		}
		else if (bki >= 18.5 && bki < 25) {
			System.out.println(" Normal ");
		}
		else if (bki >= 25 && bki < 30 ) {
			System.out.println(" Þiþman ");
		}
		else {
			System.out.println("Obez"); {
      }		
    }
  }
	
}