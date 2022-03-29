package ch04;

// 값을 초기화하지 않는 이유는 new할 때마다 다른 고양이를 만들기 위해서
public class Cat {
	String name;
	String color;
	
	// 디폴트 생성자. 생략가능한 코드
	// 내가 직접 생성자를 구현하게 되면 디폴트 생성자가 생략될 수 없다.
	public Cat() {
	}
	
	public Cat(String name, String color) { //생성자(메서드)
		System.out.println("고양이가 탄생함.");
		this.name = name;
		this.color = color;
	}
}
