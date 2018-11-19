import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sv[]= new Student [50];
		Scanner sc=  new Scanner(System.in);

		Student s = new Student();
		//		System.out.println("Ban muon nhap thong tin bao nhieu sinh vien: ");
		//		
		//		
		//		for (i =0;i<nhap; i++) {
		//			sv[i]=s;
		//			s.input();
		//
		//		}
		int i;
		int nhap=0;
		boolean exit = false;

		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1. Them sinh vien");
			System.out.println("2. Cap nhat thong tin sinh vien theo id");
			System.out.println("3. Xoa sinh vien theo id");
			System.out.println("4. Sap xep sinh vien theo ten");
			System.out.println("5. Hien thi danh sach sinh vien");
			System.out.println("0. Ket thuc chuong trinh");
			System.out.println("-----------------------------");


			/*Nhap thong tin sinh vien 
			Student sv0= new Student();
			for (int i=0; i<sv.length;i++) {

				sv0.nhapTen();

				if (sv0.getName().equals("")) {
					break;
				}else 
					{sv0.input();
					count++;}

				sv[i] = sv0; // cho thong tin sinh vien vao mang

			}
			 */	
			System.out.print("Chon: ");
			int choose = Integer.parseInt(sc.nextLine());	

			switch (choose) {

			case 1:
				System.out.println();
				Student sv1= new Student();
				System.out.println("----------Nhap thong tin sinh vien moi----------");
				sv1.input();
				sv[nhap]=sv1;
				nhap++;  // phai cho vao mang r moi tang bien dem
				break;

			case 2: 
				System.out.println();
				System.out.println("---Cap nhat thong tin sinh vien theo id---");				
				System.out.print("Moi ban nhap id sinh vien: ");				
				int sv2=Integer.parseInt(sc.nextLine());
				for ( i=0; i<nhap; i++) {
					if (sv2 == sv[i].getId()) {
						sv[i].output();
						break;
					}
				}
				break;

			case 3: 
				System.out.println();
				System.out.println("---------Xoa sinh vien theo id---------");
				System.out.println("Nhap id cua sinh vien: ");
				int sv3;
				sv3 = Integer.parseInt(sc.nextLine());

				for ( i=0; i<nhap ; i++) {
					if (sv3 == sv[i].getId()) {
						Student temp = sv[i];
						sv[i] = sv[i+1];
						sv[i+1]=temp;
						
					}
				}
				System.out.println("***Moi chon 5 de xem lai danh sach");
				System.out.println();
				break;

			case 4:
				System.out.println();
				System.out.println("---Sap xep sinh vien theo danh sach---");
				System.out.println();
				for ( i=0; i<nhap; i++) {
					for (int j=i; j<nhap ; j++) {
						if (sv[j].getName().compareTo(sv[i].getName())<0){
							Student temp = sv[i];
							sv[i] = sv[j];
							sv[j] = temp;
							//sv[j].setName(sv[i].getName());

						}

					}
				}
				System.out.println("***Moi chon 5 de xem lai danh sach cap nhat");
				System.out.println();
				break;

			case 5:
				System.out.println();
				System.out.println("---------------------Danh sach sinh vien---------------------");
				for (i=0; i<nhap; i++){
					sv[i].output();
				}
				
				System.out.println();
				break;

			case 0:
				System.out.println("thoat!");
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
