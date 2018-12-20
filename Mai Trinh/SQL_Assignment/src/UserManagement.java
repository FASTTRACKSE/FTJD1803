import java.sql.*;
import java.util.Scanner;

public class UserManagement {

	static String login(String username, String password, ResultSet rs) {
		try {
			while(rs.next()) {
				if (username.equals(rs.getString(1)) && password.equals(rs.getString(2))){
					return rs.getString(3);
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		User user = new User();

		SinhVien sv = new SinhVien();
		user.nhap();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlihocsinh","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from users");
			String chucnang = login(user.getUsername(), user.getPassword(), rs);

			if (chucnang.equals("Giang vien")) {
				System.out.println( "Xin chao giang vien: "+user.getUsername());
				sv.xuat();

			} else if (chucnang.equals("Can bo")) {
				System.out.println( "Xin chao can bo: "+user.getUsername());
				System.out.println("-----QUAN LI SINH VIEN-----");
				sv.menu();
			} else {
				System.out.println("Khong phai doi tuong quan ly");

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}



