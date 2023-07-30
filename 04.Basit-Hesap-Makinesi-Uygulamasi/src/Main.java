import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// BASİT HESAP MAKİNESİ UYGULAMASI
		// kulanıcıdan 2 sayı alınacak ve yine kullanıcıya 4 işlemden biri seçtirilecek
		// ve sonuc ekrana yazdırılacak

		double sayi1, sayi2, sonuc;
		byte islem;
		boolean gecersizMi = true;
		Scanner input = new Scanner(System.in);
		System.out.println("BASIT HESAP MAKINESI UYGULAMASINA HOSGELDINIZ");
		System.out.print("1. SAYIYI GIRINIZ : ");
		sayi1 = input.nextDouble();
		System.out.print("2. SAYIYI GIRINIZ : ");
		sayi2 = input.nextDouble();

		while (gecersizMi) {
			System.out.print(" 1-TOPLAMA \n 2-CIKARMA \n 3-CARPMA \n 4-BOLME \n YAPILACAK ISLEMI SECIN : ");
			islem = input.nextByte();
			switch (islem) {
			case 1:
				sonuc = sayi1 + sayi2;
				System.out.println(sayi1 + " + " + sayi2 + " = " + sonuc);
				gecersizMi = false;
				break;
			case 2:
				sonuc = sayi1 - sayi2;
				System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
				gecersizMi = false;
				break;
			case 3:
				sonuc = sayi1 * sayi2;
				System.out.println(sayi1 + " * " + sayi2 + " = " + sonuc);
				gecersizMi = false;
				break;
			case 4:
				sonuc = sayi1 / sayi2;
				System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc);
				gecersizMi = false;
				break;
			default:
				System.out.println("GECERSIZ BIR ISLEM SECIMI YAPTINIZ!!!");
				gecersizMi = true;
			}
		}

	}

}
