package java_20200520.step5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StopWatchDemo {

	public static void run(StopWatch s1) {
		s1.execute();
	}

	public static void main(String[] args) throws Exception {
//		// StopNanoWatch s1=new StopNanoWatch();
//		StopMilliWatch s1 = new StopMilliWatch();
//		run(s1);
		
		//Java I0
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\dev\\eclipse-workspace\\Java_Fundamental\\src\\java_20200520\\step5\\class.txt"));
		String readLine = br.readLine();
		
		//Java Reflaction 
		Class clazz=Class.forName(readLine);
		StopWatch s=(StopWatch)clazz.newInstance();
		run(s);
	}
}
