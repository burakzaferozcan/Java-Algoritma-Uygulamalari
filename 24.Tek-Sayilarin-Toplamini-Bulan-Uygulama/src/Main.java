import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// NEGATIF SAYI GIRILENE KADAR KULLANICIDAN SAYI GIRIŞI KABUL EDEN
		// VE TEK SAYILARIN TOPLAMINI EKRANA BASAN UYGULAMAYI YAZINIZ.
		Scanner input = new Scanner(System.in);
		double sayi, toplam = 0;
		boolean pozitif = true;

		System.out.println(
				"NEGATIF SAYI GIRILENE KADAR GIRILEN SAYILARIN TEK OLANLARINI TOPLAYIP EKRANA YAZDIRAN UYGULAMA");
		while (pozitif) {
			System.out.print("LUTFEN BIR SAYI GIRINIZ :");
			sayi = input.nextDouble();
			if (sayi < 0) {
				break;
			}
			if (sayi % 2 == 1) {
				toplam += sayi;
			}
		}
		System.out.println("GIRILEN POZITIF TEK SAYILARIN TOPLAMI : " + toplam);

	}

}
