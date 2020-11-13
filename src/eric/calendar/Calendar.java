//		키보드로 입력받은 두 숫자의 합을 구한다.
//		입력 및 출력 예시
//		두 수를 입력하세요.
//		5 10 (엔터)
//		두 수의 합은 15입니다.

package eric.calendar;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 합은 " + (num1+num2) + "입니다.");
		
	}

}
