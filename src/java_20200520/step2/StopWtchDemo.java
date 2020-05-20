package java_20200520.step2;

public class StopWtchDemo {
	public static void main(String[] args) {
		StopWatch s1 = new StopWatch();
		s1.start();
		for (long i = 0; i < 2000_000_000l; i++) {

		}
		s1.stop();

		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간: %.9", elapsedTime);
		
	}

}
