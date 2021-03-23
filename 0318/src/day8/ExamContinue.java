package day8;

import java.util.Scanner;

public class ExamContinue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int res1=0, res2=0;
		while(true) {
			System.out.println("두 개의 정수를 입력하세요(피제수 제수 순으로 입력)");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if(num1==0 && num2==0) break;

			if(num2==0) {
				System.out.println("제수가 0이므로 연산을 생략합니다.");
				continue;
			}

			res1 = num1/num2;
			res2 = num1%num2;

			System.out.println("몫 : "+res1+", 나머지 : "+res2);	

			}

	}
}
