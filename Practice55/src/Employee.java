public class Employee {
	
	private String name, position;
	private int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Employee() {
		this("모름", -1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int computeSalary() {
		return -1;
	}
	
	public String toString() {
		return (name + "(" + position + ", " + id + ")");
	}
}