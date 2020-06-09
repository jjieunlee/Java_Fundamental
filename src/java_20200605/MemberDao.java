package java_20200605;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDao {

	private MemberDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// insert
	public int insert(MemberDto m) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member2(empno, ename, job, mgr, hiredate, sal, comm, deptno) ");
			sql.append("VALUES(?,?,?,?,CURDATE(), ?,?, ?)");
			pstmt = con.prepareStatement(sql.toString());
			resultCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultCount;
	}

	// update
	public int update(MemberDao m) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member2 SET ename=?, job=?,mgr=?, ");
			sql.append("hiredate=CURDATE(),sal=?,comm=?,deptno=? ");
			sql.append("WHERE ename =?");
			pstmt = con.prepareStatement(sql.toString());
			resultCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultCount;
	}
}
