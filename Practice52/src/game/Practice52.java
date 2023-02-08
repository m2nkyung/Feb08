//6면  주사위를  나타내는  Die 클래스와  이를  이용하는  프로그램을  작성하시오

package game;
public class Practice52 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dice d1 = new Dice();
		Dice d2 = new Dice();

		outerLoop :
		for(int i = 1; ; i++) {
			if(d1.roll() == d2.roll()) {
				System.out.println(i + "차 : 첫번째 " + d1.toString() + ", 두번째 " + d2.toString());
				System.out.println("게임을 종료합니다.");
				break outerLoop;
			} else {
				System.out.println(i + "차 : 첫번째 " + d1.toString() + ", 두번째 " + d2.toString());
			}
		}
	}
}