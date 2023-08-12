import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// HIPOTENUS HESAPLAMA UYGULAMASI
		Scanner input=new Scanner(System.in);
		double sayi1,sayi2,hipotenus;
		System.out.print("HIPOTENUS HESAPLAMA UYGULAMASINA HOSGELDINIZ\nLUTFEN 1. KENARI GIRINIZ : ");
		sayi1=input.nextDouble();
		System.out.print("LUTFEN 2. KENARI GIRINIZ : ");
		sayi2=input.nextDouble();
		hipotenus=Math.sqrt((sayi1*sayi1)+(sayi2*sayi2));
		System.out.println("HIPOTENUS : "+hipotenus);
		

	}

}
