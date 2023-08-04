import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// GİRİLEN 3 SAYIYI BUYUKTEN KÜÇÜĞE SIRALAYAN UYGULAMA
		double sayi1, sayi2, sayi3;
		Scanner input = new Scanner(System.in);
		System.out.println("GIRILEN (BENZERSIZ) 3 SAYIYI BUYUKTEN KUCUGE SIRALAYAN UYGULAMAYA HOSGELDINIZ ");
		System.out.print("1. SAYIYI GIRINIZ : ");
		sayi1 = input.nextDouble();
		System.out.print("2. SAYIYI GIRINIZ : ");
		sayi2 = input.nextDouble();
		System.out.print("3. SAYIYI GIRINIZ : ");
		sayi3 = input.nextDouble();

		if (sayi1 > sayi2 && sayi1 > sayi3) {
			if (sayi2 > sayi3) {
				System.out.print(sayi1 + ">" + sayi2 + ">" + sayi3);
			} else {
				System.out.print(sayi1 + ">" + sayi3 + ">" + sayi2);
			}
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			if (sayi1 > sayi3) {
				System.out.print(sayi2 + ">" + sayi1 + ">" + sayi3);
			} else {
				System.out.print(sayi2 + ">" + sayi3 + ">" + sayi1);
			}
		} else if (sayi3 > sayi1 && sayi3 > sayi2) {
			if (sayi2 > sayi1) {
				System.out.print(sayi3 + ">" + sayi2 + ">" + sayi1);
			} else {
				System.out.print(sayi3 + ">" + sayi1 + ">" + sayi2);
			}
		} else {
			System.out.println("LUTFEN BIRBIRINDEN FARKLI 3 SAYI GIRINIZ");
		}

	}

}
