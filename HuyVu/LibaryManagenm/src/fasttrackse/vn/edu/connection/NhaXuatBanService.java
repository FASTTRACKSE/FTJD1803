package fasttrackse.vn.edu.connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import fasttrackse.vn.edu.model.NhaXuatBan;

public class NhaXuatBanService extends MySqlService {

	PreparedStatement preparedStatement;

	public ArrayList<NhaXuatBan> layToanBoNhaXuatBan(){

		ArrayList<NhaXuatBan> dsNxb = new ArrayList<NhaXuatBan>();
		try {

			String sql = "select * from nhaxuatban";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				NhaXuatBan nhaXuatBan = new NhaXuatBan();
				nhaXuatBan.setMaNhaXuatBan(resultSet.getString(1));
				nhaXuatBan.setTenNhaXuatBan(resultSet.getString(2));
				nhaXuatBan.setDiaChi(resultSet.getString(3));
				nhaXuatBan.setSoPhone(resultSet.getString(4));
				dsNxb.add(nhaXuatBan);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return dsNxb;
	}

	public int xuLyThem(NhaXuatBan nxb) {

		try {
			String sqlInsert = "insert into nhaxuatban values(?,?,?,?)";
			PreparedStatement preparedStatement =connection.prepareStatement(sqlInsert);
			preparedStatement.setString(1, nxb.getMaNhaXuatBan());
			preparedStatement.setString(2, nxb.getTenNhaXuatBan());
			preparedStatement.setString(3, nxb.getDiaChi());
			preparedStatement.setString(4, nxb.getSoPhone());
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				JOptionPane.showMessageDialog(null,"Them thanh cong");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;

	}

	public int xuLyCapNhap(NhaXuatBan nxb) {
		try {
			String sqlInsert = "update nhaxuatban set tennhaxuatban=?,diachi=?,sophone=? where manhaxuatban=?";
			PreparedStatement preparedStatement =connection.prepareStatement(sqlInsert);
			preparedStatement.setString(1, nxb.getTenNhaXuatBan());
			preparedStatement.setString(2, nxb.getDiaChi());
			preparedStatement.setString(3, nxb.getSoPhone());
			preparedStatement.setString(4, nxb.getMaNhaXuatBan());
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				JOptionPane.showMessageDialog(null,"Cap nhat nha xuat ban thanh cong");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public int xuLyXoa(NhaXuatBan nxb) {
		try {
			String sql = "delete from nhaxuatban where manhaxuatban=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, nxb.getMaNhaXuatBan());
			int x = preparedStatement.executeUpdate();
			if(x>0) {
				JOptionPane.showMessageDialog(null,"Xoa thanh cong");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

	public void hienThiChiTiet(String ma,NhaXuatBan nxb)
	{
		try
		{
			String sql="select * from nhaxuatban where manhaxuatban=?";
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, ma);
			ResultSet rs=preparedStatement.executeQuery();
			if(rs.next())
			{
				nxb.setMaNhaXuatBan(rs.getString(1));
				nxb.setTenNhaXuatBan(rs.getString(2));
				nxb.setDiaChi(rs.getString(3));
				nxb.setSoPhone(rs.getInt(4)+"");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	

}
