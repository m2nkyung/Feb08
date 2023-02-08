/*for-each 10개의  난수를  생성하여  배열에  저장
•      0부터  99 사이의  숫자만  발생시킴
•         10개의  숫자를  화면에  1줄로  출력
•         10개  중에서  가장  큰  숫자를  찾아서  화면에  출력 */

import java.util.Random;
public class Practice46 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random();
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100);
		}
		
		displayArray(arr);
		System.out.println("\n가장 큰 숫자는 " + findMax(arr) + "입니다.");
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