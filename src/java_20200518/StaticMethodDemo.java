package java_20200518;

public class StaticMethodDemo {
	String name;
	static double interestRate;

	public void m1() {
		// instance 메서드에서는 instance 변수, static 변수 모두 사용가능
		// instance 메서드에서는 instance 메서드, static 메서드 모두 호출 가능
		// name == this.name 같은 클래스 안에 있기 때문에 this 생략 가능
		// interesteRate == StaticMethodDemo.interestRate 같은 클래스 안에 있기 때문에
		// StaticMethodDemo 생략가능
		this.name = "이지은"; // this 자기 자신 객체
		StaticMethodDemo.interestRate = 4.5;
		this.m2();
		StaticMethodDemo.m4();
	}

	public void m2() {
		System.out.println("m2() instance 메서드 호출");
	}

	public static void m3() {
		// static 메서드에서는 static 변수만 사용가능, instance 변수 사용 불가
		// static 메서드에서는 static 메서드만 호출 가능, instance 메서드 호출 불가
		// static 메서드에서는 this 사용할 수 없음.
		// name = "이나연";
		StaticMethodDemo.interestRate = 4.4;
		// m2();
		StaticMethodDemo.m4();

		// static 메서드에서 instance 변수와 instance 메서도를 호출하려면 객체를 생성해서 사용해야 한다.
		StaticMethodDemo m = new StaticMethodDemo();
		m.name = "이나연";
		m.m2();
	}

	public static void m4() {
		System.out.println("m4() static 메서드 호출");
	}

	public static void main(String[] args) {
		StaticMethodDemo.m4();
		StaticMethodDemo.m3();
		StaticMethodDemo.interestRate = 4.3;

		StaticMethodDemo m0 = new StaticMethodDemo();
		m0.m1();
		m0.m2();
		m0.name = "이형수";
	}

}
