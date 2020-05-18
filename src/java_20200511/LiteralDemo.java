package java_20200511;

public class LiteralDemo {

	public static void main(String[] args) {
		
		/*
		//byte 범위(-128~127)를 넘어가면 overflow발생-> compile error
		byte b1= 128;
		*/
		int a1 = 128;	//10진수 표기법->128
		int a2 = 076;	//8진수 표기법->62
		int a3 = 0x123;	//16진수 표기법->291
		int a4 = 0b1010;//2진수 표기법->10
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//long 리터럴은 숫자뒤에 l또는 L로 표시
		long l1 = 12l;
		System.out.println(l1);
		
		//float 리터럴은 숫자뒤에 f또는 F로 표시
		float f1 = 123.4f;
		System.out.println(f1);
		
		//double 리터럴은 숫자뒤에 d또는 D로 표시. 생략가능
		double d1 = 13.56;
		System.out.println(d1);
		
		//boolean 리터럴은 true 또는 false
		boolean isExisted = false;
		System.out.println(isExisted);
		
		//사칙연산을 하게 되면 저절로 int형으로 취함-> 강제로 형변환 해야함
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		int b4 = b1 + b2;
		System.out.println(b3);
		System.out.println(b4);
		
		//문자형, 아스키코드
		char c1 = 97;
		System.out.println(c1);
		
		//문자형, 유니코드
		char c2 = '\u0068';
		System.out.println(c2);
		
		//문자형, 문자
		char c3 = 'a';
		System.out.println(c3);
	}

}
