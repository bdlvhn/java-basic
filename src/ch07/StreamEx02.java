package ch07;

import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {

	public static void main(String[] args) {
		InputStream in = System.in; // System.in (Ű����)
		InputStreamReader ir = new InputStreamReader(in); // 65 -> A�� ��ȣȭ
		
		try {
			char[] data = new char[3];
			ir.read(data);
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
