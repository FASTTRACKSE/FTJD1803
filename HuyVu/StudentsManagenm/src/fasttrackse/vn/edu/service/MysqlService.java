package fasttrackse.vn.edu.service;

import java.sql.Connection;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class MysqlService {
	protected Connection connection;
	
	public MysqlService() {
		try {
			String sqlConnection = "jdbc:mysql://localhost/quanlysinhvien";
			Properties properties = new Properties();
			properties.put("user", "root");
			properties.put("password", "12345678");
			Driver driver = new Driver();
			connection = driver.connect(sqlConnection, properties);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
