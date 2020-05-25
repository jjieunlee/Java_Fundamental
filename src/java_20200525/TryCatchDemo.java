package java_20200525;

public class TryCatchDemo {
	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;

		return avg;
	}

	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);

			double average = getAvg(korean, english);
			System.out.printf("평균 : %.2f\n", average);

		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println("예외 메세지 : "+e.getMessage());
			// System.err.println("2개를 입력하세요");
			// 일반 출력: System.out 에러 출력: System.err
			// 에러가 발생한 위치 출력
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("예외 메시지 : " + e.getMessage());
			System.err.println("숫자를 입력하세요");
			e.printStackTrace();
		} finally {
			// 에러가 발생해도 무조건 실행
			System.out.println("finally");
		}
		
		//catch 블럭이 여러개 있을 경우 위에서 부터 하위 클래스 => 상위 클래스 순으로 정함.
		//(맨마지막이 최상위 클래스 Exception e)
	}
}