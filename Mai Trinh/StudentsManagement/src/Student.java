import java.util.Scanner;

public class Student {
	
	String hoTen;
	int diemJava;
	int diemHTML;
	float diemTB;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten sinh vien: ");
		this.hoTen= sc.nextLine();
		
		System.out.print("Nhap diem Java: ");
		this.diemJava = Integer.parseInt(sc.nextLine());
				
		System.out.print("Nhap diem HTML: ");
		this.diemHTML = Integer.parseInt(sc.nextLine());
		
		this.diemTB= (this.diemJava+this.diemHTML)/2;;
	}
	
	
	
	public void output() {
		System.out.println(this.hoTen+"---"+this.diemJava+"---"+this.diemHTML+"---"+this.diemTB);
	}
					
}
