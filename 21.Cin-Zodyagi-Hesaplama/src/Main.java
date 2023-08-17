import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ÇİN ZODYAĞI HESAPLAMA UYGULAMASI
		// MAYMUN,HOROZ,KÖPEK,DOMUZ,FARE,ÖKÜZ,KAPLAN,TAVŞAN,EJDERHA,YILAN,AT,KOYUN
		System.out.print("CIN ZODYAGI HESAPLAMA UYGULAMASINA HOSGELDINIZ\nDOGUM YILINIZI GIRINIZ : ");
		Scanner input = new Scanner(System.in);
		int dogumYili = input.nextInt(), zodyakIndex = dogumYili % 12;
		String zodyak = "";
		switch (zodyakIndex) {
		case 0:
			zodyak = "MAYMUN";
			break;
		case 1:
			zodyak = "HOROZ";
			break;
		case 2:
			zodyak = "KOPEK";
			break;
		case 3:
			zodyak = "DOMUZ";
			break;
		case 4:
			zodyak = "FARE";
			break;
		case 5:
			zodyak = "OKUZ";
			break;
		case 6:
			zodyak = "KAPLAN";
			break;
		case 7:
			zodyak = "TAVSAN";
			break;
		case 8:
			zodyak = "EJDERHA";
			break;
		case 9:
			zodyak = "YILAN";
			break;
		case 10:
			zodyak = "AT";
			break;
		case 11:
			zodyak = "KOYUN";
			break;

		}
		System.out.println("CIN ZODYAGINIZ : "+zodyak);
	}

}
