import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fibonacci serisi uygulaması
		long s1=0,s2=1,sonuc=0,sayiInput;
		Scanner input=new Scanner(System.in);
		System.out.print("FIBONACCI SERISI UYGULAMASINA HOSGELDINIZ\nKAC ADET FIBONACCI SAYISI GORMEK ISTIYORSUNUZ : ");
		sayiInput=input.nextLong();
		for(int i=1;i<=sayiInput;i++) {
			System.out.print(s1+"-");
			sonuc=s1+s2;
			s1=s2;
			s2=sonuc;

		}

	}

}
