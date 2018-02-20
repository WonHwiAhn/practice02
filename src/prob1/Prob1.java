/*
 * [문제1] 
	키보드에서 정수로 된 돈의 액수를 입력 받아 오만 원권, 만원 권, 오천 원권, 천원 권,
	500원 동전, 100원 동전, 50원 동전, 10원 동전, 1원 동전 각 몇 개로 변환 되는지 작성하시오.
 */

package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		int[] moneyUnit = {50000, 10000, 5000,
						   1000, 500, 100, 50, 10, 5, 1}; //돈 단위
		
		int[] moneyUnitSaveCount = new int[10]; //돈 단위 별 개수 저장 배열
		
		Scanner scanner = new Scanner( System.in );
		
		
		System.out.print( "금액:" );
		int money = scanner.nextInt();
		
		if(money < 0) //금액이 -면 0으로
			money = 0;
		
		System.out.println();
		
		for(int i=0;i<moneyUnit.length;i++) {
			moneyUnitSaveCount[i] = money / moneyUnit[i];
			money = money % moneyUnit[i];
			System.out.println(moneyUnit[i] + "원 : " + moneyUnitSaveCount[i] + "개");
		}
		
		scanner.close();
 	}
}