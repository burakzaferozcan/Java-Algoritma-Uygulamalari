import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// HAVA DURUMUNA GÖRE ETKİNLİK ÖNEREN UYGULAMA
		
		double derece;
		Scanner input=new Scanner(System.in);
		System.out.println("ETKINLIK ONEREN UYGULAMAYA HOSGELDINIZ");
		System.out.print("LUTFEN HAVA DURUMUNU GIRINIZ (DERECE) : ");
		derece=input.nextDouble();
		if(derece>=30) {
			System.out.println("YUZMEYE GIDEBILIRSINIZ");
		}else if(derece>=5&&derece<30) {
			System.out.println("SINEMAYA GIDEBILIRSINIZ");
		}else {
			System.out.println("KAYAGA GIDEBILIRSINIZ");
		}

	}

}
