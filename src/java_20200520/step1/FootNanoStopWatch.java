package java_20200520.step1;

//나노 세컨드로 경과시간을 알려주는 것
public class FootNanoStopWatch {
	long startTime;
	long endTime;

	long startNanoTime;
	long endNanoTime;

	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000;
	}

	public double getElapsedNano() {
		return (double) (endNanoTime - startNanoTime) / 1000;
	}

	public static void main(String[] args) {
		FootNanoStopWatch f1 = new FootNanoStopWatch();
		f1.startNanoTime = System.nanoTime();
		for (int i = 0; i < 20000_000_000l; i++) {

		}
		f1.endNanoTime = System.nanoTime();

		double elapsedTime = f1.getElapsedNano();
		System.out.printf("경과시간: %.9f", elapsedTime);
	}
}
