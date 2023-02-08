public class MaterialBox extends Box {
	
	private String attribute;
	
	public MaterialBox(int lenght, int width, int height, String attribute) {
		setLength(lenght);
		setWidth(width);
		setHeight(height);
		setAttribute(attribute);
	}
	
	public MaterialBox() {
		this(0, 0, 0, "0");
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
	public String toString() {
		return super.toString() + " material=" + attribute;
	}
}