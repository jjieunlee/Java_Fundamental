package java_20200525;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond=cal.get(Calendar.MILLISECOND);

		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second +"."+millisecond+ "초");
	}
}
