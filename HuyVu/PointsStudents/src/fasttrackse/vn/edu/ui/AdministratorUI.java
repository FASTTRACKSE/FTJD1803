package fasttrackse.vn.edu.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
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
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


import fasttrackse.vn.edu.model.Admin;
import fasttrackse.vn.edu.model.GiaoVien;
import fasttrackse.vn.edu.model.GiaoVu;
import fasttrackse.vn.edu.service.AdminService;
import fasttrackse.vn.edu.service.GiaoVienService;
import fasttrackse.vn.edu.service.GiaoVuService;

public class AdministratorUI extends JFrame{

	JTextField txtIdAdmin,txtAdminName,txtAdminPass;
	JTextField txtIdGiaoVu,txtGiaoVuName,txtGiaoVuPass;
	JTextField txtIdGiaoVien,txtGiaoVienName,txtGiaoVienPass;

	DefaultTableModel dtmAdmin,dtmGiaoVu,dtmGiaoVien;
	JTable tblAdmin,tblGiaoVu,tblGiaoVien;

	JTabbedPane jtpManager;
	JButton btnThemAdmin,btnSuaAdmin,btnXoaAdmin,btnThoatAdmin;
	JButton btnThemGiaoVu,btnSuaGiaoVu,btnXoaGiaoVu,btnThoatGiaoVu;
	JButton btnThemGiaoVien,btnSuaGiaoVien,btnXoaGiaoVien,btnThoatGiaoVien;

	ArrayList<Admin> dsAdmin = null;
	ArrayList<GiaoVu> dsGiaoVu = null;
	ArrayList<GiaoVien> dsGiaoVien = null;

	public AdministratorUI(String titles) {
		super(titles);
		addControls();
		addEvents();

		hienThiDanhSachAdmin();
		hienThiDanhSachGiaoVu();
		hienThiDanhSachGiaoVien();
	}

	// Hiển thị danh sách Giáo viên lên Jtable
	private void hienThiDanhSachGiaoVien() {
		// TODO Auto-generated method stub
		GiaoVienService giaoVienService = new GiaoVienService();
		dsGiaoVien = giaoVienService.layToanBoDanhSachGiaoVien();

		dtmGiaoVien.setRowCount(0);
		for(GiaoVien giaoVien : dsGiaoVien) {

			Vector<Object> vec = new Vector<Object>();
			vec.add(giaoVien.getIdGiaoVien());
			vec.add(giaoVien.getUserNameGiaoVien());
			vec.add(giaoVien.getPasswordGiaoVien());
			dtmGiaoVien.addRow(vec);
		}
	}

	// Hiển thị danh sách giáo vụ lên Jtable
	private void hienThiDanhSachGiaoVu() {
		// TODO Auto-generated method stub
		GiaoVuService giaoVuService = new GiaoVuService();
		dsGiaoVu = giaoVuService.layToanBoDanhSachGiaoVu();

		dtmGiaoVu.setRowCount(0);
		for(GiaoVu giaoVu : dsGiaoVu) {

			Vector<Object> vec = new Vector<Object>();
			vec.add(giaoVu.getIdGiaoVu());
			vec.add(giaoVu.getUserNameGiaoVu());
			vec.add(giaoVu.getPasswordGiaoVu());
			dtmGiaoVu.addRow(vec);
		}
	}

