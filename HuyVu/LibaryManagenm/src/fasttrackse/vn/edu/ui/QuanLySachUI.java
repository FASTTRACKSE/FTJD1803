package fasttrackse.vn.edu.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.MysqlConnection;
import com.mysql.cj.jdbc.Driver;

import fasttrackse.vn.edu.connection.MySqlService;
import fasttrackse.vn.edu.connection.NhaXuatBanService;
import fasttrackse.vn.edu.model.NhaXuatBan;

public class QuanLySachUI extends JFrame{

	JTextField txtMaNxb,txtTenNxb,txtDiaChi,txtSoDienThoai;
	JButton btnVeTruoc,btnVeSau;
	JLabel lblStep;

	JButton btnThem,btnLuu,btnSua,btnXoa;

	DefaultTableModel dtmNxb;
	JTable tblNxb;

	JButton btnTimKiem;

	ArrayList<NhaXuatBan> dsNxb = null;
	ListIterator<NhaXuatBan> nxbIterator;
	
	public QuanLySachUI(String title) {
		super(title);
		addControls();
		addEvents();

		hienThiToanBoDanhSachNhaXuatBan();
	}
	

	private void hienThiToanBoDanhSachNhaXuatBan() {
		// TODO Auto-generated method stub
		NhaXuatBanService nxbService = new NhaXuatBanService();
		dsNxb = nxbService.layToanBoNhaXuatBan();

		dtmNxb.setRowCount(0);
		for(NhaXuatBan nxb : dsNxb) {

			Vector<Object> vec = new Vector<Object>();
			vec.add(nxb.getMaNhaXuatBan());
			vec.add(nxb.getTenNhaXuatBan());
			vec.add(nxb.getDiaChi());
			vec.add(nxb.getSoPhone());
			dtmNxb.addRow(vec);
		}
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnTimKiem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TimKiemUI timKiemUI = new TimKiemUI("Tim kiem sach");
				timKiemUI.showWindow();

			}
		});


		btnThem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyThemNxb();
				hienThiToanBoDanhSachNhaXuatBan();
				tblNxb.updateUI();
			}
		});
		
		btnSua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyCapNhatNxb();
				hienThiToanBoDanhSachNhaXuatBan();
				tblNxb.updateUI();
				
			}
		});
		
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				xuLyXoaNxb();
				hienThiToanBoDanhSachNhaXuatBan();
				tblNxb.updateUI();
			}
		});
		
		btnVeTruoc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dsNxb =new ArrayList<NhaXuatBan>();
				nxbIterator = dsNxb.listIterator();
				if(nxbIterator.hasPrevious()) {
					nxbIterator.previous();
					txtMaNxb.setText(nxbIterator.previous().getMaNhaXuatBan());
					txtTenNxb.setText(nxbIterator.previous().getTenNhaXuatBan());
					txtDiaChi.setText(nxbIterator.previous().getDiaChi());
					txtSoDienThoai.setText(nxbIterator.previous().getSoPhone());
				}
				
			}
		});
		
		btnVeSau.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dsNxb =new ArrayList<NhaXuatBan>();
				nxbIterator = dsNxb.listIterator();
				if(nxbIterator.hasNext()) {
					nxbIterator.next();
					txtMaNxb.setText(nxbIterator.next().getMaNhaXuatBan());
					txtTenNxb.setText(nxbIterator.next().getTenNhaXuatBan());
					txtDiaChi.setText(nxbIterator.next().getDiaChi());
					txtSoDienThoai.setText(nxbIterator.next().getSoPhone());
				}
				
			}
		});
		
		tblNxb.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int row = tblNxb.getSelectedRow();
				if(row == -1) 
					return;
				String ma = tblNxb.getValueAt(row, 0)+"";
				String ten = tblNxb.getValueAt(row, 1)+"";
				String dc = tblNxb.getValueAt(row, 2)+"";
				String sp = tblNxb.getValueAt(row, 3)+"";
				NhaXuatBan nxb = new NhaXuatBan();
				txtMaNxb.setText(ma);
				txtTenNxb.setText(ten);
				txtDiaChi.setText(dc);
				txtSoDienThoai.setText(sp);
				NhaXuatBanService nhaXuatBanService = new NhaXuatBanService();
				nhaXuatBanService.hienThiChiTiet(ma,nxb);
				
			}
		});

	}
	protected void xuLyXoaNxb() {
		// TODO Auto-generated method stub
		try {
			NhaXuatBan nxb = new NhaXuatBan();
			nxb.setMaNhaXuatBan(txtMaNxb.getText());
			NhaXuatBanService nhaXuatBanService = new NhaXuatBanService();
			int x = nhaXuatBanService.xuLyXoa(nxb);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Xoa thanh cong");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


	protected void xuLyThemNxb() {
		// TODO Auto-generated method stub
		try {
			NhaXuatBan nxb = new NhaXuatBan();
			nxb.setMaNhaXuatBan(txtMaNxb.getText());
			nxb.setTenNhaXuatBan(txtTenNxb.getText());
			nxb.setDiaChi(txtDiaChi.getText());
			nxb.setSoPhone(txtSoDienThoai.getText());
			NhaXuatBanService nhaXuatBanService = new NhaXuatBanService();
			int x = nhaXuatBanService.xuLyThem(nxb);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Them nha san xuat thanh cong");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	protected void xuLyCapNhatNxb() {
		// TODO Auto-generated method stub
		try {
			NhaXuatBan nxb = new NhaXuatBan();
			nxb.setTenNhaXuatBan(txtTenNxb.getText());
			nxb.setDiaChi(txtDiaChi.getText());
			nxb.setSoPhone(txtSoDienThoai.getText());
			nxb.setMaNhaXuatBan(txtMaNxb.getText());
			NhaXuatBanService nhaXuatBanService = new NhaXuatBanService();
			int x = nhaXuatBanService.xuLyCapNhap(nxb);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Cap nhat nha xuat ban thanh cong");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	

	private void addControls() {
		// TODO Auto-generated method stub

		Container con = getContentPane();
		con.setLayout(new BorderLayout());

		JPanel pnNorth = new JPanel();
		JPanel pnCenter = new JPanel();
		JPanel pnSouth = new JPanel();
		pnSouth.setLayout(new FlowLayout(FlowLayout.LEFT));

		con.add(pnNorth,BorderLayout.NORTH);
		con.add(pnCenter,BorderLayout.CENTER);
		con.add(pnSouth,BorderLayout.SOUTH);

		pnNorth.setLayout(new BorderLayout());
		JPanel pnChiTiet = new JPanel();
		pnNorth.add(pnChiTiet,BorderLayout.CENTER);
		JPanel pnThucHien = new JPanel();
		pnNorth.add(pnThucHien,BorderLayout.EAST);

		pnChiTiet.setLayout(new BoxLayout(pnChiTiet, BoxLayout.Y_AXIS));
		JPanel pnNxb = new JPanel();
		JLabel lblNxb = new JLabel("Thong tin nha xuat ban");
		lblNxb.setForeground(Color.BLUE);
		Font font = new Font("arial",Font.BOLD , 20);
		lblNxb.setFont(font);
		pnNxb.add(lblNxb);
		pnChiTiet.add(pnNxb);

		JPanel pnMaNxb = new JPanel();
		JLabel lblMaNxb = new JLabel("Ma nha xuat ban : ");
		txtMaNxb = new JTextField(20);
		pnMaNxb.add(lblMaNxb);
		pnMaNxb.add(txtMaNxb);
		pnChiTiet.add(pnMaNxb);

		JPanel pnTenNxb = new JPanel();
		JLabel lblTenNxb = new JLabel("Ten nha xuat ban : ");
		txtTenNxb = new JTextField(20);
		pnTenNxb.add(lblTenNxb);
		pnTenNxb.add(txtTenNxb);
		pnChiTiet.add(pnTenNxb);

		JPanel pnDiaChiNxb = new JPanel();
		JLabel lblDiaChiNxb = new JLabel("Dia chi xuat ban : ");
		txtDiaChi = new JTextField(20);
		pnDiaChiNxb.add(lblDiaChiNxb);
		pnDiaChiNxb.add(txtDiaChi);
		pnChiTiet.add(pnDiaChiNxb);

		JPanel pnSdtnxb = new JPanel();
		JLabel lblSdtNxb = new JLabel("So dien thoai nha xuat ban : ");
		txtSoDienThoai = new JTextField(20);
		pnSdtnxb.add(lblSdtNxb);
		pnSdtnxb.add(txtSoDienThoai);
		pnChiTiet.add(pnSdtnxb);

		JPanel pnButtonChiThiet = new JPanel();
		btnVeTruoc = new JButton("Ve truoc");
		lblStep = new JLabel("1/10");
		btnVeSau = new JButton("Ve sau");
		pnButtonChiThiet.add(btnVeTruoc);
		pnButtonChiThiet.add(lblStep);
		pnButtonChiThiet.add(btnVeSau);
		pnChiTiet.add(pnButtonChiThiet);

		pnThucHien.setLayout(new BoxLayout(pnThucHien, BoxLayout.Y_AXIS));
		JPanel pnButtonThem = new JPanel();
		btnThem = new JButton("Them ");
		pnButtonThem.add(btnThem);
		pnThucHien.add(pnButtonThem);

		JPanel pnButtonLuu = new JPanel();
		btnLuu = new JButton("Luu ");
		pnButtonLuu.add(btnLuu);
		pnThucHien.add(pnButtonLuu);

		JPanel pnButtonSua = new JPanel();
		btnSua = new JButton("Sua ");
		pnButtonSua.add(btnSua);
		pnThucHien.add(pnButtonSua);

		JPanel pnButtonXoa = new JPanel();
		btnXoa = new JButton("Xoa ");
		pnButtonXoa.add(btnXoa);
		pnThucHien.add(pnButtonXoa);

		pnCenter.setLayout(new BorderLayout());
		dtmNxb = new DefaultTableModel();
		dtmNxb.addColumn("Ma nha xuat ban");
		dtmNxb.addColumn("Ten nha xuat ban");
		dtmNxb.addColumn("Dia chi nha xuat ban");
		dtmNxb.addColumn("So dien thoai nha xuat ban");

		tblNxb = new JTable(dtmNxb);
		JScrollPane scTable = new JScrollPane(tblNxb,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnCenter.add(scTable,BorderLayout.CENTER);

		JPanel pnButtonOfSouth = new JPanel();
		pnButtonOfSouth.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnTimKiem = new JButton("Tim kiem");
		pnButtonOfSouth.add(btnTimKiem);
		pnSouth.add(pnButtonOfSouth);

		TitledBorder titledBorderThongTinChiTiet = new TitledBorder
				(BorderFactory.createLineBorder(Color.RED),"Thong tin chi tiet");
		pnChiTiet.setBorder(titledBorderThongTinChiTiet);

		TitledBorder titledBorderThucHien = new TitledBorder
				(BorderFactory.createLineBorder(Color.BLUE),"Thuc hien");
		pnThucHien.setBorder(titledBorderThucHien);

		TitledBorder titledBorderDanhSachNxb = new TitledBorder
				(BorderFactory.createLineBorder(Color.BLUE),"Danh sach nha xuat ban");
		pnCenter.setBorder(titledBorderDanhSachNxb);

		lblMaNxb.setPreferredSize(lblSdtNxb.getPreferredSize());
		lblTenNxb.setPreferredSize(lblSdtNxb.getPreferredSize());
		lblDiaChiNxb.setPreferredSize(lblSdtNxb.getPreferredSize());

		btnThem.setIcon(new ImageIcon("images/note-add.png"));
		btnLuu.setIcon(new ImageIcon("images/save.png"));
		btnSua.setIcon(new ImageIcon("images/system-software-update.png"));
		btnXoa.setIcon(new ImageIcon("images/delete.png"));

		btnVeTruoc.setIcon(new ImageIcon("images/vetruoc.png"));
		btnVeSau.setIcon(new ImageIcon("images/vesau.png"));

		btnTimKiem.setIcon(new ImageIcon("images/search.png"));


	}

	public void showWindow() {

		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
