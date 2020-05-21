package java_20200521;

public class StringDemo {

	public static void change(int x, int[] array, String str) {
		x = 20;
		array[0] = 10;
		str = str + "1234";
		System.out.println(str); // abc1234
	}

	public static void main(String[] args) {
		int a = 10;
		int[] b = { 1, 2, 3 };

		// String은 한번 정의되면 바뀌지 않음
		String str = "abc";

		change(a, b, str);

		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(str); // 123
		// 위의 str와 아래의 str는 다른 것을 가리킨다.

		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println(s1 == s2);// false
		//equals() 메서드가 true가 나오는 이유는 Object클래스의 equals() 메서드를 오버라이딩(객체 안의 문자열 비교) 했기 때문
		System.out.println(s1.equals(s2));// true

		String s3 = "World";
		String s4 = "World";
		
		System.out.println(s3 == s4);// true
		System.out.println(s3.equals(s4));// true
		
		StringBuffer sql = new StringBuffer();
		sql.append("select ");

	}
}
