package ch05;


class 임꺽정 {
	void 달리기() {
		System.out.println("달리기1");
	}
	
	void 달리기(int speed) {
		System.out.println("달리기2");
	}
	
	void 달리기(double speed) {
		System.out.println("달리기3");
	}
	
	void 달리기 (int speed, double power) {
		System.out.println("달리기4");
	}
}

// 오버로딩 문법 끝
// 오버로딩은 왜 사용하는가?
public class OOPEx04 {
	public static void main(String[] args) {
		임꺽정 i1 = new 임꺽정();
		i1.달리기();
		i1.달리기(2);
		i1.달리기(5.0);
		i1.달리기(1, 5.0);
	}
}
