package day8;

public class ContinueTest {
	public static void main(String[] args) {
		/*
		 �б⹮ - ��� �ٸ� ��ġ�� �ű�� ���
		 	break - �ݺ����̳� switch���� case�� ��� �� ���
		 	continue - �ݺ����� �ݺ��� �ѹ� �ǳʶٰ� ���� �ݺ��� ���� �� �� ���
		 			 - ���� �ݺ� ��ġ�� �̵�
		 			 - �ݺ��� �ȿ����� ��� ����
		 	return - �޼����� ������ �����ϰ� ȣ������� ����
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

		System.out.println("\n========��ø for : break========");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) break;

				System.out.println("i="+i+", j="+j);
			}
		}

		System.out.println("\n========��ø for : continue========");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) continue;

				System.out.println("i="+i+", j="+j);
			}
		}

		/*
		 �̸� ���� �ݺ���
		 - ��ø for���� �ݺ��� �տ� �̸�(Label)�� ���̰� break���� continue����
		   �̸���(Label) �����������ν� �ϳ� �̻��� �ݺ����� ����ų� �ݺ���
		   �ǳ� �� �� �ִ�.
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
			}//����for

			System.out.println();
		}//�ٱ�for
	}
}
