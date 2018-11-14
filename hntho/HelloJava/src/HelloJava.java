import java.util.Scanner;

public class HelloJava {
	public static void main(String args[]) {
		
		String hoTen[] = new String[50];
		int diem[] = new int[50];
		
		String ten;
		int d;
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.print("Nhap ho ten: ");
			ten = scanner.nextLine();
			if (ten.equals("")) break;
			hoTen[i] = ten;
			
			System.out.print("Nhap diem: ");
			d = Integer.parseInt(scanner.nextLine());
			diem[i] = d;
			
			i++;
		}
		
		//sap xep
		
		for (int j = 0; j < i; j++) {
			System.out.println(hoTen[j] + diem[j]);
			
			
		}
		
		
		 
		
	}
}
