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
				int a=0;
				boolean exit = false;
				while(true) {
					System.out.println("1. Xem danh sach sinh vien");
					System.out.println("2. Them moi sinh vien");
					System.out.println("3. Sua thong tin sinh vien");
					System.out.println("4. Xoa sinh vien");
					System.out.println("5. Dang xuat");
					System.out.print("Xin vui long chon phim chuc nang: ");
					a= Integer.parseInt(sc.nextLine());
					switch (a) {

					case 1:						
						sv.xuat();						
						break;

					case 2:


						break;

					case 3:

						String qr = "insert into sv values(\""+ sv.getMaSV() +"\",\""+ sv.getTenSV() +"\", \""+ sv.getIDlop() +"\" )"; 
						stmt.executeUpdate(qr); 
						break;

					case 4: 


						break;

					case 5:
						System.out.println("Dang xuat");
						exit = true;
						break;

					default:
						System.out.println("invalid! please choose action in below menu:");
						break;
					}

					if (exit) {
						break;
					}

				}
			}else {
				System.out.println("Ko phai doi tuong quan ly");

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}


