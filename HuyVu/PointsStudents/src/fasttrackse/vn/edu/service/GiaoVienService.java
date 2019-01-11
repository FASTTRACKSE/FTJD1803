package fasttrackse.vn.edu.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import fasttrackse.vn.edu.model.GiaoVien;
import fasttrackse.vn.edu.model.GiaoVu;

public class GiaoVienService extends MysqlService {
	public ArrayList<GiaoVien> layToanBoDanhSachGiaoVien(){

		ArrayList<GiaoVien> dsGiaoVien = new ArrayList<GiaoVien>();
		try {

			String sql = "select * from giaovien";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				GiaoVien giaoVien = new GiaoVien();
				giaoVien.setIdGiaoVien(resultSet.getString(1));
				giaoVien.setUserNameGiaoVien(resultSet.getString(2));
				giaoVien.setIdMonDay(resultSet.getString(3));
				giaoVien.setIdKhoa(resultSet.getString(4));
				giaoVien.setIdLop(resultSet.getString(5));
				giaoVien.setNgaySinh(resultSet.getDate(6));
				giaoVien.setGioiTinh(resultSet.getString(7));
				giaoVien.setEmail(resultSet.getString(8));
				giaoVien.setSoDienThoai(resultSet.getString(9));
				giaoVien.setPasswordGiaoVien(resultSet.getString(10));
				dsGiaoVien.add(giaoVien);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return dsGiaoVien;
	}
	
	public int xuLySua(GiaoVien giaoVien) {
		try {
			String sqlUpdate = "update giaovien set hoten=?,pass=? where idgv=?";
			PreparedStatement preparedStatement =connection.prepareStatement(sqlUpdate);
			preparedStatement.setString(1, giaoVien.getUserNameGiaoVien());
			preparedStatement.setString(2, giaoVien.getPasswordGiaoVien());
			preparedStatement.setString(3, giaoVien.getIdGiaoVien());
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				JOptionPane.showMessageDialog(null,"Cập nhật giáo viên thành công.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
