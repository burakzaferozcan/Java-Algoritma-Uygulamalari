import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// GİRİLEN SAYIYA KADAR OLAN CİFT SAYILARI BULAN PROGRAM
		Scanner input = new Scanner(System.in);
		System.out.print("GIRILEN SAYIYA KADAR OLAN CIFT SAYILARI EKRANA YAZAN PROGRAM\nLUTFEN BIR SAYI GIRIN : ");
		int sayi=input.nextInt();
		for(int i=sayi;i>0;i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		if(sayi<1) {
			System.out.println("HATALI BIR DEGER GIRDINIZ LUTFEN POZITIF VE 0'DAN FARKLI BIR SAYI GIRINIZ");
		}
		

	}

}
