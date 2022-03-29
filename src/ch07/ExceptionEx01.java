package ch07;

class �� {
	void shoot() {
		System.out.println("���� �߻��߽��ϴ�.");
	}
}

public class ExceptionEx01 {

	public static void main(String[] args) {
		// ������ ���� (Java�� �� �� �ִ�)
		try {
			System.out.println("���ڱ� ����");
			Thread.sleep(3000); // ���� ������ 1�ʵ��� ���� �ܴ�!!
			System.out.println("���ڱ� ��");
		} catch (InterruptedException e) { // ����
			e.printStackTrace();
		}
		
		// ��Ÿ�� ���� (�����ڰ� �� �� �ִ�)
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[3]); // ���� ����!!
		} catch (Exception e) {
			// catch�� ������ try�ϴٰ� ���ܰ� �߻��ϸ� ��� ó���� ���� �����ϴ� ����
			System.out.println("������ �׳� ������");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			�� s = null;
			s.shoot();
		} catch (Exception e) {
			System.out.println("���� ��� �߻����� ���߽��ϴ�.");
		}
		
		
		System.out.println("���� ������ ����");
	}

}