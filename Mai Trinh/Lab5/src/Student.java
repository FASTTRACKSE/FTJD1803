import java.util.Scanner;

public class Student {
	String hoTen;

	float diemJava;
		
	public Student() {
		super();
	}

	public Student(String hoTen, float diemJava) {
		super();
		this.hoTen = hoTen;
		this.diemJava = diemJava;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemJava() {
		return diemJava;
	}

	public void setDiemJava(float diemJava) {
		this.diemJava = diemJava;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten sinh vien: ");
		this.setHoTen(sc.nextLine());
		
		System.out.println("Nhap diem Java: ");
		this.setDiemJava(Integer.parseInt(sc.nextLine()));
		
	}
}
