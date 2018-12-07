import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
	
	public static Scanner scanner = new Scanner(System.in);

	private List<Sach> listSach;
	private SachDao sachDao;
	
	public QuanLySach() {
		sachDao = new SachDao();
		listSach = sachDao.read();
	}
	
	private String nhapTenSach() {
		System.out.println("Nhap ten sach :");
		return scanner.nextLine();
	}
	
	private String nhapTenTacGia() {
		System.out.println("Nhap tac gia :");
		return scanner.nextLine();
	}
	
	private int nhapNamXuatBan() {
		System.out.println("Nhap nam xuat ban");
		return Integer.parseInt(scanner.nextLine());
	}
	
	private String nhapNhaXuatBan() {
		System.out.println("Nhap nha xuat ban :");
		return scanner.nextLine();
	}
	
	private String nhapDanhMuc() {
		System.out.println("Nhap danh muc :");
		return scanner.nextLine();
	}
	
	private double nhapDonGia() {
		System.out.println("Nhap don gia :");
		return Double.parseDouble(scanner.nextLine());
	}
	
	private float tongDoanhThu() {
		return 0;
		
	}
	
	public List<Sach> getListSach() {
		return listSach;
	}

	public void setListSach(List<Sach> listSach) {
		this.listSach = listSach;
	}
	
	public void nhap() throws IOException {
		
		String tenSach = nhapTenSach();
		String tacGia = nhapTenTacGia();
		int namXuatBan = nhapNamXuatBan();
		String nhaXuatBan = nhapNhaXuatBan();
		String danhMuc = nhapDanhMuc();
		double donGia = nhapDonGia();
		float tongDoanhThu = 0;
		
		Sach sach = new Sach(tenSach, tacGia, namXuatBan, nhaXuatBan, danhMuc, donGia, tongDoanhThu);
		listSach.add(sach);
		sachDao.write(listSach);
	}
	
	public void xuat() {
		 System.out.print("Ten sach : \t" );
         System.out.print("Ten tac gia \t");
         System.out.print("Nam xuat ban \t ");
         System.out.print("Nha xuat ban \t ");
         System.out.print("Danh muc \t ");
         System.out.println("Don gia \t ");
		
		for (Sach sach : listSach) {
            System.out.format("%5s|" ,sach.getTenSach());
            System.out.format("%20s|",sach.getTacGia());
            System.out.format("%10s|",sach.getNamXuatBan());
            System.out.format("%15s|",sach.getNhaXuatBan());
            System.out.format("%15s|",sach.getDanhMuc());
            System.out.println(sach.getDonGia());
        }
    }
	
	public void sapXepTheoDonGia() {
		Collections.sort(listSach, new SapXepSachTheoDonGia());
	}
	
	public void timKiemNXB() {
		String tim;
		System.out.println("Nhap nha xuat ban can tim kiem :");
		tim = scanner.nextLine();
		for(int i = 0 ; i < listSach.size();i++) {
			if(listSach.get(i).getNhaXuatBan().equalsIgnoreCase(tim)) {
				System.out.println(" Nha xuat ban can tim : "+listSach.get(i).getTenSach());
			}
		}
	}
	
	public void timKiemDM(){
		String tim;
		System.out.println("Nhap danh muc can tim kiem :");
		tim = scanner.nextLine();
		for(int i = 0 ; i < listSach.size();i++) {
			if(listSach.get(i).getDanhMuc().equalsIgnoreCase(tim)) {
				System.out.println(" Danh much sach can tim : "+listSach.get(i).getTenSach());
			}
		}
	}
}
