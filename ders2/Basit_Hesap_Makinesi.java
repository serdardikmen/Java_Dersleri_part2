package javadersleri.ders2;

import java.util.Scanner;

public class Basit_Hesap_Makinesi {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("***********************************");
		String islemler = "1. Toplama ��lemi\n" + "2  ��karma ��lemi\n" + "3. �arpma ��lemi\n" + "4. B�lme ��lemi";
		System.out.println(islemler);
		System.out.println("***********************************");
		System.out.println("��lem Se�iniz ! ");
		String islem = scanner.nextLine();
		int a;
		int b;
		switch (islem) {

		case "1":
			System.out.println("1. Say�y� Giriniz ");
			a = scanner.nextInt();
			System.out.println("2. Sayiyi Giriniz ");
			b = scanner.nextInt();
			System.out.println("Girilen Say�lar�n Toplam� : " + (a + b));
			break;
		case "2":
			System.out.println("1. Say�y� Giriniz ");
			a = scanner.nextInt();
			System.out.println("2. Say�y� Giriniz ");
			b = scanner.nextInt();
			System.out.println("Girilen Say�lar�n Farklar� : " + (a - b));
			break;
		case "3":
			System.out.println("1. Say�y� Giriniz ");
			a = scanner.nextInt();
			System.out.println("2. Say�y� Giriniz ");
			b = scanner.nextInt();
			System.out.println("Girilen Say�lar�n �arp�m� " + (a * b));
			break;
		case "4":
			System.out.println("1 Say�y� Giriniz  ");
			a = scanner.nextInt();
			System.out.println("2. Say�y� Giriniz ");
			b = scanner.nextInt();
			System.out.println("Girilen Say�lar�n B�l�m� " + ((double) a / b));
			break;
		default:
			System.out.println("GE�ERS�Z i�LEM G�RD�N�Z");

		}

	}

}
