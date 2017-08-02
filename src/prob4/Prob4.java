package prob4;

public class Prob4 {

	
	
	
	
	
	public static void main(String[] args) {
		
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	
	
	
	
	
	public static char[] reverse(String str) {  // 스트링을 입력받아 문자 순서를 뒤집어 char[]로 반환 
		
		
		//스트링을 스트링으로 반환하고(순서바꿔서) 문자형 배열로 바꾸고 출력 
		char[] src = new char[str.length()];  // 순서 바뀌기 전 스트링을 char 배열로 생성 
		/* 코드를 완성합니다 */
		for(int i = 0; i<str.length();i++) {
		
		src[i]=str.charAt(str.length()-1-i);
		//String.valueOf(arg0) // 문자 배열을 받아 스트링으로 변환 
		}
		
		return src;
		


	}

	public static void printCharArray(char[] array){
		System.out.print(array);
		System.out.println("");
	}
}
