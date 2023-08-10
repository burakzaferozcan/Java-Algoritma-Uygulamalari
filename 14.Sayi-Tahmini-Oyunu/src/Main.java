import java.util.Random;
import java.util.Scanner;

import javax.naming.BinaryRefAddr;

public class Main {

	public static void main(String[] args) {
		// SAYI TAHMINI OYUNUNA
		Scanner input = new Scanner(System.in);
		int seviye, tahmin, can = 5, randomSayi = 0;
		Random rand = new Random();
		System.out.println("SAYI TAHMINI OYUNUNA HOSGELDINIZ");
		System.out.print("1-) KOLAY\n2-) ORTA\n3-) ZOR\nLUTFEN SEVIYE SECINIZ : ");
		seviye = input.nextByte();
		if (seviye == 1) {
			randomSayi = rand.nextInt(25) + 1;
			System.out.print("RASTGELE OLUSTURDUGUM SAYIYI TAHMIN ET 1-25(DAHIL) ARASI 5 HAKKIN VAR : ");
			for (; can >= 0; can--) {
				if(can==0) {
					System.out.println("\nKAYBETTIN!!! RASTGELE OLUSTURDUGUM SAYI : " + randomSayi);
					break;
				}
				else {
					tahmin=input.nextInt();
					if (tahmin == randomSayi) {
						System.out.println("TEBRIKLER!!! RASTGELE OLUSTURDUGUM SAYIYI DOGRU TAHMIN ETTINIZ.");
					} else if (tahmin > randomSayi) {
						System.out.print("RASTGELE OLUSTURDUGUM SAYI " + tahmin + " SAYISINDAN KUCUK "+(can-1)+" HAKKINIZ KALDI : ");
					} else if (tahmin < randomSayi) {
						System.out.print("RASTGELE OLUSTURDUGUM SAYI " + tahmin + " SAYISINDAN BUYUK  "+(can-1)+" HAKKINIZ KALDI : ");
					}

				} 
			}
		}

		else if (seviye == 2) {
			randomSayi = rand.nextInt(50) + 1;
			System.out.print("RASTGELE OLUSTURDUGUM SAYIYI TAHMIN ET 1-50(DAHIL) ARASI 5 HAKKIN VAR : ");
			for (; can >= 0; can--) {
				if(can==0) {
					System.out.println("\nKAYBETTIN!!! RASTGELE OLUSTURDUGUM SAYI : " + randomSayi);
					break;
				}
				else {
					tahmin=input.nextInt();
					if (tahmin == randomSayi) {
						System.out.println("TEBRIKLER!!! RASTGELE OLUSTURDUGUM SAYIYI DOGRU TAHMIN ETTINIZ.");
					} else if (tahmin > randomSayi) {
						System.out.print("RASTGELE OLUSTURDUGUM SAYI " + tahmin + " SAYISINDAN KUCUK "+(can-1)+" HAKKINIZ KALDI : ");
					} else if (tahmin < randomSayi) {
						System.out.print("RASTGELE OLUSTURDUGUM SAYI " + tahmin + " SAYISINDAN BUYUK  "+(can-1)+" HAKKINIZ KALDI : ");
					}

				} 
			}
		} else if (seviye == 3) {
			randomSayi = rand.nextInt(100) + 1;
			System.out.print("RASTGELE OLUSTURDUGUM SAYIYI TAHMIN ET 1-100(DAHIL) ARASI 5 HAKKIN VAR : ");
			for (; can >= 0; can--) {
				if(can==0) {
					System.out.println("\nKAYBETTIN!!! RASTGELE OLUSTURDUGUM SAYI : " + randomSayi);
					break;
				}
				else {
					tahmin=input.nextInt();
					if (tahmin == randomSayi) {
						System.out.println("TEBRIKLER!!! RASTGELE OLUSTURDUGUM SAYIYI DOGRU TAHMIN ETTINIZ.");
					} else if (tahmin > randomSayi) {
						System.out.print("RASTGELE OLUSTURDUGUM SAYI " + tahmin + " SAYISINDAN KUCUK "+(can-1)+" HAKKINIZ KALDI : ");
					} else if (tahmin < randomSayi) {
						System.out.print("RASTGELE OLUSTURDUGUM SAYI " + tahmin + " SAYISINDAN BUYUK  "+(can-1)+" HAKKINIZ KALDI : ");
					}

				} 
			}
		} else {
			System.out.println("YANLIS SEVIYE SECIMI YAPTINIZ LUTFEN 1-3 ARASI BIR SECIMI YAPIN!!!");
		}

	}

}
