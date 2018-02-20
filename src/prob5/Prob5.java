/*
 * [문제5]
	숨겨진 카드의 수를 맞추는 게임입니다. 1-100까지의 임의의 수를 가진 카드를 한 장
	숨기고 이 카드의 수를 맞추는 게임입니다. 아래의 화면과 같이 카드 속의 수가 57인 경
	우를 보면 수를 맞추는 사람이 40이라고 입력하면 "더 높게", 다시 75이라고 입력하면
	"더 낮게" 라는 식으로 범위를 좁혀가며 수를 맞추고 있습니다. 게임을 반복하기 위해
	y/n이라고 묻고 n인 경우 종료됩니다..

 */

package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		String moreGame = "";
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		//while(moreGame.equals("Y") || moreGame.equals("y")) {
		while(true) {
			System.out.print("수를 결정하였습니다. 맞추어 보세요\n1-100");
			int randNum = rand.nextInt(98)+1;
			System.out.println(randNum);
			
			if(checkNum(scan, randNum)) {
				System.out.println("정답입니다.");
				System.out.println("다시하시겠습니까? (Y/N)");
				moreGame = scan.next();
				
				if(moreGame.equals("N") || moreGame.equals("n"))
					break;
			}
		}
	}
	
	public static boolean checkNum(Scanner scan, int randNum) {
		int cnt = 1;
		while(true) {
			System.out.print(cnt+">>");
			int userNum = scan.nextInt();
			
			if(userNum == randNum) {
				return true;
			}else if(userNum < randNum) {
				System.out.println("더 높게");
			}else {
				System.out.println("더 낮게");
			}
			cnt++;
		}
	}
}