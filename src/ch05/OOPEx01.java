package ch05;

class Player {
	// �ʵ�
	private String name;
	private int thirsty;

	public Player(String name, int thirsty) {
		this.name = name;
		this.thirsty = thirsty;
	}

	void �����ñ�() {
		System.out.println("�� ���ñ�");
		this.thirsty -= 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getThirsty() {
		return thirsty;
	}

	public void setThirsty(int thirsty) {
		this.thirsty = thirsty;
	}
}

public class OOPEx01 {
	public static void main(String[] args) {
		Player p1 = new Player("ȫ�浿", 100);
		System.out.println("�̸� : " + p1.getName());
		System.out.println("�������� : " + p1.getThirsty());

//		1. ù ��° �ó����� : ���� (X)
//		p1.thirsty = 50;
//		System.out.println("�������� : " + p1.thirsty);

//		2. �� ��° �ó����� : ���°� ������ ������ (X) - �Ǽ��� �� �ִ�.
//		p1.�����ñ�();
//		System.out.println("�������� : " + p1.thirsty);

//		3. �� ��° �ó����� :
		p1.�����ñ�();
		System.out.println("�������� : " + p1.getThirsty());

	}
}
