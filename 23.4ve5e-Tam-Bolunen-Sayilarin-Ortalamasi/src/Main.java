import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// girilen sayıya kadar 4 ve 5'e tam bölünen sayıların ortalamasını bulan uygulama
		Scanner input = new Scanner(System.in);
		System.out.print("GIRILEN SAYIYA KADAR OLAN 4 VE 5'E TAM BOLUNEN SAYILARIN ORTALAMASINI BULAN UYGULAMA\nLUTFEN BIR SAYI GIRIN : ");
		int sayi=input.nextInt();
		for(int i=4;i<=sayi;i++) {
			if(i%4==0&&i%5==0) {
				System.out.println(i);
			}
		}
		if(sayi<1) {
			System.out.println("HATALI BIR DEGER GIRDINIZ LUTFEN POZITIF VE 0'DAN FARKLI BIR SAYI GIRINIZ");
		}

	}

}
