package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int [] bills = new int [10]; // 각각 필요한 장수 
		int input;                  // 사용자 입력 금액 
		
		
	
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		scan.close();
		System.out.println("금액 :" + input);

		
		for(int i=0; i<10; i++)
		if(input>MONEYS[i]) {
			
			bills[i] = input/MONEYS[i];
			input = input - bills[i]*MONEYS[i];
		
		
		System.out.println(MONEYS[i]+"원 :" + bills[i]+"개");
		
		}
		
		
		
 	}
}