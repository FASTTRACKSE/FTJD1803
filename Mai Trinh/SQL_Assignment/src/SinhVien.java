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
	
}
