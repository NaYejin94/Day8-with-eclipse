package day8;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		/*
		 	do while문 - 선 실행 후 조건 처리
		 			  - 조건이 거짓이더라도 실행 구문을 최소한 한번은 수행
		 			  
		 	do{
		 		반복할 명련문;
		 	}while(조건식);
		 	
		 */

		int k=0;
		do {
			System.out.println(k); //0,1,2

			k++;
		}while(k<3);

		k=1;
		do {
			System.out.println("k="+k);

			k++;
		}while(k>4); //조건이 거짓이지만 한번은 수행

		//사용자로부터 입력받은 수의 합을 구하되, 0이 입력되면 종료
		Scanner sc = new Scanner(System.in);

		int num=0, sum=0;
		do {
			//1.사용자 입력받기
			System.out.println("숫자 입력!(끝낼때는 0)");
			num=sc.nextInt();

			//2.로직처리
			sum+=num;
		}while(num!=0);

		//3.결과출력
		System.out.println("\n"+sum);
	}
}
