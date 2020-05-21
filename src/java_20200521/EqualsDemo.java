package java_20200521;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true

		Customer c1 = new Customer("이지은", "대구");
		Customer c2 = new Customer("이지은", "대구");

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

		// toString()이 생략된 표현
		System.out.println(c1);
		System.out.println(s1);
	}
}
