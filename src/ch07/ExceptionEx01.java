package ch07;

class 총 {
	void shoot() {
		System.out.println("총을 발사했습니다.");
	}
}

public class ExceptionEx01 {

	public static void main(String[] args) {
		// 컴파일 예외 (Java가 알 수 있다)
		try {
			System.out.println("잠자기 시작");
			Thread.sleep(3000); // 메인 스레드 1초동안 잠을 잔다!!
			System.out.println("잠자기 끝");
		} catch (InterruptedException e) { // 방해
			e.printStackTrace();
		}
		
		// 런타임 예외 (개발자가 알 수 있다)
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[3]); // 강제 종료!!
		} catch (Exception e) {
			// catch의 역할은 try하다가 예외가 발생하면 어떻게 처리할 지를 정의하는 영역
			System.out.println("괜찮아 그냥 진행해");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			총 s = null;
			s.shoot();
		} catch (Exception e) {
			System.out.println("총이 없어서 발사하지 못했습니다.");
		}
		
		
		System.out.println("메인 스레드 종료");
	}

}
