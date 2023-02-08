// 앞의  프로그램에서  main 메소드를  변경하여  아래와  같은  프로그램을  작성하라. 즉, 5개의  날짜를  입력  받아  그  중  가장  날짜가  빠른  날을  출력하는  프로그램이다.

import java.util.Scanner;
public class Practice49 {
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
		
		Date early = days[0];
		int earlyIndex = 0;
		
		for(int i = 1; i < days.length; i++) {
			if(early.compareDate(early, days[i]) == 1) {
				early = days[i];
				earlyIndex = i - 1;
			}
		}
		
		System.out.println("가장 빠른 날짜는 " + earlyIndex + "번째 입력된 " + early.toString() + "입니다");
	}
}