
import java.util.Scanner;



public class SinhVien {
	private int id;
	private String name;
	private int age;
	private String address;
	private float gpa;
	private Scanner sc= new Scanner (System.in);
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public void nhap() {
		System.out.println("nhap ID:");
		this.id=Integer.parseInt(sc.nextLine());
		System.out.println("nhap name:");
		this.name=sc.nextLine();
		System.out.println("nhap age:");
		this.age=Integer.parseInt(sc.nextLine());
		System.out.println("nhap address:");
		this.address=sc.nextLine();
		System.out.println("nhap gpa:");
		this.gpa=Integer.parseInt(sc.nextLine());
	}
	public void xuat() {
		System.out.printf("ID:%d \t name:%s \t age:%d \t address:%s \t gpa:%.2f \n", this.id, this.name,
				this.age,this.address,this.gpa);
	}
	public void update(int d) {
			if(this.id==d) {
				System.out.println("nhap name:");
				this.name=sc.nextLine();
				System.out.println("nhap age:");
				this.age=Integer.parseInt(sc.nextLine());
				System.out.println("nhap address:");
				this.address=sc.nextLine();
				System.out.println("nhap gpa:");
				this.gpa=Integer.parseInt(sc.nextLine());
			}
		}
	}
	
	
