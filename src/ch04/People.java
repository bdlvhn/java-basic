package ch04;

// this는 자기 자신의 heap 공간을 가리킨다.
public class People {
	String name;
	int age;
	
	// 디폴트 생성자 .java -> .class 컴파일시 자바가 자동으로 넣어줌
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
