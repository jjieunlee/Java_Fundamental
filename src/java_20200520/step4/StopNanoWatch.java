package java_20200520.step4;

public class StopNanoWatch {

	// 나노세컨드를 관리하기 위한 변수
	long startTime;
	long endTime;
	
	// 나노세컨드의 경과시간
	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000_000_000;
	}
	
	// 나노시작시간
	public void start() {
		startTime = System.nanoTime();
	}
	
	// 나노종료시간
	public void stop() {
		endTime = System.nanoTime();
	}
}
