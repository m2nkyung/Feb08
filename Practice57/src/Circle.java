public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		this(0);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
}