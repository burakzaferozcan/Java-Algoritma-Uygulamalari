import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// KDV tutarı hesaplama uygulaması
		// kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayıp
		// console'a yazdıran program.
		// (KDV oranı %20)
		double hesaplanacakDeger, KDVTutari, KDVliSonuc;
		byte KDVOrani = 20;
		boolean negatifMi = true;

		Scanner input = new Scanner(System.in);
		System.out.println("KDV ORANI HESAPLAMA UYGULAMASINA HOSGELDINIZ\n");
		while (negatifMi) {
			System.out.print("KDV ORANINI USTUNE EKLEMEK ISTEDIGINIZ DEGERI GIRINIZ (KDV ORANI %20) : ");
			hesaplanacakDeger = input.nextDouble();
			
			if (hesaplanacakDeger >= 0) {
				KDVTutari = (hesaplanacakDeger / 100) * KDVOrani;
				KDVliSonuc = hesaplanacakDeger + KDVTutari;
				System.out.println("KDV degerini hesaplamak istediginiz tutar = " + hesaplanacakDeger);
				System.out.println("KDV eklenmis tutar = " + KDVliSonuc);
				System.out.println("KDV tutari = " + KDVTutari);
				negatifMi = false;
				break;

			} else {
				negatifMi = true;
				System.out.println("LUTFEN POZITIF BIR DEGER GIRINIZ!!!");
			}

		}

	}

}
