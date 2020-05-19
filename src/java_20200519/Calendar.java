package java_20200519;

/*
 * 2020년 5월 25일은 월요일입니다.
일	월	화	수	목	금	토	
					1	2	
3	4	5	6	7	8	9	
10	11	12	13	14	15	16	
17	18	19	20	21	22	23	
24	25	26	27	28	29	30	
31	
 */
public class Calendar {
	private int year;
	private int month;
	private int day;

	public Calendar(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private int getCount(int year, int month, int day) {
		int totalCount = 0;

		int preYear = year - 1;
		// 2019년 총일 수
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);
		// 2019년 1월 ~ 4월까지 총일 수
		// totalCount += 31 + 29 + 31 + 30;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

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

	public void printCalendar(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");

		// 2020년 5월 1일의 요일을 구해서 일요일 부터 1일 이전 요일까지 빈공백 처리

		int totalCount = getCount(year, month, 1);
		int rest = totalCount % 7;

		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= getLastDay(year,month); i++) {
			System.out.print(i + "\t");
			rest++;
			// 개행
			if (rest % 7 == 0) {
				System.out.println();
			}

		}
		System.out.println();
	}
	public void printCalendar(int year) {
		for(int i=1;i<=12;i++) {
			printCalendar(year, i);
		}
		System.out.println();
	}

	// 달의 끝나는 날짜 구하기
	private int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				monthArray[1] = 28;
			} else if (year % 400 == 0) {
				monthArray[1] = 29;
			} else {
				monthArray[1] = 29;
			}
		}
		return monthArray[month-1];
	}

	public void print() {
		int totalCount = getCount(year, month, day);
		int rest = totalCount % 7;
		String message = null;
		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else if (rest == 0) {
			message = "일요일";
		}
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다.");
	}
}
