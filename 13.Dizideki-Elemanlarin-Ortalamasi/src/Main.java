import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// DİZİDEKİ ELEMANLARIN ORTASINI BULMA
		Scanner input = new Scanner(System.in);
		double toplam = 0, ortalama;
		System.out.print("KAC ELEMANLI DIZI OLUSTURMAK ISTIYORSUNUZ : ");
		int diziUzunluk = input.nextInt();
		double[] dizi = new double[diziUzunluk];
		for (int i = 0; i < dizi.length; i++) {
			System.out.print("LUTFEN DIZININ "+(i+1)+". ELEMANINI GIRINIZ : ");
			dizi[i] = input.nextDouble();
			toplam += dizi[i];
		}

		ortalama = toplam / diziUzunluk;
		System.out.println("GIRDIGINIZ DIZININ ORATALAMASI = " + ortalama);

	}

}
