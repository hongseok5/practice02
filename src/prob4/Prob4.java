package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {  // 스트링을 입력받아 문자 순서를 뒤집어 char[]로 반환 
		
		
		
		
		/* 코드를 완성합니다 */
		char[] src = new char[str.length()];  // 순서 바뀌기 전 스트링을 char 배열로 생성 

		
		for(int i=0; i<str.length();i++) {
			int j = str.length();
			src[i]= str.charAt(j-1);
			j--;
			
		}
		
		
			
		return src;
	}

	public static void printCharArray(char[] array){
		System.out.print(array);
		System.out.println("");
	}
}
