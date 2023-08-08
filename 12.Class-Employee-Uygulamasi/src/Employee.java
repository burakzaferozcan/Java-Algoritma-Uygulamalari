
public class Employee {

	private String name;
	private int workHours, hireYear;
	public double salary;

	public Employee(String name, int workHours, int hireYear, double salary) {
		this.name = name;
		this.workHours = workHours;
		this.hireYear = hireYear;
		this.salary = salary;
	}
	public double tax() {
		if (this.salary >= 1000) {
			return salary * 0.03;
		} else {
			return 0.0;
		}
	}

	public double bonus() {
		int extraHours=workHours-40;
		if(extraHours>0) {
		return 30 * extraHours;
		}else {
			return 0.0;
		}
	}

	public double incrase() {
		int year = 2023 - this.hireYear;
		if (year < 10) {
			return salary * 0.5;
		} else if (year >= 10 && year < 20) {
			return salary * 0.10;
		} else {
			return salary * 0.15;
		}
	}
	 public void toString(Employee employee) {
		 System.out.println("TAX (VERGI) "+employee.tax());
			System.out.println("BONUS (MESAI) "+employee.bonus());
			System.out.println("INCRASE (MAAS ZAMMI) "+employee.incrase());
			double totalSalary=employee.salary-employee.tax()+employee.bonus();
			System.out.println("TOTAL SALARY WITH TAX AND BONUS (VERGI VE MESAI ILE TOPLAM MAAS): "+totalSalary);
			System.out.println("TOTAL SALARY WITH THE RAISE OF SALARY (MAAS ZAMMI ILE TOPLAM MAAS): "+(employee.salary+employee.incrase()));
	 }

}
