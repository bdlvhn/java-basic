package ch05;


class �Ӳ��� {
	void �޸���() {
		System.out.println("�޸���1");
	}
	
	void �޸���(int speed) {
		System.out.println("�޸���2");
	}
	
	void �޸���(double speed) {
		System.out.println("�޸���3");
	}
	
	void �޸��� (int speed, double power) {
		System.out.println("�޸���4");
	}
}

// �����ε� ���� ��
// �����ε��� �� ����ϴ°�?
public class OOPEx04 {
	public static void main(String[] args) {
		�Ӳ��� i1 = new �Ӳ���();
		i1.�޸���();
		i1.�޸���(2);
		i1.�޸���(5.0);
		i1.�޸���(1, 5.0);
	}
}
