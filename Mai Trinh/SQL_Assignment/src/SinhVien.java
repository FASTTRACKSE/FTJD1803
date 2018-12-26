import java.util.Scanner;
import java.sql.*;

public class SinhVien {

	String maSV;
	String tenSV;
	String IDlop;


	public SinhVien() {
		super();
	}


	public SinhVien(String maSV, String tenSV, String iDlop) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.IDlop = iDlop;
	}


	public String getMaSV() {
		return maSV;
	}


	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}


	public String getTenSV() {
		return tenSV;
	}


	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}


	public String getIDlop() {
		return IDlop;
	}


	public void setIDlop(String iDlop) {
		this.IDlop = iDlop;
	}

	Scanner sc= new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap ma sinh vien: ");
		this.maSV=sc.nextLine();
		System.out.println("Nhap ten sinh vien: ");
		this.tenSV= sc.nextLine();
		System.out.println("Nhap ID lop: ");
		this.IDlop = sc.nextLine();
	}


	public void xuat() {
		System.out.println("-----DANH SACH SINH VIEN-----");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlihocsinh",  "root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from students");
			while (rs.next())
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			con.close();
		} catch (Exception e ) {
			System.out.println(e);
		}
	}

	public void add() {
		System.out.println("Nhap ma sinh vien can them: ");
		String maSV = sc.nextLine();
		System.out.println("Nhap ten sinh vien can them: ");
		String ten = sc.nextLine();
		System.out.println("Nhap ID lop: ");
		String id = sc.nextLine();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlihocsinh",  "root","");
			Statement stmt = con.createStatement();
			String qr = "insert into students values(\""+ maSV +"\",\""+ ten +"\", \""+ id +"\" )"; 
			stmt.executeUpdate(qr); 			
			con.close();
		} catch (Exception e ) {
			System.out.println(e);
		}

	}

	public void edit() {
		System.out.println("Nhap ma sinh vien can chinh sua: ");
		String masua = sc.nextLine();
		System.out.print("Nhap ten sinh vien cap nhat: ");
		String ten = sc.nextLine();
		System.out.print("Nhap ID lop cap nhat: ");
		String id = sc.nextLine();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlihocsinh",  "root","");
			Statement stmt = con.createStatement();
			String qr = "update students set Hoten_SV =' "+ten+"', ID_Lop='"+id+"' where Ma_SV = '"+masua+"' "; 
			PreparedStatement preparestmt = con.prepareStatement(qr);			
			preparestmt.executeUpdate(); 			
			con.close();
		} catch (Exception e ) {
			System.out.println(e);
		}
	}

	public void delete() {
		System.out.println("Nhap ma sinh vien can xoa: ");
		String maxoa = sc.nextLine();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlihocsinh",  "root","");
			String qr = "delete from students WHERE Ma_SV = ?" ; 
			PreparedStatement preparestmt = con.prepareStatement(qr);
			preparestmt.setString(1, maxoa);
			preparestmt.executeUpdate(); 			
			con.close();
		} catch (Exception e ) {
			System.out.println(e);
		}

	}
	public void menu() {
		int a=0;
		boolean exit = false;
		while(true) {
			System.out.println("");
			System.out.println("1. Xem danh sach sinh vien");
			System.out.println("2. Them moi sinh vien");
			System.out.println("3. Sua thong tin sinh vien");
			System.out.println("4. Xoa sinh vien");
			System.out.println("5. Dang xuat");
			System.out.print("Xin vui long chon phim chuc nang: ");
			a= Integer.parseInt(sc.nextLine());
			switch (a) {

			case 1:						
				xuat();						
				break;

			case 2:
				add();
				break;

			case 3:
				edit();
				break;

			case 4: 
				delete();
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
	}
}
