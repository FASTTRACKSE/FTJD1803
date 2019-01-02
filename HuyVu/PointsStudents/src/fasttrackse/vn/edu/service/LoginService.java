package fasttrackse.vn.edu.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

}
