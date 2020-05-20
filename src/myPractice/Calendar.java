package myPractice;

public class Calendar {
	private int year;
	private int month;
	private int day;

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDay() {
		return day;
	}

	public void set(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private int getCount() {
		int totalCount=0;
		int preYear=year-1;
		totalCount+=preYear*365+(preYear/4-preYear/100+preYear/400);
		
		int []monthArray= {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean isLeafYear=year%4==0&&year%100==0||year%400==0;
		if(isLeafYear) {
			monthArray[1]=29;
		}
		for(int i=0;i<month-1;i++) {
			totalCount+=monthArray[i];
		}
		totalCount+=day;
		return totalCount;
	}
	public void print() {
		int totalCount=getCount();
		int rest=totalCount%7;
		String message=null;
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
