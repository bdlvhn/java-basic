package ch07;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("�ٴ�");
		String s2 = new String("�ٴ�");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		String s3 = "�ٴ�";
		s3 = s3 + "�¾�";
		String s4 = "�ٴ�";
		s3 = s3 + "��";
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3.equals(s4));	
	}

}
