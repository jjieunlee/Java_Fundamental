package java_20200515;

public class CustomerDemo {
	public static void main(String[] args) {
		// 클래스 객체 생성
		// Customer => 타입
		// c1=> 변수(reference)
		// new Customer() => 객체 생성
		Customer c1 = new Customer();
		c1.name = "이지은";
		c1.email = "jk04115@naver.com";
		c1.phone = "01032444426559";
		c1.balance = 1_000_000;
		c1.isReleased = false;

		System.out.println(c1.name);
		System.out.println(c1.phone);
		System.out.println(c1.email);
		System.out.println(c1.balance);
		System.out.println(c1.isReleased);

		Customer c2 = new Customer();
		c2.name = "이난니";
		c2.email = "jk04135@gggg.com";
		c2.phone = "010275565293";
		c2.balance = 100;
		c2.isReleased = false;

		System.out.println(c2.name);
		System.out.println(c2.phone);
		System.out.println(c2.email);
		System.out.println(c2.balance);
		System.out.println(c2.isReleased);
		System.out.println();

		Customer c3 = c2;
		c3.name = "이야오";

		System.out.println(c2.name); // 이야오
		
	}
}