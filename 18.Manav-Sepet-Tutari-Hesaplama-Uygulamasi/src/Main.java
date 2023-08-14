import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// MANAV SEPET TUTARI HESAPLAMA 
		Scanner input=new Scanner(System.in);
		double salatalikKGfiyat=3.14,elmaKGfiyat=4.11,kabakKGfiyat=2.22,domatesKGfiyat=0.95,patlicanKGfiyat=7.00,toplam;
		int salatalikKG,elmaKG,kabakKG,domatesKG,patlicanKG;
		System.out.print("MANAV SEPET TUTARI UYGULAMASINA HOSGELDINIZ\nKAC KG SALATALIK ALACAKSINIZ KG FIYAT 3.14 : ");
		salatalikKG=input.nextInt();
		System.out.print("KAC KG ELMA ALACAKSINIZ KG FIYAT 4.11 : ");
		elmaKG=input.nextInt();
		System.out.print("KAC KG KABAK ALACAKSINIZ KG FIYAT 2.22 : ");
		kabakKG=input.nextInt();
		System.out.print("KAC KG DOMATES ALACAKSINIZ KG FIYAT 0.95 : ");
		domatesKG=input.nextInt();
		System.out.print("KAC KG PATLICAN ALACAKSINIZ KG FIYAT 7.00 : ");
		patlicanKG=input.nextInt();
		toplam=(salatalikKGfiyat*salatalikKG)+(elmaKGfiyat*elmaKG)+(kabakKGfiyat*kabakKG)+(domatesKGfiyat*domatesKG)+(patlicanKGfiyat*patlicanKG);
		System.out.println("TOPLAM TUTAR : "+toplam+"TL");
	}

}
