import java.security.PublicKey;
import java.util.Scanner;

public class ToolStore extends NormalLoc {

	ToolStore(Player player) {
		super(player, "Magaza");

	}

	public boolean getLocation() {
		System.out.println("Para : " + player.getMoney());
		System.out.println("1- Silahlar");
		System.out.println("2- Zirhlar");
		System.out.println("3- Cikis");
		System.out.print("Seciminiz : ");
		int selTool = scan.nextInt();
		int selItemID;
		switch (selTool) {
		case 1:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			break;
		case 2:
			selItemID = armorMenu();
			buyArmor(selItemID);
			break;
		default:
			break;
		}
		return true;
	}

	public int weaponMenu() {
		System.out.println("1- Tabanca | Ucret : 25 | Hasar : 2");
		System.out.println("2- Kilic | Ucret : 35 | Hasar : 3");
		System.out.println("3- Tufek | Ucret : 45 | Hasar : 7");
		System.out.println("4- Cikis");
		System.out.print("Silah Seciniz : ");
		int selWeaponID = scan.nextInt();
		return selWeaponID;
	}

	public void buyWeapon(int itemID) {
		int damage = 0, price = 0;
		String wName = null;
		switch (itemID) {
		case 1:
			damage = 2;
			wName = "Tabanca";
			price = 25;
			break;
		case 2:
			damage = 3;
			wName = "Kilic";
			price = 35;
			break;
		case 3:
			damage = 7;
			wName = "Tufek";
			price = 45;
			break;
		case 4:
			System.out.println("Marketten Cikis Yapiliyor...");
			break;
		default:
			System.out.println("Gecersiz Islem ! ");
			break;
		}
		if (price > 0) {
			if (player.getMoney() >= price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney() - price);
				System.out.println(wName + " Adli Silahi Satin Aldiniz, Eski Hasar : " + player.getDamage()
						+ "|| Yeni Hasar : " + player.getTotalDamage());
				System.out.println("Kalan Para" + player.getMoney());

			} else {
				System.out.println("Bakiye Yetersiz !");
			}
		}

	}
	public int armorMenu() {
		System.out.println("1- Hafif | Ucret : 15 | Savunma : 1");
		System.out.println("2- Orta | Ucret : 25 | Savunma : 3");
		System.out.println("3- Agir | Ucret : 40 | Savunma : 5");
		System.out.println("4- Cikis");
		System.out.print("Zirh Seciniz : ");
		int selArmorID = scan.nextInt();
		return selArmorID;
	}
	public void buyArmor(int itemID) {
		int avoid = 0, price = 0;
		String aName = null;
		switch (itemID) {
		case 1:
			avoid = 1;
			aName = "Hafif Zirh";
			price = 15;
			break;
		case 2:
			avoid = 3;
			aName = "Orta Zirh";
			price = 25;
			break;
		case 3:
			avoid = 5;
			aName = "Agir Zirh";
			price = 40;
			break;
		case 4:
			System.out.println("Marketten Cikis Yapiliyor...");
			break;
		default:
			System.out.println("Gecersiz Islem ! ");
			break;
		}
		if (price > 0) {
			if (player.getMoney() >= price) {
				player.getInv().setArmor(avoid);
				player.getInv().setaName(aName);
				player.setMoney(player.getMoney() - price);
				System.out.println(aName + " Adli Zirhi Satin Aldiniz, Savunma : " + player.getInv().getArmor());
				System.out.println("Kalan Para : " + player.getMoney());

			} else {
				System.out.println("Bakiye Yetersiz !");
			}
		}
	}
}
