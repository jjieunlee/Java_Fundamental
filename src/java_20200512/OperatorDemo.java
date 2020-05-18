package java_20200512;

public class OperatorDemo {
	public static void main(String[] args) {

		/* 산술연산자 */
		int a = 10, b = 22;
		int c = 0;
		double d = 0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		d = (double) b / (double) a;
		System.out.println(d);

		c = a * b;
		System.out.println(c);

		// 나머지 연산자
		c = b % a;
		System.out.println(c);

		/* 복합대입연산자 */
		a += b; // a = a+b
		System.out.println(a);

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			// sum = sum+i;
			sum += i;
		}
		System.out.println(sum);

		/* 증감연산자 */
		a = 10;
		b = 20;

		a++;
		++b;
		System.out.println(a); // a = 11
		System.out.println(b); // b = 21

		// 대입 후 증가
		c = a++;
		System.out.println(c); // c = 11

		// 증가 후 대입
		c = ++b;
		System.out.println(c); // c = 22

		/* 비교연산자 */
		a = 10;
		b = 20;
		d = 10.0;
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);

		isSuccess = a < b;
		System.out.println(isSuccess);

		isSuccess = a >= b;
		System.out.println(isSuccess);

		isSuccess = a <= b;
		System.out.println(isSuccess);

		isSuccess = a == b;
		System.out.println(isSuccess);

		// primitive data type의 == 연산자는 자료형에 상관없이 값만 같으면 true로 반환
		isSuccess = a == d;
		System.out.println(isSuccess); // true

		isSuccess = a != d;
		System.out.println(isSuccess); // false

		/* 비트연산자 */
		a = 3; // 0011
		b = 5; // 0101
		System.out.println(a & b); // AND => 0001(1)
		System.out.println(a | b); // OR => 0111(7)
		System.out.println(a ^ b); // XOR => 0110(6)

		/* 논리연산자 */
		b = 20;

		// a && b => a가 false이면 b를 연산하지 않음(short circuit)
		// a || b => a가 true이면 b를 연산하지 않음(short circuit)

		isSuccess = (a == b) && (++a == b++);
		System.out.println(isSuccess); // false
		System.out.println(a); // 10
		System.out.println(b); // 20

		// + => 연결연산자(두개 중 1개 이상이 문자열일 경우), 산술연산자(두개 모두 숫자일 경우)
		System.out.println(1 + 2 + 3 + "456"); // 6456
		System.out.println("123" + 4 + 5 + 6); // 12456

	}
}
