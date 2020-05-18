package java_20200514;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] lotto = new int[size];
		System.out.println("뽑을 로또수를 적으시오");
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;
			lotto[i] = random;
			while (true) {
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[i - j]) {
						lotto[i] = (int) (Math.random() * 45) + 1;
					}
				}
				System.out.println(lotto[i]);
			}

			
		}

	}

}
