import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TAKSIMETRE UYGULAMASI
		// KM VAŞI ÜCRET 2.20TL 
		// KISA MESAFE TUTARI 20 TL YANİ 20 TLNİN ALTINDAKİ ÜCRETLERDE YİNE 20 TL ALINACAK
		// TAKSIMETRE ACILIS UCRETI 10 TL
		Scanner input=new Scanner(System.in);
		double km,tutar=10,kmBasi=2.20;
		System.out.print("TAKSIMETREYE HOSGELDINIZ\nKAC KM MESAFAYE GIDECEGINIZI GIRINIZ : ");
		km=input.nextDouble();
		tutar+=km*kmBasi;
		if(tutar<20) {
			tutar=20;
		}
		System.out.println("ODENECEK TUTAR : "+tutar);
		
	}

}
