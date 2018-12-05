package quanlysinhvien;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien {

	public static Scanner scanner = new Scanner(System.in);

	private List<SinhVien> listSinhVien;
	private SinhVienDao sinhVienDao;

	public QuanLySinhVien() {
		sinhVienDao = new SinhVienDao();
		listSinhVien = sinhVienDao.read();
	}

	public int inputId() {
		System.out.println("Nhap ma sinh vien");
		while(true) {
			try {
				int id = Integer.parseInt(scanner.nextLine());
				return id;
			} catch (NumberFormatException e) {
				System.out.println("Khong hop le ! Nhap lai ma sinh vien :");
			}
		}
	}

	private String inputTen() {
		System.out.println("Nhap ten sinh vien:");
		return scanner.nextLine();
	}

	private String inputDiaChi() {
		System.out.println("Nhap dis chi :");
		return scanner.nextLine();
	}

	private byte inputTuoi() {
		System.out.println("Nhap tuoi sinh vien :");
		while(true) {
			try {
				byte tuoi = Byte.parseByte(scanner.nextLine());
				if(tuoi<0 && tuoi>100) {
					throw new NumberFormatException();
				}
				return tuoi;
			} catch (NumberFormatException e) {
				System.out.println("Khong hop le ! Nhap lai tuoi :");
			}
		}
	}

	private float inputDTB() {
		System.out.println("Nhap vao diem trung binh :");
		while(true) {
			try {
				float diemTrungBinh = Float.parseFloat(scanner.nextLine());
				if(diemTrungBinh<0.0 && diemTrungBinh>10.0) {
					throw new NumberFormatException();
				}
				return diemTrungBinh;
			} catch (NumberFormatException e) {
				System.out.println("Khong hop le ! Nhap lai diem trung binh :");
			}
		}

	}

	public List<SinhVien> getListSinhVien() {
		return listSinhVien;
	}

	public void setListSinhVien(List<SinhVien> listSinhVien) {
		this.listSinhVien = listSinhVien;
	}
	
	
	public void sapXepTenSinhVien() {
		Collections.sort(listSinhVien, new SapXepTenSinhVien());
	}
	
	public void sapDiemSinhVien() {
		Collections.sort(listSinhVien, new SapXepDiemSinhVien());
	}
	
	public void add() throws IOException {
		int id = (listSinhVien.size()>0) ? (listSinhVien.size()+1):1;
		System.out.println("Ma sinh vien = "+ id);
		String ten = inputTen();
		byte tuoi = inputTuoi();
		String diaChi = inputDiaChi();
		float diemTB = inputDTB();
		
		SinhVien sinhVien = new SinhVien(id, ten, tuoi, diaChi, diemTB);
		listSinhVien.add(sinhVien);
		sinhVienDao.write(listSinhVien);
	}
	
	public void show() {
        for (SinhVien sinhVien : listSinhVien) {
            System.out.format("%5d | ", sinhVien.getId());
            System.out.format("%20s | ", sinhVien.getTen());
            System.out.format("%5d | ", sinhVien.getTuoi());
            System.out.format("%20s | ", sinhVien.getDiaChi());
            System.out.format("%10.1f%n", sinhVien.getDiemTrungBinh());
        }
    }
	
	public void edit(int id) {
        boolean isExisted = false;
        int size = listSinhVien.size();
        for (int i = 0; i < size; i++) {
            if (listSinhVien.get(i).getId() == id) {
                isExisted = true;
                listSinhVien.get(i).setTen(inputTen());
                listSinhVien.get(i).setTuoi(inputTuoi());
                listSinhVien.get(i).setDiaChi(inputDiaChi());
                listSinhVien.get(i).setDiemTrungBinh(inputDTB());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            try {
				sinhVienDao.write(listSinhVien);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
	
	public void delete(int id) {
        SinhVien sinhVien = null;
        int size = listSinhVien.size();
        for (int i = 0; i < size; i++) {
            if (listSinhVien.get(i).getId() == id) {
                sinhVien = listSinhVien.get(i);
                break;
            }
        }
        if (sinhVien != null) {
        	listSinhVien.remove(sinhVien);
            try {
				sinhVienDao.write(listSinhVien);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }
	
}
