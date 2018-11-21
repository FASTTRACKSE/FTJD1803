import java.util.Scanner;

public class menu1 {

	public void show() {
		SinhVien[] cn = new SinhVien[5];
		System.out.println("1. them sinh vien\n" + "2. cap nhat thong tin\r\n" + "3. xoa sinh vien\r\n"
				+ "4. sap xep\r\n" + "5. Hien thi.\r\n" + "0. Exit");
		int n = 0;
		int b, a = 1;
		Scanner sc = new Scanner(System.in);
		

		while (a != 0) {
			System.out.println("moi nhap lua chon");
			b = sc.nextInt();
			switch (b) {
			case 0: {
				System.out.println("ket thuc");
				a=0;
				break;
			}
			case 1: {
				System.out.println("so sinh vien can nhap");
				n = sc.nextInt();
				System.out.println("them sinh vien");
				for (int i = 0; i < n; i++) {
					cn[i] = new SinhVien();
					cn[i].nhap();
				}
				break;
			}
			case 2: {
				System.out.println("cap nhat thong tin");
				{
					int c;
					System.out.println("moi nhap id can Update");
					c = sc.nextInt();
					for (int i = 0; i < n; i++) {
						cn[i].update(c);
					}
				}
				break;
			}
			case 3: {
				int c, i, k;
				System.out.println("vi tri can xoa la:");
				c = sc.nextInt();
				for (k = i = 0; i < n; i++) {
					if (cn[i].getId() != c) {
						cn[k] = cn[i];
						k++;
					}
				}
				n = k;
				break;
			}

			case 4: {
				System.out.println("sap xep theo ten");
				for (int i = 0; i < n; i++) {
					for (int j = i + 1; j < n; j++) {
						if (cn[i].getName().compareTo(cn[j].getName()) > 0) {
							SinhVien s = cn[i];
							cn[i] = cn[j];
							cn[j] = s;
						}
					}
				}
				break;
			}
			case 5: {
				System.out.println("hien thi");
				for (int i = 0; i < n; i++) {
					cn[i].xuat();
				}
				break;
			}
//			default:System.out.println("ket thuc!");break;
			}
		}
	}
}
