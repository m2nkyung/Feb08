public class Graduate extends Student{
	private String lab;
	
	public Graduate(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	
	public Graduate() {
		super();
		lab = "";
	}

	public int getScholarship() {
		if(getGpa() > 3.5) {
			return (int) (getTuition() * 0.5);
		} else {
			return (int) (getTuition() * 0.1);
		}
	}
	
	public String toString() {
		return super.toString() + " 연구실=" + lab;
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}
}