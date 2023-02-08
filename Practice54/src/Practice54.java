//(상속과  메소드  재정의) Practice 51에서  작성한  재질박스에  toString() 메소드를  재정의하여라.

public class Practice54 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaterialBox b = new MaterialBox(2, 3, 4, "wood");
		
		System.out.println(b.toString());
		System.out.println("부피는 " + b.getVolume());
		System.out.println("무게는 " + b.getWeight());
	}
}