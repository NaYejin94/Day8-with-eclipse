package day8;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		/*
			while문 - 반복횟수가 가변적인 처리에 주로 사용
					  특정조건을 주고 그 조건을 만족하는동안 계속해서 반복시키는 것
					  
			while(반복 조건){
				반복명령;
			}
			
			=> 반복조건이 참인동안 반복명령을 반복실행
		 */

		Scanner sc = new Scanner("\n\n가나다 하나 둘\n\n라\n\n");
		String str="";

		//public boolean hasNext()
		//다음 데이터(토큰)이 있으면 true 아니면 false
		while(sc.hasNext()) {	
			str=sc.nextLine();
			System.out.println("출력:"+str);
		}

		str=sc.nextLine();	// 마지막 \n
		System.out.println("while문 탈출 후 1: "+str);

		//str=sc.nextLine();//error
		//System.out.println("while문 탈출 후 2: "+str);


		//next()
		System.out.println("\n==================================\n");
		Scanner sc2 = new Scanner("\n\n가나다 하나 둘\n\n라\n\n");
		str="";

		//public boolean hasNext()
		//다음 데이터(토큰)이 있으면 true 아니면 false
		while(sc2.hasNext()) {	
			str=sc2.next();
			System.out.println("출력:"+str);
		}

		str=sc2.nextLine();	// 마지막 \n
		System.out.println("while문 탈출 후 1: "+str);

		str=sc2.nextLine();
		System.out.println("while문 탈출 후 2: "+str);

		//str=sc2.nextLine();	//error
		//System.out.println("while문 탈출 후 3: "+str);

	}
}
