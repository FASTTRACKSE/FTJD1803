package fasttrackse.vn.edu.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fasttrackse.vn.edu.model.GiaoVien;
import fasttrackse.vn.edu.model.GiaoVu;
import fasttrackse.vn.edu.model.Login;

public class LoginService extends MysqlService{
	
	public Login login(String user,String pass) {
		
		Login account = null;
		
		try {
			String sqlLogin = "select * from admin where user=? and pass=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlLogin);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				account = new Login();
				account.setUserName(rs.getString(1));
				account.setPassword(rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return account;
		
	}
	
	public GiaoVu loginGiaoVu(String user,String pass) {
		
		GiaoVu account = null;
		
		try {
			String sqlLoginGiaoVu = "select * from giaovu where user=? and pass=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlLoginGiaoVu);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				account = new GiaoVu();
				account.setUserNameGiaoVu(rs.getString(1));
				account.setPasswordGiaoVu(rs.getString(2));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return account;
		
	}
	
	public GiaoVien loginGiaoVien(String user,String pass) {
		
		GiaoVien account = null;
		
		try {
			String sqlLoginGiaoVien = "select * from giaovien where hoten=? and pass=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sqlLoginGiaoVien);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				account = new GiaoVien();
				account.setUserNameGiaoVien(rs.getString(1));
				account.setPasswordGiaoVien(rs.getString(2));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return account;
		
	}

}
