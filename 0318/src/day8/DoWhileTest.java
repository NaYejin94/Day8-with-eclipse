package day8;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		/*
		 	do while�� - �� ���� �� ���� ó��
		 			  - ������ �����̴��� ���� ������ �ּ��� �ѹ��� ����
		 			  
		 	do{
		 		�ݺ��� ��ù�;
		 	}while(���ǽ�);
		 	
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
		}while(k>4); //������ ���������� �ѹ��� ����

		//����ڷκ��� �Է¹��� ���� ���� ���ϵ�, 0�� �ԷµǸ� ����
		Scanner sc = new Scanner(System.in);

		int num=0, sum=0;
		do {
			//1.����� �Է¹ޱ�
			System.out.println("���� �Է�!(�������� 0)");
			num=sc.nextInt();

			//2.����ó��
			sum+=num;
		}while(num!=0);

		//3.������
		System.out.println("\n"+sum);
	}
}
