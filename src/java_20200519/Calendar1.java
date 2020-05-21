package java_20200519;

public class Calendar1 {
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	public Calendar1() {

	}

	private int getCount(int year, int month, int day) {
		int totalCount = 0;

		int preYear = year - 1;
		// 2019년 총일 수
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);
		// 2019년 1월 ~ 4월까지 총일 수
		// totalCount += 31 + 29 + 31 + 30;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				monthArray[1] = 28;
			} else if (year % 400 == 0) {
				monthArray[1] = 29;
			} else {
				monthArray[1] = 29;
			}
		}

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}

		// 2019년 5월 12일의 12일 까지 총일 수
		totalCount += day;
		return totalCount;
	}

	// 달의 끝나는 날짜 구하기
	private int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// monthArray배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면
		// monthArray의 두번째 방의 값을 29로 변경해야 한다.

		boolean isLeafYear = isLeafYear(year);

		if (isLeafYear) {
			monthArray[1] = 29;
		}
		return monthArray[month - 1];
	}

	private boolean isLeafYear(int year) {
		// 4의 배수는 윤년이고, 100의 배수는 윤년이 아니고, 400배수는 윤년이다.
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		return isLeafYear;
	}

	/**
	 * 요일을  출력해주는 메서드 입니다
	 */
	 
	public void print(int year, int month, int day) {
		int totalCount = getCount(year, month, day);
		int dayOfWeek = totalCount % 7;
		String message = null;
		if (dayOfWeek == Calendar1.MONDAY) {
			message = "월요일";
		} else if (dayOfWeek == Calendar1.TUESDAY) {
			message = "화요일";
		} else if (dayOfWeek == Calendar1.WEDNESDAY) {
			message = "수요일";
		} else if (dayOfWeek == Calendar1.THURSDAY) {
			message = "목요일";
		} else if (dayOfWeek == Calendar1.FRIDAY) {
			message = "금요일";
		} else if (dayOfWeek == Calendar1.SATURDAY) {
			message = "토요일";
		} else if (dayOfWeek == Calendar1.SUNDAY) {
			message = "일요일";
		}
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다.");
	}
	/**
	 * 월을  출력해주는 메서드 입니다
	 */
	 

	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");

		// 2020년 5월 1일의 요일을 구해서 일요일 부터 1일 이전 요일까지 빈공백 처리

		int totalCount = getCount(year, month, 1);
		int rest = totalCount % 7;

		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= getLastDay(year, month); i++) {
			System.out.print(i + "\t");
			rest++;
			// 개행
			if (rest % 7 == 0) {
				System.out.println();
			}

		}
		System.out.println();
	}

	public void print(int year) {
		for (int i = 1; i <= 12; i++) {
			print(year, i);
		}
		System.out.println();
	}
}