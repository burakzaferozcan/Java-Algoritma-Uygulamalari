import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// kullanıcı girişi uygulaması
		// kullanıcı adı ve şifreyi kullanıcıdan alarak bir login uygulaması yapınız
		// kullanıcı adı: java ve kullanıcı şifresi: 1234 olur ise 
		// başarılı olarak giriş yapılsın
		String kullaniciAdi,sifre;
		Scanner input=new Scanner(System.in);
		System.out.print("LUTFEN KULLANICI ADINIZI GIRINIZ : ");
		kullaniciAdi=input.nextLine();
		System.out.print("LUTFEN SIFRENIZI GIRINIZ : ");
		sifre=input.nextLine();
		if(kullaniciAdi.equals("java")&&sifre.equals("1234")) {
			System.out.println("BASARILI BIR SEKILDE GIRIS YAPTINIZ.");
		}else {
			System.out.println("KULLANICI ADINIZ YA DA SIFRENIZ HATALI LUTFEN TEKRAR DENEYINIZ!!!");
		}
		

	}

}
