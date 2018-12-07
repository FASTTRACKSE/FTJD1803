import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
	
	private int id;
	private String name;
	private int age;
	private float gpa;
	private String address;

	public Student() {
		super();
	}

	public Student(int id, String name, int age, float gpa, String addess) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		this.address = address;
	}

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

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String addess) {
		this.address = addess;
	}

	


	public void input() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap ten sinh vien: ");
		this.name = sc.nextLine();

		System.out.println("Nhap id sinh vien: ");
		this.id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap tuoi sinh vien: ");
		this.age = Integer.parseInt(sc.nextLine());

		System.out.println("Nhap dia chi sinh vien: ");
		this.address = sc.nextLine();

		System.out.println("Nhap diem sinh vien: ");
		this.gpa = Integer.parseInt(sc.nextLine());


	}

	public void output() {
		System.out.print("ID: "+this.id);
		System.out.print("	   Ten: "+this.name);		
		System.out.printf("	 Tuoi: "+this.age);
		System.out.print("	Dia chi: "+this.address);
		System.out.println("	Diem: "+this.gpa);
	}

}

