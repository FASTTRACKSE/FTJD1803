package fasttrackse.vn.edu.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Vector;

import javax.jws.Oneway;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

import com.toedter.calendar.JDateChooser;

import fasttrackse.vn.edu.model.LopHoc;
import fasttrackse.vn.edu.model.SinhVien;
import fasttrackse.vn.edu.service.LopHocService;
import fasttrackse.vn.edu.service.SinhVienService;

public class MainUI extends JFrame{
	
	JTextField txtMaSinhVien,txtTenSinhVien,txtDiemTrungBinh;
	
	DefaultTableModel dtmSinhVien;
	JTable tblSinhVien;
	
	DefaultMutableTreeNode root;
	JTree treeLop;
	
	JDateChooser dcNgaySinh;
	
	JComboBox comboBoxMaLop;
	
	JButton btnThem,btnLuu,btnXoa;
	
	JPopupMenu popupMenu;
	JMenuItem menuItemThem,menuItemSua,menuItemXoa;
	
	ArrayList<LopHoc> dsLopHoc;
	LopHocService lopHocService;
	
	ArrayList<SinhVien> dsSinhVien;
	SinhVienService svService;
	
	LopHoc selectedLop;
	
	public MainUI(String titles) {
		super(titles);
		addControls();
		addEvents();
		
		hienThiToanBoLopHocLenCay();
	}

