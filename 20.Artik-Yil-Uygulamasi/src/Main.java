import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ARTIK YIL UYGULAMASI
		// ARTIK YILLAR 4 RAKAMININ KATI OLAN YILLARDIR
		// 100'UN KATI OLANLARDAN SADECE 400'UN KATLARINA TAM BOLUNEN YILLAR 
		Scanner input=new Scanner(System.in);
		System.out.print("ARTIK YIL UYGULAMASINA HOSGELDINIZ\nARTIK YIL OLUP OLMADIGINI OGRENMEK ISTEDIGINIZ YILI GIRINIZ : ");
		long yil=input.nextLong();
		if((yil%4==0&&yil%100!=0)||yil%400==0) {
			System.out.println(yil+" YILI ARTIK YILDIR");
		}else {
			System.out.println(yil+" YILI ARTIK YIL DEGILDIR");
		}

	}

}
