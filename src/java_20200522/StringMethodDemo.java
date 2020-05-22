package java_20200522;

public class StringMethodDemo {
	public static void main(String[] args) {
		String ssn = "123456-0000000";

		// chatAt(int index) : 문자열중에서 특정 index에 있는 문자를 반환
		char c = ssn.charAt(6);
		System.out.println(c);

		// concat(Strong msg): 문지열 연결
		ssn = ssn.concat("Abc");
		System.out.println(ssn);

		// endsWith(String msg): msg문자열로 끝나면 true, or false
		String fileName = "abcd.doc";
		if (fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다");
		} else if (fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		} else {
			System.out.println("파일입니다");
		}

		// startsWith(String msg) : msg 문자열로 시작하면 true, or false
		String url = "http://www.naver.com";
		String path = "/news/sss.do?id=123";
		if (path.startsWith("/news")) {
			System.out.println("뉴스페이지 입니다.");
		} else if (path.startsWith("/sports")) {
			System.out.println("스포츠 페이지입니다.");
		} else {
			System.out.println("페이지가 존재하지 않습니다.");
		}

		// equalsIgnoreCase(String msg) : 대소문자를 구분하지 않고 문자열을 비교하여 같으면 true, or false
		boolean success = fileName.equalsIgnoreCase("abcd.doc");
		System.out.println(success);

		// indexOf(String msg): msg문자열의 위치를 반환
		int index = ssn.indexOf("-");
		System.out.println(index);

		// lastIndexOf(String msg): msg문자열의 위치를 마지막에서 시작하여 찾고, index는 처음부터 msg문자열까지
		// index를 반환
		fileName = "abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));

		// 배열의 길이 : length, 문자열의 길이 : length()
		// trim() : 앞뒤 문자열 공백 제거
		String dbId = "jk04115".trim();
		String userId = "jk04115 ".trim();
		int[] arrayA = { 1, 2, 3, 4, 5 };
		System.out.println(dbId.length());
		System.out.println(arrayA.length);

		// substring(int first, int last)->first(포함) 부터 second(포함하지 않음) 사이의 문자열을 추출
		// substring(int first) -> first(포함) 보다 큰 모든 문자열을 추출
		fileName = "abc.doc";
		String first = fileName.substring(0, 3);
		first = fileName.substring(0, fileName.indexOf(".")); // fileName.indexOf(".") = 3
		String last = fileName.substring(4);
		last = fileName.substring(fileName.indexOf(".") + 1); // fileName.indexOf(".")+1 = 4
		System.out.println(first);
		System.out.println(last);

		fileName = "abc.abc.abc.doc";
		first = fileName.substring(0, fileName.lastIndexOf("."));
		last = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println(first);
		System.out.println(last);

		// replaceAll(String regex, String replace) regex를 replace로 모두 바꿈
		String html = "안녕하세요\n저는 이지은입니다.\n잘부탁드립니다.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);

		// toUpperCase():대문자로 변환
		String m1 = "hello";
		m1 = m1.toUpperCase();
		System.out.println(m1);

		// toLowerCase(): 소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1);

		// String.valueOf(~) : primitive data type을 문자열로 변환
		char[] c1 = { 'a', 'b', 'c' };
		String msg = String.valueOf(1); // 1+""
		msg = String.copyValueOf(c1);
		System.out.println(c1);

		// String[] split : 문자열을 split(~)안에 있는것을 기준으로 나누고 배열에 저장
		String[] str = ssn.split("-");
		String ssn1 = str[0];
		String ssn2 = str[1];
		System.out.println(ssn1);
		System.out.println(ssn2);

		// String format(String format, Object... args) : printf와 비슷. object값을 string형으로 변환
		String str2 = String.format("%,.2f", 57855123.4567);
		System.out.println(str2);

		// argument index -> $로 표현하며 틀어오는 수의 순서지정
		// flag -> , 타은 것을 넣어 자릿수 알수 있도록함
		// width -> 자릿수
		// .percision -> 소수점 몇자리 까지 구할것인지 지정
		str2 = String.format("%3$,20.2f\n %2$,20.2f\n %1$,20.2f\n", 123.45, 1345.14656, 3424.569);
		//            3,424.57             1,345.15               123.45
		System.out.println(str2);

	}
}
