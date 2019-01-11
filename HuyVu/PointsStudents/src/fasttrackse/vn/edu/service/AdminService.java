package fasttrackse.vn.edu.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import fasttrackse.vn.edu.model.Admin;



public class AdminService extends MysqlService {
	public ArrayList<Admin> layToanBoDanhSachAdmin(){

		ArrayList<Admin> dsAdmin = new ArrayList<Admin>();
		try {

			String sql = "select * from admin";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Admin ad = new Admin();
				ad.setIdAdmin(resultSet.getString(1));
				ad.setUserNameAdmin(resultSet.getString(2));
				ad.setPasswordAdmin(resultSet.getString(3));
				dsAdmin.add(ad);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return dsAdmin;
	}
	
	public int xuLyThem(Admin ad) {

		try {
			String sqlInsert = "insert into admin values(?,?,?)";
			PreparedStatement preparedStatement =connection.prepareStatement(sqlInsert);
			preparedStatement.setString(1, ad.getIdAdmin());
			preparedStatement.setString(2, ad.getUserNameAdmin());
			preparedStatement.setString(3, ad.getPasswordAdmin());
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				JOptionPane.showMessageDialog(null,"Thêm admin thành công");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;

	}
	
	public int xuLySua(Admin ad) {
		try {
			String sqlUpdate = "update admin set user=?,pass=? where idad=?";
			PreparedStatement preparedStatement =connection.prepareStatement(sqlUpdate);
			preparedStatement.setString(1, ad.getUserNameAdmin());
			preparedStatement.setString(2, ad.getPasswordAdmin());
			preparedStatement.setString(3, ad.getIdAdmin());
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				JOptionPane.showMessageDialog(null,"Cập nhật admin thành công.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int xuLyXoa(Admin ad) {
		try {
			String sql = "delete from admin where idad=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, ad.getIdAdmin());
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
