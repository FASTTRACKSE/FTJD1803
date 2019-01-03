package fasttrackse.vn.edu.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import fasttrackse.vn.edu.model.LopHoc;

public class LopHocService extends MysqlService{
	public ArrayList<LopHoc> layToanBoDanhSachLopHoc(){
		
		ArrayList<LopHoc> ds = new ArrayList<LopHoc>();
		try {
			String sql = "select * from lop";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				LopHoc lh = new LopHoc();
				lh.setMaLop(rs.getInt(1));
				lh.setTenLop(rs.getString(2));
				lh.setSiSo(rs.getInt(3));
				lh.setMaKhoa(rs.getInt(4));
				ds.add(lh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ds;
		
	}

}
