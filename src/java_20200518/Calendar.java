package java_20200518;

public class Calendar {
	public int year;
	public int month;
	public int day;

	public void set(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public int getCount() {
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
		/*
		 * boolean isLeafYear =year%4==0 && year%100!=0||year%400==0;
		 * if(isLeafYear==true){ monthArray[1]=29; }
		 */

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}

		// 2019년 5월 12일의 12일 까지 총일 수
		totalCount += day;
		return totalCount;

	}

	public void print() {

		int totalCount = getCount();
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
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + " 입니다.");

	}

	public static void main(String[] args) {
		Calendar c = new Calendar();
		c.set(2020, 5, 18);
		c.print();
	}
}
