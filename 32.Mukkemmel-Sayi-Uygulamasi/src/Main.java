
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// MUKKEMMEL SAYI UYGULAMASI
		Scanner input = new Scanner(System.in);
		System.out.print("LUTFEN MUKKEMMEL SAYI OLUP OLMADIGINI OGRENMEK ISTEDIGINIZ SAYIYI GIRINIZ : ");
		int sayi=input.nextInt(),toplam=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				toplam+=i;
			}
		}
		if(toplam==sayi) {
			System.out.println(sayi+" SAYISI MUKKEMMEL SAYIDIR");
		}else {
			System.out.println(sayi+" SAYISI MUKKEMMEL SAYI DEGILDIR");
		}

	}

}
