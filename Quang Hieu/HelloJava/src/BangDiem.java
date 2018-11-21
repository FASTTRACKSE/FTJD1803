import java.util.Scanner;

public class BangDiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen[] = new String[50];
		String ten;
		int [] diem = new int [50] ;
		int d;
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("nhap ho ten");
			ten = scanner.nextLine();
			if (ten.equals(""))
				break;
			hoTen[i] = ten;
			
			System.out.println("nhap diem");
			d = Integer.parseInt(scanner.nextLine());
			diem[i] = d;
			
			i++;
			
       //sapxep
		}
		for (int j = 0; j < i; j++) {
			System.out.println(hoTen[j] + diem[j]);
		}
		
	}

}
