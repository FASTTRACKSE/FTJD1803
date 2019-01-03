package fasttrackse.vn.edu.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

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

	JTextField txtMaSinhVien,txtHoTen,txtDiemTb;
	JComboBox cbMaLop;

	JDateChooser dcNgaySinh;

	DefaultTableModel dtmSinhVien;
	JTable tblSinhVien;

	DefaultMutableTreeNode root;
	JTree treeLop;

	JPopupMenu popupMenu;
	JMenuItem menuItemThem,menuItemSua,menuItemXoa;

	JButton btnThem,btnSua,btnXoa,btnThoat;

	
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
		if(lopHocService==null) 
			lopHocService = new LopHocService();
			dsLopHoc = lopHocService.layToanBoDanhSachLopHoc();
			root.removeAllChildren();
			for(LopHoc lh:	dsLopHoc) {
				DefaultMutableTreeNode nodelLop = new DefaultMutableTreeNode(lh);
				root.add(nodelLop);
			}
			treeLop.expandRow(0);
	}

	private void addControls() {
		// TODO Auto-generated method stub
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
		pnTopOfRight.setPreferredSize(new Dimension(0, 300));
		JPanel pnBottomOfRight = new JPanel();
		JSplitPane spSinhVien = new JSplitPane(JSplitPane.VERTICAL_SPLIT,pnTopOfRight,pnBottomOfRight);
		pnRight.add(spSinhVien,BorderLayout.CENTER);

		dtmSinhVien = new DefaultTableModel();
		dtmSinhVien.addColumn("Ma Sinh Vien");
		dtmSinhVien.addColumn("Ho va ten");
		dtmSinhVien.addColumn("Ngay sinh");
		dtmSinhVien.addColumn("Diem trung binh");
		dtmSinhVien.addColumn("Ma lop");
		tblSinhVien = new JTable(dtmSinhVien);
		JScrollPane scTableSinhVien = new JScrollPane
				(tblSinhVien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnTopOfRight.add(scTableSinhVien,BorderLayout.CENTER);

		pnBottomOfRight.setLayout(new BoxLayout(pnBottomOfRight, BoxLayout.Y_AXIS));
		JPanel pnMaSinhVien = new JPanel();
		pnMaSinhVien.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMaSinhVien = new JLabel("Mã sinh viên :");
		txtMaSinhVien = new JTextField(30);
		pnMaSinhVien.add(lblMaSinhVien);
		pnMaSinhVien.add(txtMaSinhVien);
		pnBottomOfRight.add(pnMaSinhVien);

		JPanel pnHoten = new JPanel();
		pnHoten.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblHoTen = new JLabel("Ho va ten :");
		txtHoTen = new JTextField(30);
		pnHoten.add(lblHoTen);
		pnHoten.add(txtHoTen);
		pnBottomOfRight.add(pnHoten);


		JPanel pnNgaySinh = new JPanel();
		pnNgaySinh.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblNgaySinh = new JLabel("Ngay sinh :");
		dcNgaySinh = new JDateChooser();
		dcNgaySinh.setPreferredSize(new Dimension(100, 20));
		pnNgaySinh.add(lblNgaySinh);
		pnNgaySinh.add(dcNgaySinh);
		pnBottomOfRight.add(pnNgaySinh);

		JPanel pnDiemTb = new JPanel();
		pnDiemTb.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblDiemTb = new JLabel("Diem trung binh :");
		txtDiemTb = new JTextField(30);
		pnDiemTb.add(lblDiemTb);
		pnDiemTb.add(txtDiemTb);
		pnBottomOfRight.add(pnDiemTb);

		JPanel pnMaLop = new JPanel();
		pnMaLop.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMaLop = new JLabel("Ma lop :");
		cbMaLop = new JComboBox<>();
		cbMaLop.setPreferredSize(new Dimension(100, 20));
		pnMaLop.add(lblMaLop);
		pnMaLop.add(cbMaLop);
		pnBottomOfRight.add(pnMaLop);

		lblMaLop.setPreferredSize(lblDiemTb.getPreferredSize());
		lblHoTen.setPreferredSize(lblDiemTb.getPreferredSize());
		lblMaSinhVien.setPreferredSize(lblDiemTb.getPreferredSize());
		lblDiemTb.setPreferredSize(lblDiemTb.getPreferredSize());
		lblNgaySinh.setPreferredSize(lblDiemTb.getPreferredSize());

		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnThem = new JButton("Thêm");
		btnSua = new JButton("Sửa");
		btnXoa = new JButton("Xóa");
		btnThoat = new JButton("Thoát");
		pnButton.add(btnThem);
		pnButton.add(btnSua);
		pnButton.add(btnXoa);
		pnButton.add(btnThoat);
		pnBottomOfRight.add(pnButton);

		btnThem.setIcon(new ImageIcon("images/new.png"));
		btnSua.setIcon(new ImageIcon("images/edit.png"));
		btnXoa.setIcon(new ImageIcon("images/remove.png"));
		btnThoat.setIcon(new ImageIcon("images/exit.png"));

		setUpMenu();

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
				
			}
		});
	}
	
	private void setUpMenu() {
		menuItemThem = new JMenuItem("Them lop moi");
		menuItemThem.setIcon(new ImageIcon("images/new.png"));
		menuItemSua = new JMenuItem("Sua lop moi");
		menuItemSua.setIcon(new ImageIcon("images/edit.png"));
		menuItemXoa = new JMenuItem("Xoa lop moi");
		menuItemXoa.setIcon(new ImageIcon("images/remove.png"));
		popupMenu = new JPopupMenu();
		popupMenu.add(menuItemThem);
		popupMenu.add(menuItemSua);
		popupMenu.addSeparator();
		popupMenu.add(menuItemXoa);
	}

	public void showWindow() {

		this.setSize(1000, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
