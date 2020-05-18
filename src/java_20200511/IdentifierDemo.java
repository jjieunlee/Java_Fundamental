package java_20200511;

public class IdentifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=10;
		String name="hello";
		String fatherName="John";
		System.out.println(name);
		System.out.println(age);
		System.out.println(fatherName);
		
		//예약어는 사용할수 없음
		//String void ="empty";
		
		//특수문자를 사용할수 없음(_,$예외)
		//int @height=10;
		
		//공백문자는 사용할수 없음
		//String a n="hello";
		
		//첫글자는 문자로만 시작하여야 한다($,_예외)
		int $ee=100;
		System.out.println($ee);
		//int !ee=100;

		
	}

}
