import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Dairenin alanını ve çevresini hesaplayan uygulama
		// yarı çap degerini kullanıcıdan alarak dairenin alanını ve çevresini
		// hesaplayan programı yazınız.

		Scanner input = new Scanner(System.in);
		double yariCap, PI = Math.PI, daireAlan, daireCevre;
		boolean negatifMi = true;
		System.out.print("ALANINI VE CEVRESINI HESAPLAMAK ISTEDIGINIZ DAIRENIN YARI CAPINI GIRINIZ (BIRIM) : ");
		while (negatifMi) {
			yariCap = input.nextDouble();
			if (yariCap <= 0) {
				negatifMi = true;
				System.out.print("LUTFEN POZITIF VE 0'DAN FARKLI BIR YARI CAP GIRINIZ (BIRIM) : ");
			} else {
				daireAlan = PI * yariCap * yariCap;
				daireCevre = 2 * PI * yariCap;
				System.out.println("DAIRENIN CEVRESI = " + daireCevre + " BIRIMDIR");
				System.out.println("DAIRENIN ALANI = " + daireAlan + " BIRIMDIR");
				negatifMi = false;
				break;
			}
		}

	}

}
