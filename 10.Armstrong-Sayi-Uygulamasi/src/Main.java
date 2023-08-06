import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ARMSTRONG SAYI UYGULAMASI
    	Scanner input=new Scanner(System.in);
    	System.out.print("ARMSTRONG SAYISI UYGULAMASINA HOSGELDINIZ\nLUTFEN BIR SAYI GIRINIZ : ");
        long sayi = input.nextLong(), sayiYedek = sayi, sonuc = 0;
        byte basamak = 0;
        while (sayiYedek != 0) {
            sayiYedek /= 10;
            basamak++;
        }

        sayiYedek = sayi; // İlk değeri tekrar atıyoruz
        while (sayiYedek != 0) {
            short kuvvet = 1;
            for (int i = 1; i <= basamak; i++) {
            	kuvvet *= (sayiYedek % 10);
            }
            
            sonuc += kuvvet;
            sayiYedek /= 10;
        }

        if (sonuc == sayi) {
            System.out.println(sayi + " BIR ARMSTRONG SAYISIDIR");
        } else {
            System.out.println(sayi + " BIR ARMSTRONG SAYISI DEGILDIR.");
        }
    }
}
