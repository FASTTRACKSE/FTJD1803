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


import fasttrackse.vn.edu.model.SinhVien;
import fasttrackse.vn.edu.service.SinhVienService;

public class QuanLySinhVienUI extends JFrame{
	
	JTextField txtMaSinhVien,txtTenSinhVien,txtTuoi;
	JButton btnLuu,btnMoi,btnXoa,btnThoat;
	
	DefaultTableModel dtmSinhVien;
	JTable tblSinhVien;
	
	ArrayList<SinhVien> dsSinhVien = null;
	
	public QuanLySinhVienUI(String title) {
		super(title);
		addControls();
		addEvents();
		
		hienThiToanBoDanhSachSinhVien();
	}
	private void hienThiToanBoDanhSachSinhVien() {
		// TODO Auto-generated method stub
		SinhVienService sinhVienService = new SinhVienService();
		dsSinhVien = sinhVienService.layToanBoDanhSachSinhVien();
		
		dtmSinhVien.setRowCount(0);
		for(SinhVien sv : dsSinhVien) {
			Vector<Object> vec = new Vector<Object>();
			vec.add(sv.getMaSinhVien());
			vec.add(sv.getTenSinhVien());
			vec.add(sv.getTuoi());
			dtmSinhVien.addRow(vec);
		}
		
	}


	private void addControls() {
		// TODO Auto-generated method stub
		Container con  = getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel pnNorth = new JPanel();
		JPanel pnCenter = new JPanel();
		
		con.add(pnNorth,BorderLayout.NORTH);
		con.add(pnCenter,BorderLayout.CENTER);
		
		pnNorth.setLayout(new BorderLayout());
		JPanel pnChiTiet = new JPanel();
		pnNorth.add(pnChiTiet,BorderLayout.CENTER);
		
		pnChiTiet.setLayout(new BoxLayout(pnChiTiet, BoxLayout.Y_AXIS));
		JPanel pnQuanLySinhVien = new JPanel();
		JLabel lblQuanLySinhVien = new JLabel("Chuong trinh quan ly sinh vien");
		lblQuanLySinhVien.setForeground(Color.BLUE);
		Font font = new Font("arial",Font.BOLD , 20);
		lblQuanLySinhVien.setFont(font);
		pnQuanLySinhVien.add(lblQuanLySinhVien);
		pnChiTiet.add(pnQuanLySinhVien);
		
		JPanel pnMaSinhVien = new JPanel();
		JLabel lblMaSinhVien = new JLabel("Ma sinh vien : ");
		txtMaSinhVien = new JTextField(20);
		pnMaSinhVien.add(lblMaSinhVien);
		pnMaSinhVien.add(txtMaSinhVien);
		pnChiTiet.add(pnMaSinhVien);
		
		JPanel pnTenSinhVien = new JPanel();
		JLabel lblTenSinhVien = new JLabel("Ten sinh vien : ");
		txtTenSinhVien = new JTextField(20);
		pnTenSinhVien.add(lblTenSinhVien);
		pnTenSinhVien.add(txtTenSinhVien);
		pnChiTiet.add(pnTenSinhVien);
		
		JPanel pnTuoi= new JPanel();
		JLabel lblTuoi = new JLabel("Tuoi : ");
		txtTuoi = new JTextField(20);
		pnTuoi.add(lblTuoi);
		pnTuoi.add(txtTuoi);
		pnChiTiet.add(pnTuoi);
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JPanel pnLuu = new JPanel();
		btnLuu = new JButton("Luu");
		pnLuu.add(btnLuu);
		pnButton.add(pnLuu);
		pnChiTiet.add(pnButton);
		
		JPanel pnMoi = new JPanel();
		btnMoi = new JButton("Moi");
		pnMoi.add(btnMoi);
		pnButton.add(pnMoi);
		pnChiTiet.add(pnButton);
		
		JPanel pnXoa = new JPanel();
		btnXoa = new JButton("Xoa");
		pnXoa.add(btnXoa);
		pnButton.add(pnXoa);
		pnChiTiet.add(pnButton);
		
		JPanel pnThoat = new JPanel();
		btnThoat = new JButton("Thoat");
		pnThoat.add(btnThoat);
		pnButton.add(pnThoat);
		pnChiTiet.add(pnButton);
		
		lblTuoi.setPreferredSize(lblMaSinhVien.getPreferredSize());
		
		pnCenter.setLayout(new BorderLayout());
		dtmSinhVien = new DefaultTableModel();
		dtmSinhVien.addColumn("Ma sinh vien");
		dtmSinhVien.addColumn("Ten sinh vien");
		dtmSinhVien.addColumn("Tuoi");
		
		tblSinhVien = new JTable(dtmSinhVien);
		JScrollPane scTable = new JScrollPane(tblSinhVien,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnCenter.add(scTable,BorderLayout.CENTER);
		
		TitledBorder titledBorderDanhSachSinhVien = new TitledBorder
				(BorderFactory.createLineBorder(Color.BLUE),"Danh sach sinh vien");
		pnCenter.setBorder(titledBorderDanhSachSinhVien);
		
	}
	
	private void addEvents() {
		// TODO Auto-generated method stub
		btnMoi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyThemSinhVien();
				hienThiToanBoDanhSachSinhVien();
				tblSinhVien.updateUI();
			}
		});
		
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyXoaSinhVien();
				hienThiToanBoDanhSachSinhVien();
				tblSinhVien.updateUI();
				
			}
		});
		
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				
			}
		});
		
		tblSinhVien.addMouseListener(new MouseListener() {
			
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
				int row = tblSinhVien.getSelectedRow();
				if(row==-1) return;
				SinhVien sv  = dsSinhVien.get(row);
				txtMaSinhVien.setText(sv.getMaSinhVien());
				txtTenSinhVien.setText(sv.getTenSinhVien());
				txtTuoi.setText(sv.getTuoi());
				
			}
		});
	}

	
	protected void xuLyXoaSinhVien() {
		// TODO Auto-generated method stub
		try {
			SinhVien sv = new SinhVien();
			sv.setMaSinhVien(txtMaSinhVien.getText());
			SinhVienService svService = new SinhVienService();
			int x = svService.xuLyXoa(sv);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Xoa thanh cong");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}


	protected void xuLyThemSinhVien() {
		// TODO Auto-generated method stub
		try {
			SinhVien sv = new SinhVien();
			sv.setMaSinhVien(txtMaSinhVien.getText());
			sv.setTenSinhVien(txtTenSinhVien.getText());
			sv.setTuoi(txtTuoi.getText());
			SinhVienService sinhVienService = new SinhVienService();
			int x = sinhVienService.xuLyThem(sv);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Them sinh vien thanh cong");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}


	public void showWindow() {
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
