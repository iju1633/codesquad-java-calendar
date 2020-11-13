package eric.calendar;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		System.out.println("일  월  화  수 목  금  토\n--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
//		월을 입력하면 해당월의 달력을 출력한다.
//		달력은 모양은 1단계에서 작성한 모양으로 만든다.
//		1일은 일요일로 정해도 무방하다.
//		-1을 입력받기 전까지 반복 입력받는다.
//		프롬프트를 출력한다.
		
		String PROMPT = "cal > ";
		
		while (true)
		{
		System.out.println("\n달을 입력하세요");
		System.out.println(PROMPT);
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		// int[] result = {31,28,31,30,31,30,31,31,30,31,30,31};
		
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
			if(input==2) {
				System.out.println("일  월  화  수 목  금  토\n--------------------");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
			}
			else if(input/2 == 1) {
				System.out.println("일  월  화  수 목  금  토\n--------------------");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
			}
			else if(input == 8) {
				System.out.println("일  월  화  수 목  금  토\n--------------------");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
			}
			else {
				System.out.println("일  월  화  수 목  금  토\n--------------------");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30");
			}
			}
		}
		}
	
}
