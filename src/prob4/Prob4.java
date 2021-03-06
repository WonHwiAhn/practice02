package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		//-	문자열의 순서를 뒤집어서 char 배열로 리턴하는 메소드를 구현한다
		//-	예를 들어 “Hi!” 라는 문자열을 파라미터로 전달 하면 {‘!’, ‘i’, ‘H’ } 배열을 반환 한다.
		
		char[] castArray = new char[str.length()];
		
		for(int i=0; i<castArray.length;i++)
			castArray[i] = str.charAt((castArray.length-1)-i);
		
		return castArray;
	}
	
	public static void printCharArray(char[] array) {
		//-	char[]을 받아들여 출력한다.
		//-	{‘!’, ‘i’, ‘H’}   배열을 파라미터로 전달하면 다음과 같이 출력된다.!iH
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
