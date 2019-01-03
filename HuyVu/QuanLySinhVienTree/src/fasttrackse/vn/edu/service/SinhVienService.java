package fasttrackse.vn.edu.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import fasttrackse.vn.edu.model.SinhVien;

public class SinhVienService extends MysqlService{
	public ArrayList<SinhVien> layToanBoSinhVienTheoMaLop(int maLop){

		ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
		try {
			String sql = "select * from sinhvien where maLop=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, maLop);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				SinhVien sv = new SinhVien();
				sv.setMaSinhVien(rs.getInt(1));
				sv.setHoTen(rs.getString(2));
				sv.setNgaySinh(rs.getDate(3));
				sv.setDiemTb(rs.getInt(4));
				sv.setMaLop(maLop);
				ds.add(sv);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ds;
	}
}
