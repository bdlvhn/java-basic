package ch05;

abstract class ���ĵ��� {
	void �ȱ�() {
		System.out.println("�ȴ�");
	}
	
	// �̿ϼ� ���赵
	abstract void ����();
}

class �� extends ���ĵ��� {

	@Override
	void ����() {
		System.out.println("������ ����");
	}
	
}

class ���� extends ���ĵ��� {

	@Override
	void ����() {
		System.out.println("�̻��� ����");
	}
}

public class OOPEx08 {
	
	public static void main(String[] args) {
	}

}