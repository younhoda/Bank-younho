package money;

import java.sql.*;

public class BankDAO {

	public void insert(BankDTO dto) {

		// 고객 정보 데이터 삽입
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bank";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "insert into manager values(?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3.SQL문 결정 성공.....");

			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setString(4, dto.getTel());

			ps.executeUpdate();
			System.out.println("4. SQL문 실행 요청.....");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 고객 정보 수정
	public void update(String id,String tel) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bank";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "update manager set tel=?where id=?";
			

			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3.SQL문 결정 성공.....");

			ps.setString(1,id);
			ps.setString(2,tel);
			

			ps.executeUpdate();
			System.out.println("4. SQL문 실행 요청.....");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	// 고객 정보 삭제
	public void delete(String id) {
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bank";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "delete from manager where id=?";
			

			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3.SQL문 결정 성공.....");

			ps.setString(1,id);
			

			ps.executeUpdate();
			System.out.println("4. SQL문 실행 요청.....");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

		

	// 고객 전체 정보리스트
	public void selectAll(BankDTO dto) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bank";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "select *from manger";

			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3.SQL문 결정 성공.....");

			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setString(4, dto.getTel());

			ps.executeUpdate();
			System.out.println("4. SQL문 실행 요청.....");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}