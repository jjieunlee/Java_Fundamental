package java_20200513;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		// 반복문 내에서 continue문을 만나면 수행을 중지하고 제어를 반복문 처음으로 이동
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				continue;
			sum += i;
		}
		System.out.println("1부터 10까지 합은 " + sum + "입니다. (단 6은 제외한다.)");

		// j=5인 곱셈만 생략됨
		for (int i = 2; i < 10; i++) {
			first: for (int j = 1; j < 10; j++) {
				if (j == 5)
					continue first;
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		// 모든 단의 j가 1~4까지만 출력됨
		first: for (int i = 2; i < 10; i++) {
			System.out.println();
			for (int j = 1; j < 10; j++) {
				if (j == 5)
					continue first;
				System.out.println(i + "*" + j + "=" + i * j);
			}	
		}
	}
}