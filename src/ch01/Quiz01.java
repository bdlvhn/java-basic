package ch01;

class BoongerFish {
	int price = 1000;
	String taste = "sweet";
	String color = "yellow";
}

public class Quiz01 {

	public static void main(String[] args) {
		BoongerFish b1 = new BoongerFish();
		System.out.println(b1.price);
		System.out.println(b1.taste);
		System.out.println(b1.color);
	}

}
