package javadersleri.ders2;

import java.util.Scanner;

public class BasitSwitchCase {
	public static void main (String [] args ) {
		System.out.println("Lütfen Sayý Giriniz");
		Scanner scanner = new Scanner(System.in);
				int islem = scanner.nextInt();
				switch(islem) 
				{
		case 1:
				System.out.println("1. iþlem");
				break;
		case 2:
				System.out.println("2. iþlem");
				break;
		case 3: 
				System.out.println("3. iþlem");
				break;
		case 4: 
				System.out.println("4. iþlem");
				break;
		case 5:
				System.out.println("5. iþlem");
				break;
		default:
				System.out.println("GEÇERSÝZ ÝÞLEM ! ");
				break;
	}

}
}