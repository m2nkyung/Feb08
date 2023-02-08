public class Student {
	private int id, tuition;
	private double gpa;
	
	public Student(int id, int tuition, double gpa) {
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	
	public Student() {
		this(0, 0, 0);
	}
	
	public String toString() {
		return ("id=" + id + " tuition=" + tuition + " gpa=" + gpa + " 장학금=" + getScholarship());
	}
	
	public int getScholarship() {
		return 0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTuition() {
		return tuition;
	}
	public void setTuition(int tuition) {
		this.tuition = tuition;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}