package day8;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		/*
			while�� - �ݺ�Ƚ���� �������� ó���� �ַ� ���
					  Ư�������� �ְ� �� ������ �����ϴµ��� ����ؼ� �ݺ���Ű�� ��
					  
			while(�ݺ� ����){
				�ݺ����;
			}
			
			=> �ݺ������� ���ε��� �ݺ������ �ݺ�����
		 */

		Scanner sc = new Scanner("\n\n������ �ϳ� ��\n\n��\n\n");
		String str="";

		//public boolean hasNext()
		//���� ������(��ū)�� ������ true �ƴϸ� false
		while(sc.hasNext()) {	
			str=sc.nextLine();
			System.out.println("���:"+str);
		}

		str=sc.nextLine();	// ������ \n
		System.out.println("while�� Ż�� �� 1: "+str);

		//str=sc.nextLine();//error
		//System.out.println("while�� Ż�� �� 2: "+str);


		//next()
		System.out.println("\n==================================\n");
		Scanner sc2 = new Scanner("\n\n������ �ϳ� ��\n\n��\n\n");
		str="";

		//public boolean hasNext()
		//���� ������(��ū)�� ������ true �ƴϸ� false
		while(sc2.hasNext()) {	
			str=sc2.next();
			System.out.println("���:"+str);
		}

		str=sc2.nextLine();	// ������ \n
		System.out.println("while�� Ż�� �� 1: "+str);

		str=sc2.nextLine();
		System.out.println("while�� Ż�� �� 2: "+str);

		//str=sc2.nextLine();	//error
		//System.out.println("while�� Ż�� �� 3: "+str);

	}
}
