package ch05;

class ���� {
	String name = "����";
	
	void �⺻����(�ü� e1) {
		System.out.println("������ " + e1.name + " �����ϱ�");
	}
	
	void �⺻����(������ e1) {
		System.out.println("������ " + e1.name + " �����ϱ�");
	}
}

class �ü� {
	String name = "�ü�";
	void �⺻����(������ e1) {
		System.out.println("Ȱ�� "+ e1.name + " �����ϱ�");
	}
	
	void �⺻����(���� e1) {
		System.out.println("Ȱ�� "+ e1.name + " �����ϱ�");
	}
}

class ������ {
	String name = "������";
	void �⺻����(���� e1) {
		System.out.println("������ " + e1.name + " �����ϱ�");
	}
}

class ������ {
	String name = "������";
	void �⺻����(���� e1) {
		System.out.println("�������� " + e1.name + " �����ϱ�");
	}
}

class ���� {
	String name = "����";
	void �⺻����(���� e1) {
		System.out.println("Ȱ�� " + e1.name + " �����ϱ�");
	}
}

class �渶���� {
	String name = "�渶����";
	void �⺻����(���� e1) {
		System.out.println("Ȱ�� " + e1.name + " �����ϱ�");
	}
}

public class OOPEx05 {

	public static void main(String[] args) {
		���� u1 = new ����();
		�ü� u2 = new �ü�();
		������ u3 = new ������();
		u1.�⺻����(u2);
		u1.�⺻����(u3);
		u2.�⺻����(u3);
		u3.�⺻����(u1);
		
	}

}