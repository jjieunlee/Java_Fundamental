package java_20200521;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(3.7);
		System.out.println(d1);

		d1 = Math.floor(4.9);
		System.out.println(d1);

		long l1 = Math.round(89.7);
		System.out.println(l1);

		d1 = 45.67;

		d1 = d1 * 10;
		
		l1=Math.round(d1);
		d1=(double)l1/10;
		System.out.println(d1);
		// 45.7
		
		int a1=Math.abs(-123);
		System.out.println(a1);
		
		d1 = Math.sqrt(4);
		System.out.println(d1);
		
		d1 = Math.pow(2, 3);
		System.out.println(d1);
		
		d1=Math.random();
		System.out.println(d1);
	}
}
