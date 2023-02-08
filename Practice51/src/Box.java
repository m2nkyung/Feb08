public class Box {
	
	private int length, width, height;
	
	public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public Box() {
		this(0, 0, 0);
	}
	
	public double getWeight() {
		return getVolume() * 1.1;
	}
	
	public int getVolume() {
		return length * width * height;
	}
	
	public String toString() {
		return "length=" + length + " width=" + width + " height=" + height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}