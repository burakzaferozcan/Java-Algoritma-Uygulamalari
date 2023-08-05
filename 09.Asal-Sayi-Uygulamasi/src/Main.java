import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// KULLANICIDAN ALINAN SAYININ ASAL OLUP OLMADIGINI BULAN PROGRAM

		long sayi;
		boolean asalMi=true;
		Scanner input = new Scanner(System.in);
		System.out.print("ASAL SAYI UYGULAMASINA HOSGELDINIZ\nLUTFEN BIR SAYI GIRINIZ : ");
		sayi = input.nextLong();

		for (int i = 2; i < sayi; i++) {

			if (sayi % i == 0) {
				asalMi = false;
				break;
			}

			else {
				asalMi = true;
				break;
			}

		}
		 if(sayi==1) {
			asalMi = false;
		}else if(sayi<=0) {
			System.out.println("LUTFEN 0DAN FARKLI VE POZITIF BIR DEGER GIRINIZ!!!");
			asalMi = false;
		}
		if(asalMi) {
			System.out.println(sayi + " SAYISI ASALDIR");
		}
		
		else {
			System.out.println(sayi + " SAYISI ASAL DEGILDIR");
		}

	}

}
