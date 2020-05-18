package java_20200512;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력 만들기 
		 * 1. 1년 1월 1일 월요일 
		 * 2. 1년은 365일이고, 윤년일때는 366(2월 29일) 
		 * 3. 윤년은 4년마다 발생하고, 그중에 100의 배수는 제외하고, 400배수는 제외하지 않는다. 
		 * 4. 2020년 5월 12일은 무슨 요일 일까? 
		 * 5. 2019년까지 총일수 + 4월까지 총일수 + 12일 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일..
		 */
		int year = 2020;
		int month = 5;
		int day = 12;
		int a = (year - 1) / 4; // 2019년까지의 4의 배수 년도 수
		int b = (year - 1) / 100; // 2019년까지의 100의 배수 년도 수
		int c = (year - 1) / 400; // 2019년까지의 400의 배수 년도 수

		int zyear = a - b + c; // 윤년수

		int totalDay = 2019 * 365 + zyear; // 2019년도까지의 총 일수

		// 2020년도가 윤년
		int thisDay = 29 + 30 + 2 * 31 + day;
		int finalDay = thisDay + totalDay;

		System.out.print(year + "년 " + month + "월 " + day + "일 ");
		switch (finalDay % 7) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
		default:
			System.out.println("잘못된 계산입니다");
			break;
		}
	}
}
