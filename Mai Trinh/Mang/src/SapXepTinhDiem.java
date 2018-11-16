import java.util.Scanner;
public class SapXepTinhDiem {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen[] = new String[10];
		int[] bangDiem = new int[10];

		String ten;
		int diem;
		Scanner sc = new Scanner(System.in);
		int i =0;

		int diem1 =0;
		diem = diem1;

		while(true) {
			System.out.print("Nhap ho ten: ");
			ten= sc.nextLine();
			if (ten.equals("")) break;
			hoTen[i] = ten;

			System.out.print("Nhap diem: ");
			bangDiem[i]= Integer.parseInt(sc.nextLine());
			while (bangDiem[i]<0 || bangDiem[i]>10) {
				
				System.out.print("Vui long nhap lai: ");
				
				bangDiem[i]= Integer.parseInt(sc.nextLine());
			}
				//bangDiem[i]= diem;

			i++;
		}

		int min;
		String tam;
		int j;
		for ( j=0; j<i; j++) {
			for( int k=j; k<i; k++){
				if(bangDiem[j]>bangDiem[k]) {
					min = bangDiem[j];  
					bangDiem[j]=bangDiem[k];
					bangDiem[k]=min;

					tam = hoTen[j];
					hoTen[j]= hoTen[k];
					hoTen[k]=tam;

				}

			}
		}
		System.out.println("Danh sach hoc sinh la: ");
		for (j=0; j<i;j++ ) {

			System.out.print(hoTen[j] + " " + bangDiem[j]);
			if (bangDiem[j] <5) {
				System.out.println("  Hoc sinh yeu");
			}
			else if (bangDiem[j] >=5 && bangDiem[j] < 6.5 ) {
				System.out.println(" Hoc sinh trung binh");
			}
			else if (bangDiem[j] >= 6.5 && bangDiem[j] < 7.5) {
				System.out.println(" Hoc sinh kha");
			}
			else if (bangDiem[j] >=7.5 && bangDiem[j] < 9 ) {
				System.out.println(" Hoc sinh gioi");
			}
			else if (bangDiem[j] >= 9) {
				System.out.println(" Hoc sinh xuat sac");
			}


			System.out.println();

		}


	}
}



