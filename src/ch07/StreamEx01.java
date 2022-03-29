package ch07;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; // System.in (Ű����)
		
		// 1. Ű���� A�� ���ڵ��ؼ� 01000001���� ��ǻ�Ϳ��� ����
		// 2. ByteStream���� �귯����. (input)
		// 3. read() �޼���� 01000001 -> 65�� ���ڵ��Ѵ�.
		// 4. 65 -> ���ڷ� ��ȣȭ�Ѵ�.
		try {
			int data = in.read();
			System.out.println((char)data); // ��ȣȭ
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
