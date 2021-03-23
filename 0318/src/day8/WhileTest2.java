package day8;

public class WhileTest2 {
	public static void main(String[] args) {
		/*
		 for(초기식;조건식;증감식){
		 	반복 명령;
		 }
		 
		 => while문으로
		 
		 초기식
		 while(조건식){
		 	반복 명령;
		 	
		 	증감식;
		 }
		 
		 */

		for(int i=0;i<3;i++) {
			System.out.println(i);
		}//for

		System.out.println("\n====while문 이용===\n");

		int k=0;	//초기식
		while(k<3) {	//조건식
			System.out.println("k="+k);

			k++;	//증감식
		}//while



		//6단 구구단을 9~1까지 출력, while문 이용해서
		System.out.println("\n========================\n");
		int j=9;
		while(j>0) {
			System.out.println("6*"+j+"="+(6*j));

			j--;
		}


		/*
		 	1. java
		 	3. java
		 	5. oracle
		 	7. spring
		 	9. spring
		 */
		//while
		System.out.println("\n========================\n");
		k=1;
		while(k<10) {
			if(k<5) {
				System.out.println(k+". java");
			}else if(k==5) {
				System.out.println(k+". oracle");
			}else {
				System.out.println(k+". spring");
			}

			k+=2;
		}

		//for
		System.out.println("\n========================\n");
		for(int i=9;i>0;i-=2) {
			if(i<5) {
				System.out.println(i+". java");
			}else if(i==5) {
				System.out.println(i+". oracle");
			}else {
				System.out.println(i+". spring");
			}
		}
	}
}
