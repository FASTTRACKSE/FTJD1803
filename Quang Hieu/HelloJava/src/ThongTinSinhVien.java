import java.util.Scanner;

public class ThongTinSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen[] = new String[50];
		String ten;

		int i = 0;
		int count = 0;
		int[] IDD = new int [50];
		int ID;
		int j = 0;

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("nhap ho ten");
			ten = scanner.nextLine();
			if (ten.equals(""))
				break;
			hoTen[i] = ten;
			IDD[i] = ID; 
			i++;
			count++;

		}
		for (j = 0; j < count; j++) {
			System.out.println(hoTen[j]);
			System.out.println(count);

		}
		System.out.println("nhap ID can xoa");
		ID = Integer.parseInt(scanner.nextLine());
		if ( (int)ID.equals("")) {
			System.out.println("khong thuc hien lenh xoa ID");
		}
		else {
			count--;
			for (int j = i; j < count - 1; j++) {
				hoTen[j] = hoTen[j + 1];
			}
		}

	}

	}

	public ThongTinSinhVien() {
		super();

		// TODO Auto-generated constructor stub
	}

}
