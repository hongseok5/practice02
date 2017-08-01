package prob5;

import java.util.Random;
import java.util.Scanner;


public class Prob5 {    // 퍼블릭 클래스는 숫자의 범위와 정답을 가지고 게임 시작이라는 메소드를 가진다. 
	
	int minNumber = 1;
	int maxNumber = 100;
	int correctNumber = gameStart();
	
	public int gameStart() {
		
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + minNumber;   // 개별 게임은 맞춰야 하는 숫자를 가진다 
		System.out.println( "수를 결정하였습니다. 맞추어 보세요" );
		System.out.println(minNumber+"-"+maxNumber);
		return correctNumber;
	}

	public static void main(String[] args) {


		int input; // 유저가 입력하는 수 
		Prob5 p5 = new Prob5();
		p5.gameStart(); // 스타트를 실행해야 맞춰야 하는 점수가 생긴다. 
		
		for(int i=1; i<100; i++) {
			
			
			Scanner scan = new Scanner(System.in);
			input = scan.nextInt();
			
			
			if(input<p5.correctNumber) {
				p5.minNumber = input;
				System.out.println("더 높게");
				System.out.println(p5.minNumber+"-"+p5.maxNumber);
				continue;
			}
				else if(input>p5.correctNumber) {
					
					p5.maxNumber = input;
					System.out.println("더 낮게");
					System.out.println(p5.minNumber+"-"+p5.maxNumber);
					continue;
					
				}
				else 
					System.out.println("맞았습니다");
					
					System.out.println("다시 하시겠습니까(y/n)");
					String answer ;
					answer = scan.next();
					if( answer.equals("y") ){
						p5.gameStart();	
					}
					
					else
						scan.close();
					
					
			}
			
		}
		
		
		
		
	}

