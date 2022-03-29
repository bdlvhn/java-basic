package ch05;

class Player {
	// 필드
	private String name;
	private int thirsty;

	public Player(String name, int thirsty) {
		this.name = name;
		this.thirsty = thirsty;
	}

	void 물마시기() {
		System.out.println("물 마시기");
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
		Player p1 = new Player("홍길동", 100);
		System.out.println("이름 : " + p1.getName());
		System.out.println("갈증지수 : " + p1.getThirsty());

//		1. 첫 번째 시나리오 : 마법 (X)
//		p1.thirsty = 50;
//		System.out.println("갈증지수 : " + p1.thirsty);

//		2. 두 번째 시나리오 : 상태가 행위를 변경함 (X) - 실수할 수 있다.
//		p1.물마시기();
//		System.out.println("갈증지수 : " + p1.thirsty);

//		3. 세 번째 시나리오 :
		p1.물마시기();
		System.out.println("갈증지수 : " + p1.getThirsty());

	}
}
