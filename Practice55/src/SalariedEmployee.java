public class SalariedEmployee extends Employee {
	private int monthly;

	public int getMonthly() {
		return monthly;
	}

	public void setMonthly(int monthly) {
		this.monthly = monthly;
	}
	
	public SalariedEmployee(String name, int id) {
		super(name, id);
	}
	
	public SalariedEmployee() {
		this("", 0);
	}

	public int computeSalary() {
		return monthly * 12;
	}
	
	public String toString() {
		return (super.toString() + "의 연봉은 " + computeSalary());
	}
}