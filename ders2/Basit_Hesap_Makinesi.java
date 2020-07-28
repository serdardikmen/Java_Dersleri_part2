package javadersleri.ders2;

import java.util.Scanner;

public class Basit_Hesap_Makinesi {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("***********************************");
		String islemler = "1. Toplama Ýþlemi\n" + "2  Çýkarma Ýþlemi\n" + "3. Çarpma Ýþlemi\n" + "4. Bölme Ýþlemi";
		System.out.println(islemler);
		System.out.println("***********************************");
		System.out.println("Ýþlem Seçiniz ! ");
		String islem = scanner.nextLine();
		int a;
		int b;
		switch (islem) {

		case "1":
			System.out.println("1. Sayýyý Giriniz ");
			a = scanner.nextInt();
			System.out.println("2. Sayiyi Giriniz ");
			b = scanner.nextInt();
			System.out.println("Girilen Sayýlarýn Toplamý : " + (a + b));
			break;
		case "2":
			System.out.println("1. Sayýyý Giriniz ");
			a = scanner.nextInt();
			System.out.println("2. Sayýyý Giriniz ");
			b = scanner.nextInt();
			System.out.println("Girilen Sayýlarýn Farklarý : " + (a - b));
			break;
		case "3":
			System.out.println("1. Sayýyý Giriniz ");
			a = scanner.nextInt();
			System.out.println("2. Sayýyý Giriniz ");
			b = scanner.nextInt();
			System.out.println("Girilen Sayýlarýn Çarpýmý " + (a * b));
			break;
		case "4":
			System.out.println("1 Sayýyý Giriniz  ");
			a = scanner.nextInt();
			System.out.println("2. Sayýyý Giriniz ");
			b = scanner.nextInt();
			System.out.println("Girilen Sayýlarýn Bölümü " + ((double) a / b));
			break;
		default:
			System.out.println("GEÇERSÝZ iÞLEM GÝRDÝNÝZ");

		}

	}

}
