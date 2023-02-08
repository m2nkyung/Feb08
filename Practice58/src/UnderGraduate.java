public class UnderGraduate extends Student {
	private int grade;
	
	public UnderGraduate(int id, int tuition, double gpa, int grade) {
		super(id, tuition, gpa);
		this.grade = grade;
	}
	
	public UnderGraduate() {
		super();
		grade = 0;
	}

	public int getScholarship() {
		if(getGpa() > 3.0) {
			return (int) (getTuition() * 0.3);
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return (super.toString() + " 학년=" + grade);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}