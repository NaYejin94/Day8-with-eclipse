package day8;

public class ContinueTest {
	public static void main(String[] args) {
		/*
		 분기문 - 제어를 다른 위치로 옮기는 명령
		 	break - 반복문이나 switch문의 case를 벗어날 때 사용
		 	continue - 반복문의 반복을 한번 건너뛰고 다음 반복을 실행 할 때 사용
		 			 - 다음 반복 위치로 이동
		 			 - 반복문 안에서만 사용 가능
		 	return - 메서드의 실행을 종료하고 호출원으로 복귀
		 */

		for(int i=1;i<=10;i++) {
			if(i==5) continue;

			System.out.println("i="+i);
		}

		System.out.println("\n========break========");

		for(int i=1;i<=10;i++) {
			if(i==5) break;

			System.out.println("i="+i);
		}

		System.out.println("\n========중첩 for : break========");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) break;

				System.out.println("i="+i+", j="+j);
			}
		}

		System.out.println("\n========중첩 for : continue========");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) continue;

				System.out.println("i="+i+", j="+j);
			}
		}

		/*
		 이름 붙은 반복문
		 - 중첩 for에서 반복문 앞에 이름(Label)을 붙이고 break문과 continue문에
		   이름을(Label) 지정해줌으로써 하나 이상의 반복문을 벗어나거나 반복을
		   건너 뛸 수 있다.
		 */

		Loop1 :for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5) {
					//break Loop1;
					//continue Loop1;
					//break;
					continue;
				}

				System.out.println(i+"*"+j+"="+i*j);
			}//안쪽for

			System.out.println();
		}//바깥for
	}
}
