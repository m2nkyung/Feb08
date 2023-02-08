public class Practice57 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cylinder c1 = new Cylinder();
		System.out.println("Cylinder 객체 1에 관한 정보입니다.");
		System.out.println("반지름 : " + c1.getRadius());
		System.out.println("단면적 : " + c1.getArea());
		System.out.println("높이 : " + c1.getHeight());
		System.out.println("부피 : " + c1.getVolume());
		
		Cylinder c2 = new Cylinder(5, 3);
		System.out.println("Cylinder 객체 2에 관한 정보입니다.");
		System.out.println("반지름 : " + c2.getRadius());
		System.out.println("단면적 : " + c2.getArea());
		System.out.println("높이 : " + c2.getHeight());
		System.out.println("부피 : " + c2.getVolume());
	}
}