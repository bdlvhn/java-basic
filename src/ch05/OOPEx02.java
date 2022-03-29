package ch05;

class Engine {
	int power = 2000;
}

class Car {
	// 컴포지션
	Engine e;
	
	public Car(Engine e) {
		this.e = e;
	}
}

class Hamburger {
	String name = "기본햄버거";
	String 재료1 = "양상추";
	String 재료2 = "패티";
}

// 상속은 상태와 행위를 물려받을 수 있지만 꼭 타입이 일치되어야 한다.
class CheeseHamburger extends Hamburger {
	String name = "치즈햄버거";
	String 재료1 = "치즈";
	}

//class ChickenHamburger {
//	String name = "치킨버거";
//	Hamburger h;
//	
//}

public class OOPEx02 {

	public static void main(String[] args) {
		Engine e1 = new Engine();
		Car c1 = new Car(e1);
		System.out.println("자동차의 엔진 마력은 : " + c1.e.power);
		
		CheeseHamburger h1 = new CheeseHamburger();
		System.out.println("햄버거의 이름은 : " + h1.name);
		System.out.println("재료 : " + h1.재료1);
		System.out.println("재료 : " + h1.재료2);
	}

}
