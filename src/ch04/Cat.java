package ch04;

// ���� �ʱ�ȭ���� �ʴ� ������ new�� ������ �ٸ� ����̸� ����� ���ؼ�
public class Cat {
	String name;
	String color;
	
	// ����Ʈ ������. ���������� �ڵ�
	// ���� ���� �����ڸ� �����ϰ� �Ǹ� ����Ʈ �����ڰ� ������ �� ����.
	public Cat() {
	}
	
	public Cat(String name, String color) { //������(�޼���)
		System.out.println("����̰� ź����.");
		this.name = name;
		this.color = color;
	}
}
