package java_20200521;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		/*
		 * 자바 1.4 이전 버전에서는 primitive data type을 Collection에 저장 할 수 없었기 때문에 primitive
		 * data type을 객체화 할 수 있는 wrapper class가 필요함 아래와 같이 1을 추가할 수 없음 Collection에 1을
		 * 저장하기 위해서는 primitive data type를 객체화 하는 Integer 클래스로 변환해야 함
		 **/
		ArrayList list = new ArrayList();
		// list.add(1); -> boxing 1.8에서는 오류나지 않음
		list.add(new Integer(1));

		// 1. primitive data type => wrapper class ( new Integer(1) )
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);

		// 2. wrapper class => primitive data type ( xxxValue() )
		int i3 = i1.intValue() + i2.intValue();

		// 3. String => primitive data type
		String s1 = "10";
		String s2 = "20";

		int i4 = Integer.parseInt(s1) + Integer.parseInt(s2);

		String s10 = "10.2";
		String s20 = "20.89";

		double i40 = Double.parseDouble(s10) + Double.parseDouble(s20);
		System.out.println(i40);

		// 4.primitive data type => String
		String s3 = 10 + "";
		String s4 = String.valueOf(10);

		// primitive data type이 자동으로 wrapper class로 변환하는 것을 Auto boxing 이라고 함
		Integer i5 = 10;
		Integer i6 = 20;

		// wrapper class가 자동으로 primitive data type으로 변환하는 것을 Auto un-boxing 이라고 함
		int i7 = i5 + i6;
		System.out.println(i7);
	}

}
