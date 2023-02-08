//(객체들의  배열) Practice 40의  Date 클래스를  그대로  이용하여  다음과  같이  5개의 날짜를  입력받아  그대로  출력하는  프로그램을  작성하라.
import java.util.Scanner;
public class Practice48 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Date[] days = new Date[5];
		
		for(int i = 0; i < days.length; i++) {
			System.out.println((i + 1) + "번째 날짜를 입력하세요");
			
			days[i] = new Date();
			
			System.out.print("년도 : ");
			days[i].setYear(input.nextInt());
			System.out.print("월 : ");
			days[i].setMonth(input.nextInt());
			System.out.print("일 : ");
			days[i].setDay(input.nextInt());
		}
		
		for(int i = 0; i < days.length; i++) {
			System.out.println((i + 1) + "번째 날짜는 " + days[i].getYear() + "년 " + days[i].getMonth() + "월 " + days[i].getDay() + "일 입니다.");
		}
	}
}