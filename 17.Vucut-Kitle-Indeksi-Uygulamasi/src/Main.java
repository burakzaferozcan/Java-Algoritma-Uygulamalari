
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// VÜCUT KİTLE İNDEKSİ HESAPLAMA UYGULAMASI
		Scanner input=new Scanner(System.in);
		double boy,kilo,vki;
		System.out.print("VUCUT KITLE INDEKSI HESAPLAMA UYGULAMASINA HOSGELDINIZ\nLUTFEN BOYUNUZU GIRINIZ (ORN:1,70): ");
		boy=input.nextDouble();
		System.out.print("LUTFEN KILONUZU GIRINIZ (ORN:60): ");
		kilo=input.nextDouble();
		vki=kilo/(boy*boy);
		if(boy>3||boy<40.0||kilo<10) {
			System.out.println("HATALI BIR DEGER GIRDINIZ");
		}
		else if(vki<=18.5) {
			System.out.println("VUCUT KITLE INDEKSINIZ : "+vki+" ZAYIF");
		}else if(vki>18.5&&vki<=24.9) {
			System.out.println("VUCUT KITLE INDEKSINIZ : "+vki+" NORMAL");
		}else if(vki>25&&vki<=29.9) {
			System.out.println("VUCUT KITLE INDEKSINIZ : "+vki+" KILOLU");
		}else if(vki>30&&vki<=39.9) {
			System.out.println("VUCUT KITLE INDEKSINIZ : "+vki+" OBEZ");
		}else if(vki>=40) {
			System.out.println("VUCUT KITLE INDEKSINIZ : "+vki+" MORBID OBEZ");
		}

	}

}
