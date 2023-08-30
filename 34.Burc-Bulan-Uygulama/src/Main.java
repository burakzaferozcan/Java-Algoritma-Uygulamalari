import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// BURÇ BULMA UYGULAMASI
		Scanner input = new Scanner(System.in);
		int dogumAy, dogumGun;
		String burc = "";
		System.out.println(
				"BURC UYGULAMASINA HOSGELDINIZ\n1-)OCAK\n2-)SUBAT\n3-)MART\n4-)NISAN\n5-)MAYIS\n6-)HAZIRAN\n7-)TEMMUZ\n8-)AGUSTOS\n9-)EYLUL\n10-)EKIM\n11-)KASIM\n12-)ARALIK\nDOGUM AYINIZI SECINIZ : ");
		dogumAy = input.nextInt();
		System.out.print("LUTFEN DOGUM GUNUNUZU GIRINIZ : ");
		dogumGun = input.nextInt();
		if (dogumAy < 1 || dogumAy > 12 || dogumGun < 1 || dogumGun > 31) {
			System.out.print("HATALI AY YA DA GUN DEGERI GIRDINIZ!!!");
		} else {
			switch (dogumAy) {
			case 1:
				if (dogumGun <= 20) {
					burc = "OGLAK";
				} else {
					burc = "KOVA";
				}
				break;
			case 2:
				if (dogumGun <= 18) {
					burc = "KOVA";
				} else {
					burc = "BALIK";
				}
				break;
			case 3:
				if (dogumGun <= 20) {
					burc = "BALIK";
				} else {
					burc = "KOC";
				}
				break;
			case 4:
				if (dogumGun <= 20) {
					burc = "KOC";
				} else {
					burc = "BOGA";
				}
				break;
			case 5:
				if (dogumGun <= 21) {
					burc = "BOGA";
				} else {
					burc = "IKIZLER";
				}
				break;
			case 6:
				if (dogumGun <= 21) {
					burc = "IKIZLER";
				} else {
					burc = "YENGEC";
				}
				break;
			case 7:
				if (dogumGun <= 22) {
					burc = "YENGEC";
				} else {
					burc = "ASLAN";
				}
				break;
			case 8:
				if (dogumGun <= 22) {
					burc = "ASLAN";
				} else {
					burc = "BASAK";
				}
				break;
			case 9:
				if (dogumGun <= 22) {
					burc = "BASAK";
				} else {
					burc = "TERAZI";
				}
				break;
			case 10:
				if (dogumGun <= 23) {
					burc = "TERAZI";
				} else {
					burc = "AKREP";
				}
				break;
			case 11:
				if (dogumGun <= 22) {
					burc = "AKREP";
				} else {
					burc = "YAY";
				}
				break;
			case 12:
				if (dogumGun <= 21) {
					burc = "YAY";
				} else {
					burc = "OGLAK";
				}
				break;
			}
		}

		System.out.println("BURCUNUZ : " + burc);
	}

}
