package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 적재 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 적재 실패");
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		// SQL문의 결과 집합을 관리하는 인터페이스
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			System.out.println("db연결 성공");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			sql.append("ORDER BY num desc");

			pstmt = con.prepareStatement(sql.toString());
			// select문을 사용할 경우에는 executQuery() 사용해야 한다.
			// insert, update, delete문을 사용하는 경우 executUpdate()
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				int index = 0;
				int num = rs.getInt(++index);
				String name = rs.getString(++index);
				String addr = rs.getString(++index);
				System.out.println(num + "\t" + name + "\t" + addr);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("db연결 실패");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}