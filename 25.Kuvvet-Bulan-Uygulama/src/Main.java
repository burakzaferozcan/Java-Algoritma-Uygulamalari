import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// KUVVET BULAN UYGULAMA
		// n SAYISI VE SINIR DEGERI KULLANICIDAN ALINIR VE n SAYISININ KUVVETLERI EKRANA YAZDIRILIR
		Scanner input = new Scanner(System.in);
		System.out.println("LUTFEN BIR N SAYISI GIRINIZ : ");
		long n=input.nextLong();
		System.out.println("LUTFEN SINIR SAYISI GIRINIZ : ");
		long sinir=input.nextLong();
		long sayac=1;
		for(long i=1;i<=sinir;i*=n) {
			if(i>=n) {
				System.out.println("N SAYISININ "+sayac+". KUVVETI : "+i);
				sayac++;
			}
			
		}

	}

}
