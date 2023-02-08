public class MaterialBox extends Box {
	
	private String attribute;
	
	public MaterialBox(int length, int width, int height, String attribute) {
		super(length, width, height);
		this.attribute = attribute;
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
	
	public double getWeight() {
		if(attribute.equals("paper")) {
			return getVolume() * 1.5;
		} else if(attribute.equals("wood")) {
			return getVolume() * 2.5;
		} else {
			return getVolume() * 1.1;
		}
	}
	
	public String toString() {
		return (super.toString() + ", material=" + attribute);
	}
}