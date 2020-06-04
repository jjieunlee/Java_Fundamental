package java_20200604;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();

		int no = 8010;
		String name = "LEE1";
		String job = "ANALYST";
		int mgr = 7788;
		int sal = 2200;
		int comm = 0;
		int deptNo = 30;

		// insert
		int resultCount = dao.insert(new EmpDto(no, name, job, mgr, null, sal, comm, deptNo));
		if (resultCount == 1) {
			System.out.println("사원이 정상적으로 추가되었습니다");
		} else {
			System.out.println("오류");
		}

		// update
		no = 8010;
		name = "LEE11";
		job = "salesman";
		mgr = 7844;
		sal = 2222;
		comm = 10;
		deptNo = 10;
		resultCount = dao.update(new EmpDto(no, name, job, mgr, null, sal, comm, deptNo));
		if (resultCount == 1) {
			System.out.println("사원이 정상적으로 수정되었습니다");
		} else {
			System.out.println("오류");
		}

		// delete
		resultCount = dao.delete(8010);
		if (resultCount == 1) {
			System.out.println("사원이 정상적으로 삭제되었습니다");
		} else {
			System.out.println("오류");
		}

		// select
		int start = 0;
		int len = 10;
		ArrayList<EmpDto> list = dao.select(start, len);
		for (EmpDto dto : list) {
			System.out.println(dto.getNo() + "\t" + dto.getName() + "\t" + dto.getJob() + "\t" + dto.getHireDate()
					+ "\t" + dto.getMgr() + "\t" + dto.getSal() + "\t" + dto.getComm() + "\t" + dto.getDeptNo());
		}
	}
}
