package java_20200520;

public class ShapeDemo {
	//추상클래스의 다형성
	public static void run(Shape s) {
		s.draw();
	}
	/*
	public static void run(Circle c) {
		c.draw();
	}

	public static void run(Rectangle r) {
		r.draw();
		
	}

	public static void run(Triangle t) {
		t.draw();
	}*/

	public static void main(String[] args) {
		// 추상클래스는 객체를 생성할 수 없다.
		Rectangle r1 = new Rectangle();
		run(r1);

		Circle c1 = new Circle();
		run(c1);

		Triangle t1 = new Triangle();
		run(t1);

	}
}
