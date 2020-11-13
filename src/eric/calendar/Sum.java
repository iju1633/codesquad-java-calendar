//		키보드로 입력받은 두 숫자의 합을 구한다.
//		입력 및 출력 예시
//		두 수를 입력하세요.
//		5 10 (엔터)
//		두 수의 합은 15입니다.

package eric.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
	
	System.out.println("두 수를 입력하세요.");
	Scanner sc = new Scanner(System.in);
	int a,b;
	String S1, S2;
	
	S1 = sc.next();
	S2 = sc.next();
	
	a = Integer.parseInt(S1);
	b = Integer.parseInt(S2);
	
	
	System.out.printf("%d와 %d의 합은 %d입니다",a,b,a+b);
	sc.close();
	}

}
