package javadersleri.ders2;

import java.util.Scanner;

public class if_Else {
	
	public static void main (String [] args ) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("L�tfen Say� Giriniz...");
		int yas = scanner.nextInt();
		
		if (yas < 18 )
			
			System.out.println("Bu Mekana Giremezsiniz...");
		
		
		else {
			System.out.println("Ho�geldiniz Buyrun...");
		}
	}

}
