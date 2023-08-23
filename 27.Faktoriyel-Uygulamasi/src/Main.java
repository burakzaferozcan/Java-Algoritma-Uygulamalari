import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// FAKTÖRİYEL BULMA UYGULAMASI
		Scanner input = new Scanner(System.in);
		long sayi,sonuc=1;
		System.out.print("FAKTORIYELINI BULMAK ISTEDIGINIZ SAYIYI GIRINIZ : ");
		sayi=input.nextLong();
		for(long i =sayi;i>=1;i--) {
			sonuc*=i;
		}
		System.out.println(sayi+" SAYISININ FAKTORIYELI : "+sonuc);
	}

}
