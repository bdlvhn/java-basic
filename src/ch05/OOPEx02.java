package ch05;

class Engine {
	int power = 2000;
}

class Car {
	// ��������
	Engine e;
	
	public Car(Engine e) {
		this.e = e;
	}
}

class Hamburger {
	String name = "�⺻�ܹ���";
	String ���1 = "�����";
	String ���2 = "��Ƽ";
}

// ����� ���¿� ������ �������� �� ������ �� Ÿ���� ��ġ�Ǿ�� �Ѵ�.
class CheeseHamburger extends Hamburger {
	String name = "ġ���ܹ���";
	String ���1 = "ġ��";
	}

//class ChickenHamburger {
//	String name = "ġŲ����";
//	Hamburger h;
//	
//}

public class OOPEx02 {

	public static void main(String[] args) {
		Engine e1 = new Engine();
		Car c1 = new Car(e1);
		System.out.println("�ڵ����� ���� ������ : " + c1.e.power);
		
		CheeseHamburger h1 = new CheeseHamburger();
		System.out.println("�ܹ����� �̸��� : " + h1.name);
		System.out.println("��� : " + h1.���1);
		System.out.println("��� : " + h1.���2);
	}

}
