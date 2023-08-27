import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// GİRİLEN SAYILARIN EN BÜYÜĞÜNÜ VE EN KÜÇÜĞÜNÜ BULAN UYGULAMA
		System.out.print("KAC ADET SAYI GIRMEK ISTIYORSUNUZ : ");
		double max=0,min=0,adet,sayi;
		adet=input.nextDouble();
		for(int i=1;i<=adet;i++) {
			System.out.print(i+". SAYIYI GIRINIZ : ");
			sayi=input.nextDouble();
			if(sayi<min||min==0) {
				min=sayi;
			}if(sayi>max) {
				max=sayi;
			}
		}
		System.out.println("GIRDIGINIZ SAYILARIN EN BUYUGU : "+max);
		System.out.println("GIRDIGINIZ SAYILARIN EN KUCUGU : "+min);

	}

}
