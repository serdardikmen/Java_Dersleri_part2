package javadersleri.ders2;

import java.util.Scanner;

public class GeliþmiþNotHesplama {
	
	public static void main (String [] args ) {
		
		Scanner Scanner = new Scanner(System.in);
	
		System.out.println("1. Vize Notunuzý Giriniz " );
		int vize1 = Scanner.nextInt();
		System.out.println("2. Vize Notunuzu Giriniz ");
		int vize2 = Scanner.nextInt();
		System.out.println("Final Notuzunu Giriniz" );
		int finalnot = Scanner.nextInt();
		System.out.println("Okul Ortalamanýz");
		double ortalama = Scanner.nextDouble();
				
		double toplamnot = (vize1 * 3 /10.0 ) + (vize2 *3 / 10.0) + (finalnot * 4 /10.0);
		
		if (toplamnot >= 90) {
		System.out.println("AA Aldýnýz ");
		}
		else if ( toplamnot >= 85 ) {
		System.out.println("BA Aldýnýz " );
		}
		else if (toplamnot >=80 ) {
		System.out.println("BB Aldýnýz " );	
		}
		else if ( toplamnot >= 75 ) {
		System.out.println("  CB Aldýnýz " );
		}
		else if (toplamnot >=70 ) {
		System.out.println(" CC Aldýnýz " );
		}
		else if (toplamnot >=65 ) {
		System.out.println("DC Aldýnýz " );	
			}
			else if ( toplamnot >= 60 ) {
		System.out.println("  DD Aldýnýz " );
		if (ortalama < 2.50) {
			System.out.println("DD Aldýnýz ve Not Ortalamýnýz Düþük Bu Dersi Tekrardan Almayý Düþünebilirsiniz ");
		}
			}
			else if (toplamnot >=55 ) {
		System.out.println(" FD Aldýnýz " );
			}
			else { 
		System.out.println(" FF Aldýnýz ve Kaldýnýz  " ); 
			
		
		}
	}
	
	

}
