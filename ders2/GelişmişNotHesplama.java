package javadersleri.ders2;

import java.util.Scanner;

public class Geli�mi�NotHesplama {
	
	public static void main (String [] args ) {
		
		Scanner Scanner = new Scanner(System.in);
	
		System.out.println("1. Vize Notunuz� Giriniz " );
		int vize1 = Scanner.nextInt();
		System.out.println("2. Vize Notunuzu Giriniz ");
		int vize2 = Scanner.nextInt();
		System.out.println("Final Notuzunu Giriniz" );
		int finalnot = Scanner.nextInt();
		System.out.println("Okul Ortalaman�z");
		double ortalama = Scanner.nextDouble();
				
		double toplamnot = (vize1 * 3 /10.0 ) + (vize2 *3 / 10.0) + (finalnot * 4 /10.0);
		
		if (toplamnot >= 90) {
		System.out.println("AA Ald�n�z ");
		}
		else if ( toplamnot >= 85 ) {
		System.out.println("BA Ald�n�z " );
		}
		else if (toplamnot >=80 ) {
		System.out.println("BB Ald�n�z " );	
		}
		else if ( toplamnot >= 75 ) {
		System.out.println("  CB Ald�n�z " );
		}
		else if (toplamnot >=70 ) {
		System.out.println(" CC Ald�n�z " );
		}
		else if (toplamnot >=65 ) {
		System.out.println("DC Ald�n�z " );	
			}
			else if ( toplamnot >= 60 ) {
		System.out.println("  DD Ald�n�z " );
		if (ortalama < 2.50) {
			System.out.println("DD Ald�n�z ve Not Ortalam�n�z D���k Bu Dersi Tekrardan Almay� D���nebilirsiniz ");
		}
			}
			else if (toplamnot >=55 ) {
		System.out.println(" FD Ald�n�z " );
			}
			else { 
		System.out.println(" FF Ald�n�z ve Kald�n�z  " ); 
			
		
		}
	}
	
	

}
