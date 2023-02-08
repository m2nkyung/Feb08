/*(배열의  반환값  전달) 이전  문제에서  작성한  클래스에  새로운  메소드  getData를  추가 
하고, 이를  이용하여  동일한  실행결과를  보이도록  프로그래밍  하세요.*/

import java.util.Random;
public class Practice47 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = getData();
		
		displayArray(arr);
		System.out.println("\n가장 큰 숫자는 " + findMax(arr) + "입니다.");

	}
	public static int[] getData() {
		Random rd = new Random();
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
		}
		
		return arr;
	}
	
	public static void displayArray(int[] iArr) {
		for(int i : iArr) {
			System.out.print(i + "\t");
		}
	}
	
	public static int findMax(int[] iArr) {
		int max = 0;
		
		for(int i : iArr) {
			if(i > max) {
				max = i;
			}
		}
		
		return max;
	}
}