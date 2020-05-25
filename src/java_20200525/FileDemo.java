package java_20200525;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;

public class FileDemo {
	public static void main(String[] args) {
		/*    File 클래스
		 * 1. 디렉토리 생성(*)
		 * 2. 파일 크기(*), 파일 이름, 파일 경로 , 날짜
		 * 3. 파일 생성, 삭제(*)
		 * 4. 파일 이름 바꾸기(*)
		 */
		
		// 파일 디렉토리 생성
		File f1 = new File("C:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if (success) {
			System.out.println("디렉토리를 생성했습니다.");
		} else {
			System.out.println("이미 디렉토리가 있습니다.");
		}

		// 파일크기 구하기(바이트로 반환->킬로바이트)
		File f2 = new File("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		long fileSize = f2.length() / 1024;
		System.out.println(fileSize + "KB");

		// 파일이름 구하기
		String fileName = f2.getName();
		System.out.println(fileName);

		// 파일의 전체 경로 구하기
		String filePath = f2.getPath();
		System.out.println(filePath);

		// 파일 유형 구하기
		if (fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");
		} else if (fileName.endsWith("pdf")) {
			System.out.println("pdf 파일");
		} else if (fileName.endsWith("zip")) {
			System.out.println("압축 파일");
		}

		// 1970년 1월 1일 부터 마지막 수정한 날짜 까지의 시간을 밀리세컨드로 반환
		long fileTime = f2.lastModified();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss E요일");
		System.out.println("마지막 수정 날짜 : " + sdf.format(fileTime));

		/*
		 * Calendar cal = Calendar.getInstance(); 
		 * cal.setTimeInMillis(fileTime); 
		 * int year = cal.get(Calendar.YEAR); 
		 * int month = cal.get(Calendar.MONTH) + 1; 
		 * int day = cal.get(Calendar.DATE);
		 * 
		 * int hour = cal.get(Calendar.HOUR); 
		 * int minute = cal.get(Calendar.MINUTE); 
		 * int second = cal.get(Calendar.SECOND); 
		 * int millisecond=cal.get(Calendar.MILLISECOND);
		 * 
		 * System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " +
		 * minute + "분 " + second + "초");
		 */

		// 파일 생성
		File f3 = new File("C:\\dev\\Hello.java");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 파일 삭제
		//f3.delete();
		
		//파일 이름 변경(f3이름을 f4의 이름인 HelloWorld로 이름을 바꿈)
		File f4 = new File("C:\\dev\\HelloWorld.java");
		f3.renameTo(f4);

	}
}