package eric.calendar;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		System.out.println("일  월  화  수 목  금  토\n--------------------");
		System.out.println("\n 1  2  3  4  5  6  7");
		System.out.println("\n 8  9 10 11 12 13 14");
		System.out.println("\n15 16 17 18 19 20 21");
		System.out.println("\n22 23 24 25 26 27 28");
		
//		달을 입력하세요.
//		3 (엔터)
//		3월은 31일까지 있습니다.
		
		String PROMPT = "cal > ";
		
		while (true)
		{
		System.out.println("\n달을 입력하세요");
		System.out.println(PROMPT);
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int[] result = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(input == -1) {
			break;
		}
		else if(input < 1) {
			System.out.println("1에서 12의 값을 입력해주십시오");
		}
		else if(input > 12) {
			continue;
		}
		else {
			System.out.printf("%d월은 %d일까지 있습니다.",input,result[input-1]);
		}
		}
	}

}
