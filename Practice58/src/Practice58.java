/* •           (상속과  생성자) p.265 #7을  기반으로  한  문제입니다.
–   학생  클래스와  이를  상속하는  학부생, 대학원생  클래스를  정의하고  이용하는  프로그램을  작 
성하시오.
–   공통  정보는  최대한  상위클래스에서  관리하도록  할  것 */

import java.util.Scanner;
public class Practice58 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Student s1 = new Student();
		System.out.println("학생의 정보를 입력한다. ");
		System.out.print("학번은? ");
		s1.setId(input.nextInt());
		System.out.print("등록금은? ");
		s1.setTuition(input.nextInt());
		System.out.print("평균 등급은? ");
		s1.setGpa(input.nextDouble());
		System.out.println(s1.toString());


		UnderGraduate s2 = new UnderGraduate();
		System.out.println("학부생의 정보를 입력한다. ");
		System.out.print("학번은? ");
		s2.setId(input.nextInt());
		System.out.print("등록금은? ");
		s2.setTuition(input.nextInt());
		System.out.print("평균 등급은? ");
		s2.setGpa(input.nextDouble());
		System.out.print("학년은? ");
		s2.setGpa(input.nextInt());
		System.out.println(s2.toString());
		

		Graduate s3 = new Graduate();
		System.out.println("대학원생의 정보를 입력한다. ");
		System.out.print("학번은? ");
		s3.setId(input.nextInt());
		System.out.print("등록금은? ");
		s3.setTuition(input.nextInt());
		System.out.print("평균 등급은? ");
		s3.setGpa(input.nextDouble());
		System.out.print("연구실? ");
		s3.setLab(input.next());
		System.out.println(s3.toString());
	}
}