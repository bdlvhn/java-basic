package ch04;

public class CatApp {

	public static void main(String[] args) {
		// new -> �޸𸮿� �Ҵ� (heap) -> String name, String color
		// Cat() -> ������ ȣ�� -> ���¸� �ʱ�ȭ�ϱ� ���ؼ�
		// c1 -> heap ������ ����Ű�� �ּ�
		// Cat Ŀ���� Ÿ�� (�����ڰ� ���� Ÿ��)
		Cat c1 = new Cat("����", "���");
		System.out.println(c1.name); // null ��ü�� �������̴�. ���� ������ �ǹ�
		System.out.println(c1.color);
	}
}