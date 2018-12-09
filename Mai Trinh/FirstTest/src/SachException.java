import java.util.ArrayList;

public class SachException extends Exception {
	private String mgs;

	public String getMgs() {
		return mgs;
	}

	public SachException(String mgs) {
		this.mgs = mgs;
	}
	public String toString() {
		return mgs;
	}
	
	static void checkTenSach(String tenSach)throws SachException{
		if(tenSach.isEmpty()) {
			 throw new SachException("Yeu cau nhap lai!");
		}
	}
	
	static void checkTacGia(String tacGia)throws SachException{
		if(tacGia.isEmpty()) {
			 throw new SachException("Yeu cau nhap lai!");
		}
	}
	
	
	static void checkDanhMuc(String danhMuc)throws SachException{
		if(danhMuc.isEmpty()) {
			 throw new SachException("Yeu cau nhap lai!");
		}
	}
	
	static void checkNhaXBan(String nhaXBan)throws SachException{
		if(nhaXBan.isEmpty()) {
			 throw new SachException("Yeu cau nhap lai!");
		}
	}
	
	static void checknamXBan(int namXBan) throws SachException{
		if(namXBan>2020||namXBan<0) {
			throw new  SachException("Yeu cau nhap lai!");
		}
	}
	static void checkDonGia(float donGia) throws SachException{
		if(donGia<0) {
			throw new SachException("Yeu cau nhap lai!");
		}
	}
}
