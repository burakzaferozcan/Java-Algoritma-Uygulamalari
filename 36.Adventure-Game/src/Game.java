import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

public class Game {
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);

	public void login() {

		System.out.print("Macera Oyununa Hosgeldiniz!\nOyuna Baslamak Icin Isminizi Giriniz : ");
		String playerName = scan.nextLine();
		player = new Player(playerName);
		player.selectedCha();
		start();
	}

	public void start() {
		while (true) {
			System.out.println();
			System.out.println("============================================");
			System.out.println();
			System.out.println("1. Guvenli Ev -> Size Ait Guvenli Bir Mekan, Dusman Yok ");
			System.out.println("2. Magara -> Karsiniza Zombi Cikabilir! ");
			System.out.println("3. Orman -> Karsiniza Vampir Cikabilir!");
			System.out.println("4. Nehir -> Karsiniza Ayi Cikabilir!");
			System.out.println("5. Magaza -> Ekipman Alabilirsiniz");
			System.out.print("Eylem Gerceklestirmek Icin Bir Yer Seciniz (1-2-3-4-5) : ");
			int selLoc = scan.nextInt();
			while (selLoc < 1 || selLoc > 5) {
				System.out.print("Lutfen Gecerli Bir Yer Seciniz : ");
				selLoc = scan.nextInt();
			}
			switch (selLoc) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location=new Cave(player);
				break;
			case 3:
				location=new Forest(player);
				break;
			case 4:
				location=new River(player);
				break;
			case 5:
				location = new ToolStore(player);
				break;
			default:
				location = new SafeHouse(player);
				break;
			}
			if(location.getClass().getName().equals("SafeHouse")) {
				if(player.getInv().isFirewood()&&player.getInv().isFood()&&player.getInv().isWater()) {
					System.out.println("Tebrikler Oyunu Basariyla Bitirdiniz!");
					break;
				}
			}
			if (!location.getLocation()) {
				System.out.println("Oyun Bitti !");
				break;
			}
		}

	}
}
