package java_20200518;

public class MethodOverloadingDemo {
	// MethodOverloadingDemo 클래스에서는 print 메서드를 4가지로 오버로딩
	/*
	 * 오버로딩 작성규칙 
	 * 1. 같은 클래스 내에서 생성 
	 * 2. 메서드 이름은 같아야 함 
	 * 3. 매개변수 갯수가 같으면 자료형이 달라야 함 
	 * 4. 매개변수 갯수가 달라야 함 
	 * 5. 반환형과 접근 한정자는 같아도 되고 달라도 됨
	 */
	public void print(String str) {
		System.out.println(str);
	}

	public void print(int i) {
		System.out.println(i);
	}

	public void print(double d) {
		System.out.println(d);
	}

	public void print(boolean b) {
		System.out.println(b);
	}

	public void print(int a, int b) {
		System.out.println(a + b);
	}

	public void test(int... a) {
		// variable arguments (매개변수 여러개 입출력 가능)
		for (int temp : a) {	
			System.out.print(temp);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.print("안녕");
		m.print(1);
		m.print(3.5);
		m.print(true);
		m.print(3, 2);
		m.test(2);
		m.test(1, 2, 3);
	}
}