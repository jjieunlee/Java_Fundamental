package java_20200520;

public class SubDemo {
	public static void main(String[] args) {
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.work();
		s1.playBadook();
		System.out.println();

		Sub s2 = new Sub();
		System.out.println(s2.age);
		System.out.println(s2.height);
		s2.work(); // sub's work 출력
		s2.playGame();
		s2.playBadook();
		System.out.println();
		s2.age=20;
		System.out.println(s2.age);
		System.out.println();
		
		Super s3 = new Sub();
		System.out.println(s3.age);	//50
		// System.out.println(s3.height);
		s3.work(); // sub's work 출력
		s3.playBadook();
		System.out.println();

		s3 = s2; // s2안에 있는 super을 가리킨다 sub(x)
		System.out.println(s3.age);	//20
		// System.out.println(s3.height);
		// s3.playGame();
	}
}
