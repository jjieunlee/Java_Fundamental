package java_20200520;

public class SubDemo2 {
	public static void change(Super sup) {//super sup = s1;
		sup.age=20;
		sup.playBadook();
		sup.work();//Sub work호출 - 이유: overriding 메서드는 자식메서드가 호출됨
	}
	public static void main(String[] args) {
		Sub s1=new Sub();
		System.out.println(s1.age);	//50
		
		//Sub s1안에 있는 Super를 가리킴
		change(s1);
		System.out.println(s1.age);	//20
	}
}
