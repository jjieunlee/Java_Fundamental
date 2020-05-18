package java_20200513;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (i == 5) {
				break;
			}
		}
		System.out.println("1부터 5까지 합은 " + sum + "입니다.");
		
		//5 * 5까지만 출력하시(label 사용->for문이 여러개일때 사용)
		label:for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i==5 && j==6) {
					break label;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
