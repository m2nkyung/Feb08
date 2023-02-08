package game;

import java.util.Random;
public class Dice {
	private int value;
	
	Random rd = new Random();

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void Die() {
		value = 1;
	}
	
	public int roll() {
		value = rd.nextInt(7);
		return value;
	}
	
	public String toString() {
		return "주사위 : " + value;
	}
}