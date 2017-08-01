package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] intArray = new int [5];
		double average = 0;
		int sum = 0 ; 
		
		System.out.println("5개의 숫자를 입력하시오");
		for(int i=0; i<5 ; i++) {
		intArray[i] = in.nextInt();
		
	}
		
		in.close();
		
		for(int i=0; i<5 ; i++) {
			
			sum += intArray[i];
			
		}
		
		average = sum/5;
		
		System.out.println("평균은" + average +"입니다");
		
		
}
}
