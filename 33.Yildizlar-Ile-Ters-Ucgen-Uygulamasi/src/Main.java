import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// YILDIZLAR İLE TERS ÜÇGEN YAPMA UYGULAMASI
		Scanner input = new Scanner(System.in);
		System.out.print("LUTFEN SATIR SAYISI GIRINIZ : ");
		int n=input.nextInt();
		for(int i =n;i>=1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=(i*2)-1;k>=1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
