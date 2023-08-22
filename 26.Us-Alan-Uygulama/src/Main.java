import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ÜS ALMA UYGULAMASI
		Scanner input = new Scanner(System.in);
		long sonuc=1;
		System.out.println("LUTFEN TABAN DEGERINI GIRINIZ : ");
		long taban=input.nextLong();
		System.out.println("LUTFEN US DEGERINI GIRINIZ : ");
		long us=input.nextLong();
//		int sayac=1;
//		while(sayac<=us) {
//			sonuc*=taban;
//			System.out.println(sonuc);
//			sayac++;
//		}
//		System.out.println("SONUC : "+sonuc);
		for(int i=1;i<=us;i++) {
			sonuc*=taban;
			System.out.println(sonuc);
		}
		System.out.println("SONUC : "+sonuc);
		
		

	}

}
