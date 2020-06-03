package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		// 1. 드라이브 로드
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

		try {
			// 2. 데이터베이스와 연결
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			System.out.println("db연결 성공");

			// 3. sql문을 전송할수 있는 preparedStatement 객체를 생성
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM member ");
			sql.append("WHERE num=?");

			pstmt = con.prepareStatement(sql.toString());

			// 4. 바인딩 변수를 설정
			pstmt.setInt(1, 8);

			// 5. SQL문을 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("삭제된 행의 수:" + resultCount);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 6. 모든 자원을 반납
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
