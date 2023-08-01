import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Otobus bilet fiyatı hesaplama programı
		// kullanıcıdan mesafe (km),yaş ve yolculuk tipi (tek yön,gidiş geliş)
		// bilgileri ile mesafe başına ücret 0,10TL/km olarak alın.
		// ilk olarak yolculuğun toplam fiyatını hesaplayın ve sonrasında ki koşullara
		// göre
		// aşağıdaki indirimleri uygulayın
		// 1-) mesafe ve yaş degerleri pozitif sayı yolculuk tipi 1 veya 2 olmalıdır
		// 2-) kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır
		// 3-) kişi 14-24 yaş arasındaysa bilet fiyatı üzerinde %10 indirim uygulanır
		// 4-) kişi yolculuk tipini gidiş dönüş seçerse her iki bilette %20 indirim
		// uygulanır

		// TODO DEGISKENLER
		double KM, kmBasiUcret = 0.50, fiyat;
		byte yas, yolculukTipi, cocukIndirim = 70, gencIndirim = 90, yolculukTipi2Indirim = 80;
		Scanner input = new Scanner(System.in);
		// TODO DEGISKENLER

		System.out.println("OTOBUS BILET FIYATI HESAPLAMA UYGULAMASINA HOSGELDINIZ");
		System.out.print("LUTFEN KAC KM YOLCULUK YAPACAGINIZI GIRINIZ EN AZ 50 KM : ");
		KM = input.nextDouble();
		fiyat = KM * kmBasiUcret;
		if (KM >= 50) {
			System.out.print("YAS DEGERINI GIRINIZ : ");
			yas = input.nextByte();
			if (yas < 1) {
				System.out.println("HATALI BIR YAS DEGERI GIRDINIZ LUTFEN 0'DAN BUYUK BIR YAS GIRINIZ!!!");
			} else {
				System.out.print("1-) GIDIS\n2-) GIDIS-DONUS %20 INDIRIM\nYOLCULUK TIPINI SECINIZ : ");
				yolculukTipi = input.nextByte();
				if (yas <= 12) {
					fiyat = (fiyat / 100) * cocukIndirim;
				} else if (yas <= 24 && yas >= 14) {
					fiyat = (fiyat / 100) * gencIndirim;
				} else {
					fiyat = fiyat;
				}
				switch (yolculukTipi) {
				case 1:
					fiyat = fiyat;
					System.out.println("ODEMENIZ GEREKEN UCRET = " + fiyat + "TL");
					break;
				case 2:
					fiyat = ((fiyat / 100) * yolculukTipi2Indirim) * 2;
					System.out.println("ODEMENIZ GEREKEN UCRET = " + fiyat + "TL");
					break;
				default:
					System.out.println("HATALI BIR YOLCULUK TIPI SECTINIZ");
					break;
				}
			}
		} else {
			System.out.println("EN AZ 50 KM YOLCULUK YAPMALISINIZ!!!");
		}

	}

}
