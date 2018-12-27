package fasttrackse.vn.edu.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import fasttrackse.vn.edu.model.SinhVien;

public class SinhVienService extends MysqlService{
	public ArrayList<SinhVien> layToanBoDanhSachSinhVien(){

		ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
		try {

			String sql = "select * from sinhvien";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				SinhVien sv = new SinhVien();
				sv.setMaSinhVien(resultSet.getString(1));
				sv.setTenSinhVien(resultSet.getString(2));
				sv.setTuoi(resultSet.getString(3));

				dsSinhVien.add(sv);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return dsSinhVien;

	}

	public int xuLyThem(SinhVien sv) {

		try {

			String sqlInsert = "insert into sinhvien values(?,?,?)";
			PreparedStatement preparedStatement =connection.prepareStatement(sqlInsert);
			preparedStatement.setString(1, sv.getMaSinhVien());
			preparedStatement.setString(2, sv.getTenSinhVien());
			preparedStatement.setString(3, sv.getTuoi());
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				JOptionPane.showMessageDialog(null,"Them thanh cong");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;

	}

	public int xuLyXoa(SinhVien sv) {

		try {
			String sqlDelete = "delete from sinhvien where masinhvien=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
			preparedStatement.setString(1, sv.getMaSinhVien());
			int x = preparedStatement.executeUpdate();
			if(x > 0) {
				JOptionPane.showMessageDialog(null, "Xoa thanh cong");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
}
