package fasttrackse.vn.edu.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import fasttrackse.vn.edu.model.Admin;
import fasttrackse.vn.edu.model.GiaoVu;

public class GiaoVuService extends MysqlService {
	public ArrayList<GiaoVu> layToanBoDanhSachGiaoVu(){

		ArrayList<GiaoVu> dsGiaoVu = new ArrayList<GiaoVu>();
		try {

			String sql = "select * from giaovu";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				GiaoVu giaoVu = new GiaoVu();
				giaoVu.setIdGiaoVu(resultSet.getString(1));
				giaoVu.setUserNameGiaoVu(resultSet.getString(2));
				giaoVu.setPasswordGiaoVu(resultSet.getString(3));
				dsGiaoVu.add(giaoVu);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return dsGiaoVu;
	}
	
	public int xuLyThem(GiaoVu giaoVu) {

		try {
			String sqlInsert = "insert into giaovu values(?,?,?)";
			PreparedStatement preparedStatement =connection.prepareStatement(sqlInsert);
			preparedStatement.setString(1, giaoVu.getIdGiaoVu());
			preparedStatement.setString(2, giaoVu.getUserNameGiaoVu());
			preparedStatement.setString(3, giaoVu.getPasswordGiaoVu());
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				JOptionPane.showMessageDialog(null,"Thêm giáo vụ thành công");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;

	}
	
	public int xuLySua(GiaoVu giaoVu) {
		try {
			String sqlUpdate = "update giaovu set user=?,pass=? where idgvu=?";
			PreparedStatement preparedStatement =connection.prepareStatement(sqlUpdate);
			preparedStatement.setString(1, giaoVu.getUserNameGiaoVu());
			preparedStatement.setString(2, giaoVu.getPasswordGiaoVu());
			preparedStatement.setString(3, giaoVu.getIdGiaoVu());
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				JOptionPane.showMessageDialog(null,"Cập nhật giáo vụ thành công.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int xuLyXoa(GiaoVu giaoVu) {
		try {
			String sql = "delete from giaovu where idgvu=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, giaoVu.getIdGiaoVu());
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				JOptionPane.showMessageDialog(null,"Xóa thành công");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;

	}
}