	private void hienThiToanBoLopHocLenCay() {
		// TODO Auto-generated method stub
		if(lopHocService==null)
			lopHocService = new LopHocService();
		dsLopHoc = lopHocService.layToanBoDanhSachLopHoc();
		for(LopHoc lopHoc:dsLopHoc) {
			DefaultMutableTreeNode nodeLop = new DefaultMutableTreeNode(lopHoc);
			root.add(nodeLop);
		}
		treeLop.expandRow(0);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		treeLop.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.isPopupTrigger()) {
					int row = treeLop.getClosestRowForLocation(e.getX(), e.getY());
					treeLop.setSelectionRow(row);
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}
				
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
			DefaultMutableTreeNode nodeSelect =	(DefaultMutableTreeNode) treeLop.getLastSelectedPathComponent();
			if(nodeSelect==null)
				return;
			if(nodeSelect.getLevel()==0) return;
				if(svService==null)
					svService = new SinhVienService();
				selectedLop = (LopHoc) nodeSelect.getUserObject();
				if(selectedLop!=null)
					dsSinhVien = svService.layToanBoSinhVienTheoMaLop(selectedLop.getMaLop());
				hienThiToanBoSinhVienLenTable();
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
				SinhVien sv = dsSinhVien.get(row);
				txtMaSinhVien.setText(String.valueOf(sv.getMaSinhVien()));
				txtTenSinhVien.setText(sv.getHoTen());
				dcNgaySinh.setDate(sv.getNgaySinh());
				txtDiemTrungBinh.setText(String.valueOf(sv.getDiemTb()));
				comboBoxMaLop.setSelectedItem(sv.getMaLop());
				
			}
		});
		
	}

	protected void hienThiToanBoSinhVienLenTable() {
		// TODO Auto-generated method stub
		dtmSinhVien.setRowCount(0);
		for(SinhVien sv : dsSinhVien) {
			Vector<Object> vc = new Vector<Object>();
			vc.add(sv.getMaSinhVien());
			vc.add(sv.getHoTen());
			vc.add(sv.getNgaySinh());
			vc.add(sv.getDiemTb());
			vc.add(sv.getMaLop());
			dtmSinhVien.addRow(vc);
		}
	}

	private void addControls() {
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		JPanel pnLeft = new JPanel();
		pnLeft.setPreferredSize(new Dimension(300, 0));
		JPanel pnRight = new JPanel();
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pnLeft,pnRight);
		container.add(sp,BorderLayout.CENTER);
		
		pnLeft.setLayout(new BorderLayout());
		root = new DefaultMutableTreeNode("Danh Sách Lớp");
		treeLop = new JTree(root);
		JScrollPane scTree = new JScrollPane
				(treeLop,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnLeft.add(scTree,BorderLayout.CENTER);
		
		pnRight.setLayout(new BorderLayout());
		JPanel pnTopOfRight = new JPanel();
		pnTopOfRight.setLayout(new BorderLayout());
		pnTopOfRight.setPreferredSize(new Dimension(0, 400));
		JPanel pnBottomOfRight = new JPanel();
		JSplitPane spSinhVien = new JSplitPane(JSplitPane.VERTICAL_SPLIT,pnTopOfRight,pnBottomOfRight);
		pnRight.add(spSinhVien,BorderLayout.CENTER);
		
		dtmSinhVien = new DefaultTableModel();
		dtmSinhVien.addColumn("Mã sinh vien");
		dtmSinhVien.addColumn("Họ và tên");
		dtmSinhVien.addColumn("Ngày sinh");
		dtmSinhVien.addColumn("Điểm trung bình");
		dtmSinhVien.addColumn("Mã lớp");
		tblSinhVien = new JTable(dtmSinhVien);
		JScrollPane spTableSinhvien = new JScrollPane
				(tblSinhVien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnTopOfRight.add(spTableSinhvien,BorderLayout.CENTER);
		
		
		pnBottomOfRight.setLayout(new BoxLayout(pnBottomOfRight, BoxLayout.Y_AXIS));
		JPanel pnMaSinhVien = new JPanel();
		pnMaSinhVien.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMaSinhVien = new JLabel("Mã sinh viên :");
		txtMaSinhVien = new JTextField(30);
		pnMaSinhVien.add(lblMaSinhVien);
		pnMaSinhVien.add(txtMaSinhVien);
		pnBottomOfRight.add(pnMaSinhVien);
		
		JPanel pnTenSinhVien = new JPanel();
		pnTenSinhVien.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTenSinhVien = new JLabel("Tên sinh viên :");
		txtTenSinhVien = new JTextField(30);
		pnTenSinhVien.add(lblTenSinhVien);
		pnTenSinhVien.add(txtTenSinhVien);
		pnBottomOfRight.add(pnTenSinhVien);
		
		JPanel pnNgaySinh = new JPanel();
		pnNgaySinh.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblNgaySinh = new JLabel("Ngày sinh :");
		dcNgaySinh = new JDateChooser();
		dcNgaySinh.setPreferredSize(new Dimension(150, 20));
		pnNgaySinh.add(lblNgaySinh);
		pnNgaySinh.add(dcNgaySinh);
		pnBottomOfRight.add(pnNgaySinh);
		
		JPanel pnDiemTb = new JPanel();
		pnDiemTb.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblDiemTb = new JLabel("Điểm trung bình :");
		txtDiemTrungBinh = new JTextField(30);
		pnDiemTb.add(lblDiemTb);
		pnDiemTb.add(txtDiemTrungBinh);
		pnBottomOfRight.add(pnDiemTb);
		
		JPanel pnMaLop = new JPanel();
		pnMaLop.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMaLop = new JLabel("Mã lớp :");
		comboBoxMaLop = new JComboBox<>();
		comboBoxMaLop.setPreferredSize(new Dimension(150, 20));
		pnMaLop.add(lblMaLop);
		pnMaLop.add(comboBoxMaLop);
		pnBottomOfRight.add(pnMaLop);
		
		
		lblMaSinhVien.setPreferredSize(lblDiemTb.getPreferredSize());
		lblTenSinhVien.setPreferredSize(lblDiemTb.getPreferredSize());
		lblNgaySinh.setPreferredSize(lblDiemTb.getPreferredSize());
		lblMaLop.setPreferredSize(lblDiemTb.getPreferredSize());
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnThem = new JButton("Thêm");
		btnLuu = new JButton("Lưu");
		btnXoa = new JButton("Xóa");
		pnButton.add(btnThem);
		pnButton.add(btnLuu);
		pnButton.add(btnXoa);
		pnBottomOfRight.add(pnButton);
		
		btnThem.setIcon(new ImageIcon("images/create.png"));
		btnLuu.setIcon(new ImageIcon("images/save.png"));
		btnXoa.setIcon(new ImageIcon("images/exit.png"));
		
		setupMenuItem();
	}
	
	private void setupMenuItem() {
		// TODO Auto-generated method stub
		menuItemThem = new JMenuItem("Thêm lớp mới");
		menuItemThem.setIcon(new ImageIcon("images/new.png"));
		menuItemSua = new JMenuItem("Sửa lớp");
		menuItemSua.setIcon(new ImageIcon("images/save1.png"));
		menuItemXoa = new JMenuItem("Xóa lớp");
		menuItemXoa.setIcon(new ImageIcon("images/remove.png"));
		popupMenu = new JPopupMenu();
		popupMenu.add(menuItemThem);
		popupMenu.add(menuItemSua);
		popupMenu.addSeparator();
		popupMenu.add(menuItemXoa);
	}

	public void showWindow() {
		this.setSize(800, 800);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
