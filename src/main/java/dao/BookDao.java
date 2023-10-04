package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

public class BookDao {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private HttpServletRequest request;
	
	public BookDao() {}
	public BookDao(HttpServletRequest request) {
		this.request = request;
		
		System.out.println("BookDao 호출...");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//106.243.194.229:3200/xe", "shoh", "1234");
			System.out.println("DB 연결 성공");
			
		} catch (Exception e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
	}

}
