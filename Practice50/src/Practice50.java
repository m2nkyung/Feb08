// 다음과  같이  Person으로부터  상속받은  Student 클래스를  정의하시오.

public class Practice50 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		
		s1.setName("김동덕");
		s1.setClass(4);
		
		System.out.println(s1.getName() + "학생은 " + s1.getGrade() + "학년입니다.");
	}
}