package myPractice;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao=new MemberDao();
		int num=12;
		String name="이나연";
		String addr="미국";
		/*
		// insert
		int resultCount=mdao.insert(new MemberDto(num,name,addr));
		if(resultCount==1) {
			System.out.println("정상적으로 회원가입완료 ");
		}else {
			System.out.println("오류");
		}*/
		
		/*
		//update
		int resultCount=mdao.update(new MemberDto(num,name,addr));
		if(resultCount==1) {
			System.out.println("정상적으로 업데이트 완료");
		}else {
			System.out.println("오류");
		}
		*/
		
	}
}
