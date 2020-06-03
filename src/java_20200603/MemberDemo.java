package java_20200603;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = new MemberDao();
		int num = 6;
		String name = "이지은1";
		String addr = "한국1";

		// insert
		/*
		 * int resultCount=mdao.insert(new MemberDto (num,name,addr));
		 * if(resultCount==1) { System.out.println("정상적으로 회원가입 되었습니다"); }else {
		 * System.out.println("오류"); }
		 */

		// update
		/*
		 * int resultCount=mdao.update(new MemberDto(num,name,addr)); if(resultCount==1)
		 * { System.out.println("정상적으로 수정 되었습니다"); }else { System.out.println("오류"); }
		 */
		// delete
		/*
		 * int resultCount=mdao.delete(new MemberDto(num,name,addr)); if(resultCount==1)
		 * { System.out.println("정상적으로 삭제되었습니다."); }else { System.out.println("오류"); }
		 */
		// select

		ArrayList<MemberDto> list = mdao.select();

		for (int i = 0; i < list.size(); i++) {
			MemberDto m = (MemberDto) list.get(i);
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.println(_num + "\t" + _name + "\t" + _addr);
		}
		/*
		 * for(MemberDto m:list) { int _num=m.getNum(); String _name=m.getName(); String
		 * _addr=m.getAddr(); System.out.println(_num+"\t"+_name+"\t"+_addr); }
		 */

		System.out.println("=================================");
		MemberDto mdto = mdao.select(num);
		if(mdto!=null) {
			int _num=mdto.getNum();
			String _name = mdto.getName();
			String _addr = mdto.getAddr();
			System.out.println(_num + "\t" + _name + "\t" + _addr);
		}else {
			System.out.println("회원정보가 없습니다.");
		}
	}
}