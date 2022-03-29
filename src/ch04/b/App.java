package ch04.b;

import ch04.a.Cal;

public class App {

	// JVM이 메인 메서드를 찾으려면 public이 필요 (공개)
	// JVM이 메인 메서드를 찾으려면 static이 필요 (메모리에 올린다는 뜻)
	// 메인 메서드만 return 타입을 허용하지 않는다.
	// 메서드의 이름 main이다.
	// String[] args 매개변수 : 몰라도 됨.
	public static void main(String[] args) {
		Cal c = new Cal();
		c.minus();
	}

}
