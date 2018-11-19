import java.util.Scanner;

public class Main {

	/* 1. Nhap danh sach sinh vien
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student [] students = new Student[3];
		//Student [] diem = new Student[3];

		int a=0;
		while(a==0) {
			System.out.println("-----------------------------");
			System.out.println("1. Nhap danh sach sinh vien");
			System.out.println("2. Hien thi sinh vien gioi");
			System.out.println("3. Tim sinh vien diem cao nhat lop");
			System.out.println("4. Hien thi danh sach sinh vien");
			System.out.println("5. Thoat!");
			System.out.println("-----------------------------");
			Scanner sc=  new Scanner(System.in);
			System.out.println("Nhap n: ");
			int n = Integer.parseInt(sc.nextLine());
			Student k= new Student();
			switch (n) {
			case 1:
				for (int i =0; i<3; i++) {
					Student sv = new Student();					
					
					sv.input();
					students[i]= sv;
				}
				break;

			case 2: 
				
				
				System.out.println("Danh sach sinh vien gioi la: ");
				for (int i=0; i<3; i++) {
					if (students[i].diemTB>=8 && students[i].diemTB<=10) {						
						System.out.println(students[i].hoTen);
					}
				}
				
				break;

			case 3: 
				System.out.println("Sinh vien diem cao nhat lop la: ");

				float max= students[0].diemTB;	
				String tam = students[0].hoTen;
				int i; int j;
				for (i =0; i<3; i++) {
					if (students[i].diemTB>max) {						
						max= students[i].diemTB;
						tam = students[i].hoTen;
					}
					
				}
				System.out.println(tam);	
				break;

			case 4:
				for (Student s: students){
					s.output();
				}
				break;
				/*for (int i =0; i<3; i++) {
				sv.output();
				}
				*/	

			case 5:
				a=1;
				System.out.println("Thoat");
				break;

			}
		}
	}
}
