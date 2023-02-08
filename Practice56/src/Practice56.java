public class Practice56 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaterialBox box1 = new MaterialBox(2, 3, 4, "wood");
		MaterialBox box2 = new MaterialBox(4, 3, 2, "paper");
		
		System.out.println(box1.toString());
		System.out.println("부피는 " + box1.getVolume());
		System.out.println("무게는 " + box1.getWeight());
		
		System.out.println(box2.toString());
		System.out.println("부피는 " + box2.getVolume());
		System.out.println("무게는 " + box2.getWeight());
	}
}