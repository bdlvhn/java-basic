package ch05;

class �����佺���� {
	String name = "�����佺����";
	void �⺻����(�����佺���� e1) { }
	String �̸�Ȯ��() {
		return "";
	}
}

class ���� extends �����佺���� {
	String name = "����";
	void �⺻����(�����佺���� e1) {
		System.out.println("������ " + e1.�̸�Ȯ��() + "�� �����մϴ�.");
	}
	String �̸�Ȯ��() {
		return name;
	}
}

class ��� extends �����佺���� {
	String name = "���";
	void �⺻����(�����佺���� e1) {
		System.out.println("����� " + e1.�̸�Ȯ��() + "�� �����մϴ�.");
	}
	String �̸�Ȯ��() {
		return name;
	}
}

class ��ũ���÷� extends �����佺���� {
	String name = "��ũ���÷�";
	void �⺻����(�����佺���� e1) {
		System.out.println("��ũ���÷��� " + e1.�̸�Ȯ��() + "�� �����մϴ�.");
	}
	String �̸�Ȯ��() {
		return name;
	}
}

class ���� extends �����佺���� {
	String name = "����";
	void �⺻����(�����佺���� e1) {
		System.out.println("������ " + e1.�̸�Ȯ��() + "�� �����մϴ�.");
	}
	String �̸�Ȯ��() {
		return name;
	}
}

public class OOPEx06 {

	public static void main(String[] args) {
		�����佺���� u1 = new ����(); // ����, �����佺����
		�����佺���� u2 = new ���(); // ���, �����佺����
		�����佺���� u3 = new ��ũ���÷�(); // ��ũ���÷�, �����佺����
		u1.�⺻����(u2);
		u2.�⺻����(u1);
		u1.�⺻����(u3);
		u3.�⺻����(u2);
	}

}
