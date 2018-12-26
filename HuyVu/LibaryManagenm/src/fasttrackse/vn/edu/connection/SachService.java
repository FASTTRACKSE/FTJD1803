package fasttrackse.vn.edu.connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import fasttrackse.vn.edu.model.NhaXuatBan;
import fasttrackse.vn.edu.model.Sach;

public class SachService extends MySqlService {
	public ArrayList<Sach> timSachTheoNhaXuatBan(String maNxb){
		ArrayList<Sach> dsSach = new ArrayList<Sach>();
		try {


			String sql = "select * from sach where manhaxuatban = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, maNxb);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Sach s = new Sach();
				s.setMaSach(resultSet.getString(1));
				s.setTenSach(resultSet.getString(2));
				s.setMaNhaXuatBan(resultSet.getString(3));
				s.setSoTrang(resultSet.getInt(4));
				dsSach.add(s);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return dsSach;

	}
}
