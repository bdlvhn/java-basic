package ch04.b;

import ch04.a.Cal;

public class App {

	// JVM�� ���� �޼��带 ã������ public�� �ʿ� (����)
	// JVM�� ���� �޼��带 ã������ static�� �ʿ� (�޸𸮿� �ø��ٴ� ��)
	// ���� �޼��常 return Ÿ���� ������� �ʴ´�.
	// �޼����� �̸� main�̴�.
	// String[] args �Ű����� : ���� ��.
	public static void main(String[] args) {
		Cal c = new Cal();
		c.minus();
	}

}
