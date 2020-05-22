package java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// HashSet 객체의 중복을 허용하지 않고, 순서 없음

		// 1. 선언 및 생성
		HashSet<Integer> set = new HashSet<Integer>();

		// 2. 할당
		set.add(1); // auto boxing
		set.add(2); // auto boxing
		set.add(3); // auto boxing
		set.add(4); // auto boxing
		set.add(1); // auto boxing

		// System.out.println(set.size());

		// 3. 출력
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			Integer number = i.next();
			System.out.println(number);
		}

		HashSet<Customer> set1 = new HashSet<Customer>();
		set1.add(new Customer("이지은1"));
		set1.add(new Customer("이지은2"));
		set1.add(new Customer("이지은3"));
		set1.add(new Customer("이지은1"));

		System.out.println("size: " + set1.size()); // 3 -> customer class에서 hasCode equals 처리

		// 로또 복권-HashSet(객체의 중복 허용하지 않음)

		HashSet<Integer> lotto = new HashSet<Integer>();
		while (true) {
			int random = (int) (Math.random() * 45) + 1;
			lotto.add(random);
			if (lotto.size() == 6) {
				break;
			}
		}
		Iterator<Integer> iter = lotto.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		System.out.println();
		
		// 로또 복권-TreeSet(객체의 중복 허용하지 않음)-> 오름차순 정렬
		TreeSet<Integer> lotto1 = new TreeSet<Integer>();
		while (true) {
			int random = (int) (Math.random() * 45) + 1;
			lotto1.add(random);
			if (lotto1.size() == 6) {
				break;
			}
		}
		Iterator<Integer> iter1 = lotto1.iterator();
		while (iter1.hasNext()) {
			System.out.print(iter1.next() + "\t");
		}
	}
}