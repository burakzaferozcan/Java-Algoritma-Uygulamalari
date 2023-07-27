import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// not ortalaması hesaplama
		// vize 1 vize 2 final notları kullanıcıdan alınacak
		// dersin ismi ve dersin geçme notu kullanıcıdan alınacak
		// vize 1 ve vize 2'nin ortalamaya etkisi %30 olacak final ise %40 olacak
		Scanner scanner = new Scanner(System.in);
		byte vizeNot1, vizeNot2, finalNot, dersGecmeNotu;
		double sonuc;
		String dersAdi;
		boolean hataliNot = true;
		System.out.print("NOT ORTALAMASI HESAPLAMA UYGULAMASINA HOSGELDINIZ\n");

		while (hataliNot) {
			System.out.print("LUTFEN ORTALAMASINI HESAPLAMAK ISTEDIGINIZ DERS ADINI GIRINIZ : ");
			dersAdi = scanner.nextLine();
			System.out.print("LUTFEN BOLUMUNUZUN DERS GECME NOT ORTALAMASINI GIRINIZ : ");
			dersGecmeNotu = scanner.nextByte();
			scanner.nextLine();
			System.out.print("LUTFEN " + dersAdi + " DERSINIZIN 1. VIZE NOTUNU GIRINIZ : ");
			vizeNot1 = scanner.nextByte();
			scanner.nextLine();
			System.out.print("LUTFEN " + dersAdi + " DERSINIZIN 2. VIZE NOTUNU GIRINIZ : ");
			vizeNot2 = scanner.nextByte();
			scanner.nextLine();
			System.out.print("LUTFEN " + dersAdi + " DERSINIZIN FINAL NOTUNU GIRINIZ : ");
			finalNot = scanner.nextByte();
			scanner.nextLine();

			if (vizeNot1 > 100 || vizeNot1 < 0 || vizeNot2 > 100 || vizeNot2 < 0 || finalNot > 100 || finalNot < 0
					|| dersGecmeNotu > 100 || dersGecmeNotu < 0) {
				System.out.print("GECERSIZ BIR NOT GIRDINIZ LUTFEN NOTLARINIZI 0-100 ARASINDA GIRINIZ!!!\n");
				hataliNot = true;
			} else {
				hataliNot = false;
				sonuc = (vizeNot1 * 0.3) + (vizeNot2 * 0.3) + (finalNot * 0.4);
				if (sonuc >= dersGecmeNotu) {
					System.out.println("ORTALAMANIZ : " + sonuc + " GECTINIZ");
					break;
				} else {
					System.out.println("ORTALAMANIZ : " + sonuc + " KALDINIZ");
					break;
				}
			}
		}

	}

}