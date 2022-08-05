package Model;
import java.sql.*;
public class DBConnection {

	private Connection con;
	private Statement stmt;

	public DBConnection() {
		try {
			String url = "jdbc:mysql://localhost:1521/sign_up?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "root";
			String passwd = "0000";

			con = DriverManager.getConnection(url, user, passwd);
			System.out.println("DB연결 성공");

			stmt = con.createStatement();
			System.out.println("Statement객체 생성 성공");

			//stmt.close();
			//con.close();

		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			System.out.print("사유 : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		new DBConnection();
	}

}