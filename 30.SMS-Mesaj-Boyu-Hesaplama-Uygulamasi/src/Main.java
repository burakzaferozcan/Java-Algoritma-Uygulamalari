import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// SMS MESAJ BOYU HESAPLAMA UYGULAMASI
		Scanner input = new Scanner(System.in);
		System.out.println("LUTFEN MESAJINIZI GIRINIZ : ");
		String mesaj=input.nextLine();
		
		int mesajUzunlugu=(int)Math.ceil(mesaj.length()/160.0);
		System.out.println("MESAJINIZ "+mesaj.length()+" KARAKTERDEN OLUSUYOR VE "+mesajUzunlugu+" SMS HAKKI KULLANIYOR.");

		
		}

}
