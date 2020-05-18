package java_20200518;

public class MethodDemo {
	// 8-12라인: method정의
	// boolean은 method의 반환값
	// instance method
	// int year => 매개변수(parameter)
	public boolean isLeafYear(int year) {
		// method의 반환값이 boolean이기 때문에 return의 value도 boolean 이어야 한다.
		boolean isLeaf = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		return isLeaf;
	}

	public long plus(int first, int second) {
		return (long) first + (long) second;
	}

	public double divide(int first, int second) {
		return (double) first / (double) second;
	}

	public void println(String message) {
		System.out.println(message);
	}

	// 오름차순 method화
	public int[] ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp;
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// 객체 생성
		MethodDemo m = new MethodDemo();
		boolean test = m.isLeafYear(2100);// Argument
		if (test == true) {
			m.println("윤년입니다.");
		} else {
			m.println("윤년이 아닙니다. ");
		}
		long result1 = m.plus(456, 1123);
		System.out.println(result1);

		double result2 = m.divide(998, 223);
		System.out.println(result2);

		int[] temp = { 9, 5, 7, 4, 6, 2, 8, 1, 3 };
		int[] result3 = m.ascending(temp);

		for (int value : result3) {
			System.out.print(value + "\t");
		}
	}
}