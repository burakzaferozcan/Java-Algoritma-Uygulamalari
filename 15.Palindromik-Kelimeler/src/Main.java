import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// PALİNDROMİK KELİMELER BAŞTAN SONA OKUNUŞU İLE SONDAN BAŞA OKUNUŞU AYNI OLAN KELİMELERDİR
		Scanner input=new Scanner(System.in);
		System.out.println("PALINDROMIK KELIMELER UYGULAMASINA HOSGELDINIZ\nPALINDROMIK KELIMELER BASTAN SONA OKUNUSU ILE SONDAN BASA OKUNUSU AYNI OLAN KELIMELERDIR\nLUTFEN PALINDROMIK OLUP OLMADIGINI OGRENMEK ISTEDIGINIZ KELIMEYI GIRINIZ : ");
		
		String kelime=input.nextLine().toUpperCase(),kontrolKelime="";
		for(int i=kelime.length()-1;i>=0;i--) {
			kontrolKelime+=kelime.charAt(i);
		}

		if(kontrolKelime.equals(kelime)) {
			System.out.println("'"+kelime +"' POLINDROMIK BIR KELIMEDIR");
		}else {
			System.out.println(kelime+" POLINDROMIK BIR KELIME DEGILDIR CUNKU TERSI : '"+kontrolKelime+"'");
		}

		
		

	}

}
