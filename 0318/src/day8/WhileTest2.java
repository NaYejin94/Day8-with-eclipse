package day8;

public class WhileTest2 {
	public static void main(String[] args) {
		/*
		 for(�ʱ��;���ǽ�;������){
		 	�ݺ� ���;
		 }
		 
		 => while������
		 
		 �ʱ��
		 while(���ǽ�){
		 	�ݺ� ���;
		 	
		 	������;
		 }
		 
		 */

		for(int i=0;i<3;i++) {
			System.out.println(i);
		}//for

		System.out.println("\n====while�� �̿�===\n");

		int k=0;	//�ʱ��
		while(k<3) {	//���ǽ�
			System.out.println("k="+k);

			k++;	//������
		}//while



		//6�� �������� 9~1���� ���, while�� �̿��ؼ�
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
