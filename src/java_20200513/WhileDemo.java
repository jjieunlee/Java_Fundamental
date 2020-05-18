package java_20200513;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		// 1부터 10까지 합
		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.\n", sum);

		// 구구단
		i = 2;
		int j;
		while (i < 10) {
			j = 1;
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + i * j);
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
