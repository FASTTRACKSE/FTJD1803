import java.io.IOException;
import java.security.IdentityScope;
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

	public int nhapIdSach() {
		System.out.println("Nhap ma sach :");
		return Integer.parseInt(scanner.nextLine());
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

		int idSach = nhapIdSach();
		String tenSach = nhapTenSach();
		String tacGia = nhapTenTacGia();
		int namXuatBan = nhapNamXuatBan();
		String nhaXuatBan = nhapNhaXuatBan();
		String danhMuc = nhapDanhMuc();
		double donGia = nhapDonGia();
		float tongDoanhThu = 0;

		Sach sach = new Sach(idSach, tenSach, tacGia, namXuatBan, nhaXuatBan, danhMuc, donGia, tongDoanhThu);
		listSach.add(sach);
		sachDao.write(listSach);
	}

	public void xuat() {
		System.out.print("Ma sach : \t" );
		System.out.print("Ten sach : \t" );
		System.out.print("Ten tac gia \t");
		System.out.print("Nam xuat ban \t ");
		System.out.print("Nha xuat ban \t ");
		System.out.print("Danh muc \t ");
		System.out.println("Don gia \t ");

		for (Sach sach : listSach) {
			System.out.format("%5s|",sach.getIdSach() );
			System.out.format("%17s|" ,sach.getTenSach());
			System.out.format("%12s|",sach.getTacGia());
			System.out.format("%15s|",sach.getNamXuatBan());
			System.out.format("%19s|",sach.getNhaXuatBan());
			System.out.format("%9s|",sach.getDanhMuc());
			System.out.println("\t\t"+sach.getDonGia());
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
				System.out.println(" Ten sach can tim : "+listSach.get(i).getTenSach());
			}
		}
	}

	public void timKiemDM(){
		String tim;
		System.out.println("Nhap danh muc can tim kiem :");
		tim = scanner.nextLine();
		for(int i = 0 ; i < listSach.size();i++) {
			if(listSach.get(i).getDanhMuc().equalsIgnoreCase(tim)) {
				System.out.println(" Ten sach can tim : "+listSach.get(i).getTenSach());
			}
		}
	}

	public void banSach(int id) {
		Sach sach = null;
		int size = listSach.size();
		for(int i = 0 ; i<size;i++) {
			if(listSach.get(i).getIdSach() == id ) {
				sach = listSach.get(i);
				break;
			}
		}if(sach!=null) {
			listSach.remove(sach);
			try {
				sachDao.write1(listSach);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.printf("id = ",id);
		}
	}


}
