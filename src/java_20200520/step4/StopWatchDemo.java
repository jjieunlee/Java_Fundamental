package java_20200520.step4;

public class StopWatchDemo {

	public static void run(StopMilliWatch s1) {
		s1.start();
		for (long i = 0; i < 2000_000_000l; i++) {

		}
		s1.stop();

		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간: %.3f", elapsedTime);
		System.out.println();
	}

	public static void run(StopNanoWatch s1) {
		s1.start();
		for (long i = 0; i < 2000_000_000l; i++) {

		}
		s1.stop();

		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간: %.9f", elapsedTime);
	}

	public static void main(String[] args) {

		StopMilliWatch s1 = new StopMilliWatch();
		run(s1);

		StopNanoWatch s2 = new StopNanoWatch();
		run(s2);

	}

}
