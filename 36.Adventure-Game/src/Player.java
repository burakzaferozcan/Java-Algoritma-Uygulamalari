import java.util.Scanner;

public class Player {
	private int damage, healthy, money, rHealthy;
	private String name, cName;
	private Inventory inv;
	Scanner scan = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
	}

	public void selectedCha() {
//		chaMenu();
		switch (chaMenu()) {
		case 1:
			initPlayer("Samuray", 5, 21, 15);
			break;
		case 2:
			initPlayer("Okcu", 7, 18, 20);
			break;
		case 3:
			initPlayer("Sovalye", 8, 24, 5);
			break;
		default:
			initPlayer("Samuray", 5, 21, 15);
			break;
		}
		System.out.println("Karakteriniz : " + getcName() + " | Hasar : " + getDamage() + " | Saglik : " + getHealthy()
				+ " | Para : " + getMoney());
	}

	public int chaMenu() {
		System.out.println("1. Karakter\nTuru : Samuray | Hasar : 5 | Saglik : 21 | Para : 15\n-------------");
		System.out.println("2. Karakter\nTuru : Okcu | Hasar : 7 | Saglik : 18 | Para : 20\n-------------");
		System.out.print(
				"3. Karakter\nTuru : Sovalye | Hasar : 8 | Saglik : 24 | Para : 5\n-------------\nLutfen Bir Karakter Seciniz (1-2-3) : ");
		int chaID = scan.nextInt();
		while (chaID < 1 || chaID > 3) {
			System.out.print("Lutfen Gecerli Bir Karakter Seciniz! : ");
			chaID = scan.nextInt();
		}
		return chaID;
	}
public int getTotalDamage() {
	return this.getDamage()+this.getInv().getDamage();
}
	public void initPlayer(String cName, int dmg, int hlthy, int mny) {
		setcName(cName);
		setDamage(dmg);
		setHealthy(hlthy);
		setMoney(mny);
		setrHealthy(hlthy);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	public int getrHealthy() {
		return rHealthy;
	}

	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}
}
