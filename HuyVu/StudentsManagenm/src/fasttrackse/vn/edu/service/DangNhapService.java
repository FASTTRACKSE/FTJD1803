package fasttrackse.vn.edu.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fasttrackse.vn.edu.model.DangNhap;

public class DangNhapService extends MysqlService {
	public DangNhap login(String user,String pass) {
		
		DangNhap account = null;
		
		try {
			String sql = "select * from dangnhap where username=? and password=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				account = new DangNhap();
				account.setUserName(rs.getString(1));
				account.setPassword(rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return account;
		
	}
}
