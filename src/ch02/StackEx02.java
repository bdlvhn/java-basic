package ch02;

/*
 * 
 * ���� : stack (�������� = �޼��尡 ����� �� �޸𸮿� �Ҵ�ȴ� = �޼��尡 ����� �� �޸𸮿��� �������)
 * 	   : heap (�������� = new�� �� �޸𸮿� �Ҵ�ȴ� = �� �̻� �������� ���� �� �޸𸮿��� �������)
 *     : static (�������� = main �޼��尡 ����Ǳ� ���� �޸𸮿� �Ҵ�ȴ� = main �޼��尡 ����Ǹ� �޸𸮿��� �������)
 */

public class StackEx02 {
	
	static int sum = 20; // �������� (static) main �޼��尡 ���۵Ǳ� ���� sum�� �Ҵ�ȴ�.
	int value = 50; // �������� (heap) // �� �̻� �������� ���� �� �ڵ����� �������.
	
	static void a() {
		// a �޼��尡 ����� �� stack ������ n1�� �Ҵ�ǰ� a �޼��尡 ����Ǹ� �޸𸮿��� �������.
		int n1 = 1; // a �޼����� ���� ������ ����� (��������)
		System.out.println(n1);
		
		// 21�� ������ ����Ƿ��� �� �� staic ������ �Ҵ��ؾ� �ϴµ� �Ұ����ϴ�! static ���� �Ҵ��� main �޼��� ���� ������ �����ϴ�.
		// static int n3 = 2;
	}
	
	public static void main(String[] args) {
		a(); // �޼��带 ȣ���Ѵ�.
		System.out.println(sum);
		StackEx02 s = new StackEx02(); // 15�� ���ο��� heap ������ value�� �Ҵ�ȴ�.
		System.out.println(s.value);
		System.out.println("test1 - �� �̻� s ������ �������� �ʱ� ������ �޸𸮿��� �������.");
		System.out.println("test1");
	}
}
