package day8;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		/*
		 	���ѷ���
		 	for(;;){
		 		�ݺ��� ����;
		 		
		 		if(����)
		 		break;
		 	}
		 	
		 	while(true){
		 		�ݺ��� ����;
		 		
		 		if(����)
		 		break;
		 	}
		 */

		//���� �ݺ�
		//����� �Է¹޾Ƽ� ���, ���� ���, 0�� �Է��ϸ� ����
		Scanner sc = new Scanner(System.in);

		while(true) {
		//1.����� �Է¹ޱ�
		System.out.println("������ �Է��ϼ���(�������� 0)");
		int num = sc.nextInt();

		//Ż������
		if(num==0) 
			break;

		//2.����ó��
		String result="";
		if(num>0) {
			result="���";
		}else {
			result="����";
		}

		//3.������
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
