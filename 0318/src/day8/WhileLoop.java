package day8;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		/*
		 	무한루프
		 	for(;;){
		 		반복할 내용;
		 		
		 		if(조건)
		 		break;
		 	}
		 	
		 	while(true){
		 		반복할 내용;
		 		
		 		if(조건)
		 		break;
		 	}
		 */

		//무한 반복
		//사용자 입력받아서 양수, 음수 출력, 0을 입력하면 종료
		Scanner sc = new Scanner(System.in);

		while(true) {
		//1.사용자 입력받기
		System.out.println("정수를 입력하세요(끝낼때는 0)");
		int num = sc.nextInt();

		//탈출조건
		if(num==0) 
			break;

		//2.로직처리
		String result="";
		if(num>0) {
			result="양수";
		}else {
			result="음수";
		}

		//3.결과출력
		System.out.println(result+"\n");

		}//while
		System.out.println();

		//[p.115 - 1]
		//for
		int sum=0;
		for(int i=1;i<=20;i++) {
			if(!(i%2==0||i%3==0)) {
				sum+=i;
			}
		}
		System.out.println(sum);

		System.out.println();

		//while
		int sum2=0;
		int k=1;
		while(k<=20) {			
			if(!(k%2==0 || k%3==0)) {				
				sum2+=k;	
			}
			k++;
		}
		System.out.println(sum2);
	}
}
