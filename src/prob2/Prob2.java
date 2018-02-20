/*
 * [문제2] 
	키보드에서 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하시오
	
	키보드에서 문자열을 입력 받을 때에는 java.util.Scanner 클래스를 사용합니다.
	주어진 소스를 수정하면 안됩니다.

 */

package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		double sum = 0;
		
		Scanner scanner = new Scanner( System.in );
		
		System.out.println( "5개의 숫자를 입력하세요." );
		
		for(int i=0;i<intArray.length;i++)  //입력받는 곳
			intArray[i] = scanner.nextInt();
		
		for(int i=0;i<intArray.length;i++)  //입력된 값 더하는 곳
			sum += intArray[i];
		
		double avr = sum / intArray.length; //평균 구하는 곳
		
		System.out.println("평균은 " + avr + " 입니다.");
		
		scanner.close();
	}
}
