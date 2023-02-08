/* (상속과  메소드  재정의) 클래스  간의  is_a 관계를  연습한다. 
SalariedEmployee is an Employee. 
HourlyEmployee is an Employee. 
• 회사에서 근무하는 직원들의 급여를 계산하는 프로그램을 상속을 이용하여 작성 */

import java.util.Scanner;
public class Practice55 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		Employee e0 = new Employee();
		System.out.print("이름은? ");
		e0.setName(input.next());
		System.out.print("직원번호는? ");
		e0.setId(input.nextInt());
		System.out.print("직급은? ");
		e0.setPosition(input.next());
		
		System.out.println(e0.toString());
		
		SalariedEmployee e1 = new SalariedEmployee();
		System.out.print("이름은? ");
		e1.setName(input.next());
		System.out.print("직원번호는? ");
		e1.setId(input.nextInt());
		System.out.print("직급은? ");
		e1.setPosition(input.next());
		System.out.print("월급은? ");
		e1.setMonthly(input.nextInt());
		
		System.out.println(e1.toString());
		
		HourlyEmployee e2 = new HourlyEmployee();
		System.out.print("이름은? ");
		e2.setName(input.next());
		System.out.print("직원번호는? ");
		e2.setId(input.nextInt());
		System.out.print("직급은? ");
		e2.setPosition(input.next());
		System.out.print("시급은? ");
		e2.setRate(input.nextInt());
		System.out.print("일한 시간은? ");
		e2.setHours(input.nextInt());
		
		System.out.println(e2.toString());
	}

}
