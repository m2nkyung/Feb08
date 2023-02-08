public class HourlyEmployee extends Employee{
	private int rate, hours;

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public HourlyEmployee(String name, int id) {
		super(name, id);
	}
	
	public HourlyEmployee() {
		this("", 0);
	}

	public int computeSalary() {
		return rate * hours;
	}
	
	public String toString() {
		return (super.toString() + "의 지급 급여는 " + computeSalary());
	}
}