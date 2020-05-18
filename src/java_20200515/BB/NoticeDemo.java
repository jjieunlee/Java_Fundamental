package java_20200515.BB;

//서로다른 패키지에 있는것 사용할수 있도록 import
import java_20200515.AA.Notice;

public class NoticeDemo extends Notice {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		// public 접근 지정자는 접근 가능
		n1.number = 2;
		// protected는 서로 다른 패키지 일 경우에는 접근 불가
		// 단, 상속 받은 경우에는 접근 가능
		// n1.title="제목";

		// default는 같은 패키지 내에서만 접근가능
		// n1.hit=100;

		// private는 같은 클래스 내에서만 접근가능
		// n1.regdate ="2020-05-15";

		//부모 클래서인 Notice에서 접근할 수 있는 접근 한정자는 public, protected
		NoticeDemo n2 = new NoticeDemo();
		n2.number = 3;
		n2.title = "제목";
		//n2.hit=100;
		//n2.regdate="2020-5-15";

	}
}
