import java.util.Scanner;

public class User {
	String username;
	String password;
	String chucnang;
	
	
	public User() {
		super();
	}


	public User (String username, String password, String chucnang) {
		super();
		this.username = username;
		this.password = password;
		this.chucnang = chucnang;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getChucnang() {
		return chucnang;
	}


	public void setChucnang(String chucnang) {
		this.chucnang = chucnang;
	}
	
	Scanner sc= new Scanner(System.in);
	public void nhap() {
		System.out.println("Vui long nhap ten tai khoan: ");
		this.username=sc.nextLine();
		System.out.println("Vui long nhap password: ");
		this.password= sc.nextLine();
//		System.out.println("Nhap chuc vu: ");
//		this.chucnang = sc.nextLine();
	}
	
	
}
