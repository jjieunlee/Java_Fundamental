package java_20200513;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;

		// 1~10까지 합
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("1부터 10까지 합은 %d입니다.\n", sum);
		System.out.println("1부터 10까지 합은 " + sum + "입니다.");

		// 1~10까지 짝수 합
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 10까지 짝수의 합은 " + sum + "입니다.");

		// 1~10까지 홀수 합
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("1부터 10까지 홀수의 합은 " + sum + "입니다.");

		// 구구단(2 -> 9)
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + "=" + i * j);
			}
			System.out.println();
		}

		// 역순 구구단(9 -> 2)
		for (int i = 9; i > 1; i--) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d", i, j, i * j);
				System.out.println();
			}
			System.out.println();
		}

		/*
		 *
		 **
		 ***
		 ****
		 *****
		*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 *****
		 ****
		 ***
		 **
		 *
		*/
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		      *
		     **
		    ***
		   ****
		  *****
		*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 *****
		  ****
		   ***
		    **
		     *
		*/
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}