	// Hiển thị danh sách admin lên Jtable
	private void hienThiDanhSachAdmin() {
		// TODO Auto-generated method stub
		AdminService adminService = new AdminService();
		dsAdmin = adminService.layToanBoDanhSachAdmin();

		dtmAdmin.setRowCount(0);
		for(Admin ad : dsAdmin) {

			Vector<Object> vec = new Vector<Object>();
			vec.add(ad.getIdAdmin());
			vec.add(ad.getUserNameAdmin());
			vec.add(ad.getPasswordAdmin());
			dtmAdmin.addRow(vec);
		}
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		
		/**
		 *	Xử lý các button Admin 
		 * 
		 */
		btnThemAdmin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyThemAdmin();
				hienThiDanhSachAdmin();
				tblAdmin.updateUI();
			}
		});
		
		btnSuaAdmin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLySuaAdmin();
				hienThiDanhSachAdmin();
				tblAdmin.updateUI();
			}
		});
		
		btnXoaAdmin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyXoaAdmin();
				hienThiDanhSachAdmin();
				tblAdmin.updateUI();
			}
		});
		
		btnThoatAdmin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		tblAdmin.addMouseListener(new MouseListener() {
			
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
				int row = tblAdmin.getSelectedRow();
				if(row==-1) return;
				Admin ad = dsAdmin.get(row);
				txtIdAdmin.setText(ad.getIdAdmin());
				txtAdminName.setText(ad.getUserNameAdmin());
				txtAdminPass.setText(ad.getPasswordAdmin());
			}
		});
		
		
		/**
		 *	Xử lý các button Giáo Vụ 
		 * 
		 */
		
		btnThemGiaoVu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyThemGiaoVu();
				hienThiDanhSachGiaoVu();
				tblGiaoVu.updateUI();
			}
		});
		
		btnSuaGiaoVu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLySuaGiaoVu();
				hienThiDanhSachGiaoVu();
				tblGiaoVu.updateUI();
			}
		});
		
		btnXoaGiaoVu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyXoaGiaoVu();
				hienThiDanhSachGiaoVu();
				tblGiaoVu.updateUI();
			}
		});
		
		btnThoatGiaoVu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		tblGiaoVu.addMouseListener(new MouseListener() {
			
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
				int row = tblGiaoVu.getSelectedRow();
				if(row==-1) return;
				GiaoVu gv = dsGiaoVu.get(row);
				txtIdGiaoVu.setText(gv.getIdGiaoVu());
				txtGiaoVuName.setText(gv.getUserNameGiaoVu());
				txtGiaoVuPass.setText(gv.getPasswordGiaoVu());
			}
		});
		
		/**
		 *	Xử lý các button Giáo viên
		 * 
		 */
		btnThemGiaoVien.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnSuaGiaoVien.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLySuaGiaoVien();
				hienThiDanhSachGiaoVien();
				tblGiaoVien.updateUI();
			}
		});
		
		btnXoaGiaoVien.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnThoatGiaoVien.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		tblGiaoVien.addMouseListener(new MouseListener() {
			
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
				int row = tblGiaoVien.getSelectedRow();
				if(row==-1) return;
				GiaoVien gv = dsGiaoVien.get(row);
				txtIdGiaoVien.setText(gv.getIdGiaoVien());
				txtGiaoVienName.setText(gv.getUserNameGiaoVien());
				txtGiaoVienPass.setText(gv.getPasswordGiaoVien());
			}
		});
		
	}

	protected void xuLySuaGiaoVien() {
		// TODO Auto-generated method stub
		try {
			GiaoVien gv = new GiaoVien();
			gv.setIdGiaoVien(txtIdGiaoVien.getText());
			gv.setUserNameGiaoVien(txtGiaoVienName.getText());
			gv.setPasswordGiaoVien(txtGiaoVienPass.getText());
			GiaoVienService giaoVienService = new GiaoVienService();
			int x = giaoVienService.xuLySua(gv);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Cập nhật giáo viên thành công");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	protected void xuLyXoaGiaoVu() {
		// TODO Auto-generated method stub
		try {
			GiaoVu gv = new GiaoVu();
			gv.setIdGiaoVu(txtIdGiaoVu.getText());
			GiaoVuService giaoVuService = new GiaoVuService();
			int x = giaoVuService.xuLyXoa(gv);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Xóa thành công");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void xuLySuaGiaoVu() {
		// TODO Auto-generated method stub
		try {
			GiaoVu gv = new GiaoVu();
			gv.setIdGiaoVu(txtIdGiaoVu.getText());
			gv.setUserNameGiaoVu(txtGiaoVuName.getText());
			gv.setPasswordGiaoVu(txtGiaoVuPass.getText());
			GiaoVuService giaoVuService = new GiaoVuService();
			int x = giaoVuService.xuLySua(gv);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Cập nhật giáo vụ thành công");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	protected void xuLyThemGiaoVu() {
		// TODO Auto-generated method stub
		try {
			GiaoVu gv = new GiaoVu();
			gv.setIdGiaoVu(txtIdGiaoVu.getText());
			gv.setUserNameGiaoVu(txtGiaoVuName.getText());
			gv.setPasswordGiaoVu(txtGiaoVuPass.getText());
			GiaoVuService giaoVuService = new GiaoVuService();
			int x = giaoVuService.xuLyThem(gv);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Thêm giáo vụ thành công");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	protected void xuLyXoaAdmin() {
		// TODO Auto-generated method stub
		try {
			Admin ad = new Admin();
			ad.setIdAdmin(txtIdAdmin.getText());
			AdminService adminService = new AdminService();
			int x = adminService.xuLyXoa(ad);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Xoa thanh cong");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void xuLySuaAdmin() {
		// TODO Auto-generated method stub
		try {
			Admin ad = new Admin();
			ad.setIdAdmin(txtIdAdmin.getText());
			ad.setUserNameAdmin(txtAdminName.getText());
			ad.setPasswordAdmin(txtAdminPass.getText());
			AdminService adminService = new AdminService();
			int x = adminService.xuLySua(ad);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Cập nhật admin thành công");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	protected void xuLyThemAdmin() {
		// TODO Auto-generated method stub
		try {
			Admin ad = new Admin();
			ad.setIdAdmin(txtIdAdmin.getText());
			ad.setUserNameAdmin(txtAdminName.getText());
			ad.setPasswordAdmin(txtAdminPass.getText());
			AdminService adminService = new AdminService();
			int x = adminService.xuLyThem(ad);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Thêm admin thành công");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	// Giao dien
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
		pnNorth.add(pnThucHien,BorderLayout.WEST);

		pnThucHien.setLayout(new BoxLayout(pnThucHien, BoxLayout.Y_AXIS));
		JPanel pnImage = new JPanel();
		JLabel lblImage = new JLabel(new ImageIcon("images/administrator.png"));
		JLabel lblXinChaoAdmin = new JLabel("Hello Administrator");
		pnImage.add(lblImage);
		pnImage.add(lblXinChaoAdmin);
		pnThucHien.add(pnImage);

		pnChiTiet.setLayout(new BoxLayout(pnChiTiet, BoxLayout.Y_AXIS));
		JPanel pnBanner = new JPanel();
		JLabel lblBanner = new JLabel(new ImageIcon("images/admin_banner.gif"));
		pnBanner.add(lblBanner);
		pnChiTiet.add(pnBanner);

		pnCenter.setLayout(new BorderLayout());
		jtpManager = new JTabbedPane();
		con.add(jtpManager,BorderLayout.CENTER);

		// JTablePanel Admin
		JPanel pnAdmin = new JPanel();
		jtpManager.add("Tài khoản Admin", pnAdmin);
		pnAdmin.setLayout(new BoxLayout(pnAdmin, BoxLayout.Y_AXIS));
		dtmAdmin = new DefaultTableModel();
		dtmAdmin.addColumn("Id Admin");
		dtmAdmin.addColumn("Tên đăng nhập");
		dtmAdmin.addColumn("Mật khẩu");
		tblAdmin = new JTable(dtmAdmin);
		JScrollPane scTable = new JScrollPane(tblAdmin,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnAdmin.add(scTable,BorderLayout.CENTER);

		JPanel pnIdAdmin = new JPanel();
		pnIdAdmin.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblAdminId = new JLabel("Id Admin :");
		txtIdAdmin = new JTextField(20);
		JLabel lblUserNameAdmin = new JLabel("Tên đăng nhập :");
		txtAdminName = new JTextField(20);
		JLabel lblAdminPassword = new JLabel("Mật khẩu :");
		txtAdminPass = new JTextField(20);
		pnIdAdmin.add(lblAdminId);
		pnIdAdmin.add(txtIdAdmin);
		pnIdAdmin.add(lblUserNameAdmin);
		pnIdAdmin.add(txtAdminName);
		pnIdAdmin.add(lblAdminPassword);
		pnIdAdmin.add(txtAdminPass);
		pnAdmin.add(pnIdAdmin);

		JPanel pnButtonAdmin = new JPanel();
		pnButtonAdmin.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnThemAdmin = new JButton("Thêm",new ImageIcon("images/new.png"));
		btnSuaAdmin = new JButton("Sửa",new ImageIcon("images/edit.png"));
		btnXoaAdmin = new JButton("Xóa",new ImageIcon("images/remove.png"));
		btnThoatAdmin = new JButton("Thoát",new ImageIcon("images/exit.png"));
		pnButtonAdmin.add(btnThemAdmin);
		pnButtonAdmin.add(btnSuaAdmin);
		pnButtonAdmin.add(btnXoaAdmin);
		pnButtonAdmin.add(btnThoatAdmin);
		pnAdmin.add(pnButtonAdmin);



		// JTablePanel Giao Vu
		JPanel pnGiaoVu = new JPanel();
		jtpManager.add("Tài Khoản Giáo Vụ", pnGiaoVu);
		pnGiaoVu.setLayout(new BoxLayout(pnGiaoVu, BoxLayout.Y_AXIS));
		dtmGiaoVu = new DefaultTableModel();
		dtmGiaoVu.addColumn("Id Giáo Vụ");
		dtmGiaoVu.addColumn("Tên đăng nhập");
		dtmGiaoVu.addColumn("Mật khẩu");
		tblGiaoVu = new JTable(dtmGiaoVu);
		JScrollPane scTable1 = new JScrollPane(tblGiaoVu,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnGiaoVu.add(scTable1,BorderLayout.CENTER);

		JPanel pnIdGiaoVu = new JPanel();
		pnIdGiaoVu.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblGiaoVuId = new JLabel("Id Giáo Vụ :");
		txtIdGiaoVu = new JTextField(20);
		JLabel lblUserNameGiaoVu = new JLabel("Tên đăng nhập :");
		txtGiaoVuName = new JTextField(20);
		JLabel lblPasswordGiaoVu = new JLabel("Mật khẩu :");
		txtGiaoVuPass = new JTextField(20);
		pnIdGiaoVu.add(lblGiaoVuId);
		pnIdGiaoVu.add(txtIdGiaoVu);
		pnIdGiaoVu.add(lblUserNameGiaoVu);
		pnIdGiaoVu.add(txtGiaoVuName);
		pnIdGiaoVu.add(lblPasswordGiaoVu);
		pnIdGiaoVu.add(txtGiaoVuPass);
		pnGiaoVu.add(pnIdGiaoVu);

		JPanel pnButtonGiaoVu = new JPanel();
		pnButtonGiaoVu.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnThemGiaoVu = new JButton("Thêm",new ImageIcon("images/new.png"));
		btnSuaGiaoVu = new JButton("Sửa",new ImageIcon("images/edit.png"));
		btnXoaGiaoVu = new JButton("Xóa",new ImageIcon("images/remove.png"));
		btnThoatGiaoVu = new JButton("Thoát",new ImageIcon("images/exit.png"));
		pnButtonGiaoVu.add(btnThemGiaoVu);
		pnButtonGiaoVu.add(btnSuaGiaoVu);
		pnButtonGiaoVu.add(btnXoaGiaoVu);
		pnButtonGiaoVu.add(btnThoatGiaoVu);
		pnGiaoVu.add(pnButtonGiaoVu);




		// JTablePanel Giao Vien
		JPanel pnGiaoVien = new JPanel();
		jtpManager.add("Tài Khoản Giáo Viên", pnGiaoVien);
		pnGiaoVien.setLayout(new BoxLayout(pnGiaoVien, BoxLayout.Y_AXIS));
		dtmGiaoVien = new DefaultTableModel();
		dtmGiaoVien.addColumn("Id Giáo Viên");
		dtmGiaoVien.addColumn("Tên đăng nhập");
		dtmGiaoVien.addColumn("Mật khẩu");

		tblGiaoVien = new JTable(dtmGiaoVien);
		JScrollPane scTable2 = new JScrollPane(tblGiaoVien,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnGiaoVien.add(scTable2,BorderLayout.CENTER);

		JPanel pnIdGiaoVien = new JPanel();
		pnIdGiaoVien.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblGiaoVienId = new JLabel("Id Giao Vien :");
		txtIdGiaoVien = new JTextField(20);
		JLabel lblUserNameGiaoVien = new JLabel("Tên đăng nhập:");
		txtGiaoVienName = new JTextField(20);
		JLabel lblPasswordGiaoVien = new JLabel("Mật khẩu :");
		txtGiaoVienPass = new JTextField(20);
		pnIdGiaoVien.add(lblGiaoVienId);
		pnIdGiaoVien.add(txtIdGiaoVien);
		pnIdGiaoVien.add(lblUserNameGiaoVien);
		pnIdGiaoVien.add(txtGiaoVienName);
		pnIdGiaoVien.add(lblPasswordGiaoVien);
		pnIdGiaoVien.add(txtGiaoVienPass);
		pnGiaoVien.add(pnIdGiaoVien);

		JPanel pnButtonGiaoVien = new JPanel();
		pnButtonGiaoVien.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnThemGiaoVien = new JButton("Thêm",new ImageIcon("images/new.png"));
		btnThemGiaoVien.setEnabled(false);
		btnSuaGiaoVien = new JButton("Sửa",new ImageIcon("images/edit.png"));
		btnXoaGiaoVien = new JButton("Xóa",new ImageIcon("images/remove.png"));
		btnXoaGiaoVien.setEnabled(false);
		btnThoatGiaoVien = new JButton("Thoát",new ImageIcon("images/exit.png"));
		pnButtonGiaoVien.add(btnThemGiaoVien);
		pnButtonGiaoVien.add(btnSuaGiaoVien);
		pnButtonGiaoVien.add(btnXoaGiaoVien);
		pnButtonGiaoVien.add(btnThoatGiaoVien);
		pnGiaoVien.add(pnButtonGiaoVien);

	}

	public void showWindow() {
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
