package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		/*
		 * 로또복권 1. 1부터 14까지의 숫자 중 임의 숫자 6개를 생성 2. 6개의 숫자중 중복된 숫자가 나오면 안된다.
		 * Math.random()=> 0보다 크거나 같고 1보다 작은 양수를 double값으로 반환.(0.000000~0.999999) 
		 */
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			// 1부터 14까지의 랜덤 값
			int random = (int) (Math.random() * 45) + 1;
			lotto[i] = random;
			/*
			 * for(int j=0;j<i;j++) { if(lotto[i]==random) { lotto[i]=random; } }/*
			 * 
			 * /* for (int j = 1; j <= i; j++) { if (i>i-j&&lotto[i] == lotto[i - j]) {
			 * random = (int) (Math.random() * 14) + 1; lotto[i] = random; } }
			 */

			// 종복되는 값이 있는지 체크하는 변수
			boolean isExisted = false;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == random) {
					isExisted = true;
					break;
				}
			}
			if (!isExisted) {
				lotto[i] = random;
			} else {
				i--;
			}

		}
		//오름차순 버블정렬
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - (i + 1); j++) {
				if (lotto[j] > lotto[j + 1]) {
					int c;
					c = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = c;
				}
			}
		}
		for (int value : lotto) {
			System.out.print(value + "\t");
		}
		System.out.println("\n");
		
		//내림차순 버블정렬
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto.length-(i+1);j++) {
				if(lotto[j]<lotto[j+1]) {
					int d;
					d=lotto[j+1];
					lotto[j+1]=lotto[j];
					lotto[j]=d;
				}
			}
		}
		
		for (int value : lotto) {
			System.out.print(value + "\t");
		}
	}
}
