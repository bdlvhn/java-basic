package ch07;
// SubThread -> Runnable(������)
class SubThread implements Runnable {
	
	// �ڹ��� ���� ������
	@Override
	public void run() {
		for(int i=1; i<5+1; i++) {
			try {
				System.out.println("���� ������ : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadEx01 {
	// �ڹ��� ���� ������
	public static void main(String[] args) {
		SubThread st = new SubThread();
		Thread t1 = new Thread(st); // target ����
		t1.start(); // run() �޼��� ����
		
		for(int i=1; i<5+1; i++) {
			try {
				System.out.println("���� ������ : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
