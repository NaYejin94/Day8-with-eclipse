package day8;

import java.util.Scanner;

public class ExamContinue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int res1=0, res2=0;
		while(true) {
			System.out.println("�� ���� ������ �Է��ϼ���(������ ���� ������ �Է�)");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if(num1==0 && num2==0) break;

			if(num2==0) {
				System.out.println("������ 0�̹Ƿ� ������ �����մϴ�.");
				continue;
			}

			res1 = num1/num2;
			res2 = num1%num2;

			System.out.println("�� : "+res1+", ������ : "+res2);	

			}

	}
}
