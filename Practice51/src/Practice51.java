/* (상속) 재질박스  클래스
박스에  가로, 세로, 높이  뿐만  아니라  재질  속성을  추가하고자  한다.
이를  위해  박스  클래스를  완전히  새로  정의하는  대신, 기존의  박스  클래스를  상속하여 
새로운  박스  클래스를  정의해보자. */

public class Practice51 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaterialBox b = new MaterialBox(2, 3, 4, "wood");
		
		System.out.println(b.toString());
		System.out.println("재질은 " + b.getAttribute());
		System.out.println("부피는 " + b.getVolume());
		System.out.println("무게는 " + b.getWeight());
	}
}