package javadersleri.ders2;

import java.util.Scanner;

public class BasitSwitchCase {
	public static void main (String [] args ) {
		System.out.println("L�tfen Say� Giriniz");
		Scanner scanner = new Scanner(System.in);
				int islem = scanner.nextInt();
				switch(islem) 
				{
		case 1:
				System.out.println("1. i�lem");
				break;
		case 2:
				System.out.println("2. i�lem");
				break;
		case 3: 
				System.out.println("3. i�lem");
				break;
		case 4: 
				System.out.println("4. i�lem");
				break;
		case 5:
				System.out.println("5. i�lem");
				break;
		default:
				System.out.println("GE�ERS�Z ��LEM ! ");
				break;
	}

}
}