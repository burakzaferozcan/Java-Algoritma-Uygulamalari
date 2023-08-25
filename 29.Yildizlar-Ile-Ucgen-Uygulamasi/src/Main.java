import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// YILDIZLAR İLE ÜÇGEN YAPMA UYGULAMASI
		Scanner input = new Scanner(System.in);
		System.out.print("LUTFEN UCGEN'IN KAC SATIRDAN OLUSACAGINI GIRINIZ : ");
		int ucgen=input.nextInt();
		for (int i = 1; i <= ucgen;i++) {
			for(int j=1;j<=ucgen-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		};
	}

}
