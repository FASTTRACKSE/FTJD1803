package fasttrackse.vn.edu.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import fasttrackse.vn.edu.model.Login;
import fasttrackse.vn.edu.service.LoginService;

public class LoginUI extends JFrame{
	
	JTextField txtUserName;
	JPasswordField txtPassword;
	JButton btnLogin,btnExit;
	JCheckBox chkSave;
	
	public LoginUI(String titles) {
		super(titles);
		addcontrols();
		addEvents();
	}

	private void addcontrols() {
		// TODO Auto-generated method stub
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		JPanel pnNorth = new JPanel();
		container.add(pnNorth,BorderLayout.NORTH);
		JPanel pnCenter = new JPanel();
		container.add(pnCenter,BorderLayout.CENTER);
		JPanel pnSouth = new JPanel();
		container.add(pnSouth,BorderLayout.SOUTH);
		
		JLabel lblTitle = new JLabel("Login System");
		lblTitle.setFont(new Font("tahoma", Font.BOLD,20));
		lblTitle.setForeground(Color.RED);
		pnNorth.add(lblTitle);
		
		pnCenter.setLayout(new BorderLayout());
		JPanel pnImage = new JPanel();
		JLabel lblIcon = new JLabel(new ImageIcon("images/account1.png"));
		pnImage.add(lblIcon);
		pnCenter.add(pnImage,BorderLayout.WEST);
		
		JPanel pnUser= new JPanel();
		pnUser.setLayout(new BoxLayout(pnUser, BoxLayout.Y_AXIS));
		pnCenter.add(pnUser,BorderLayout.CENTER);
		
		JPanel pnUserName = new JPanel();
		pnUserName.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblUserName = new JLabel("User name :");
		txtUserName = new JTextField(20);
		pnUserName.add(lblUserName);
		pnUserName.add(txtUserName);
		pnUser.add(pnUserName);
		
		JPanel pnPassword = new JPanel();
		pnPassword.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblPassword = new JLabel("Password :");
		txtPassword = new JPasswordField(20);
		pnPassword.add(lblPassword);
		pnPassword.add(txtPassword);
		pnUser.add(pnPassword);
		
		JPanel pnSave = new JPanel();
		chkSave = new JCheckBox("Save login");
		pnSave.add(chkSave);
		pnUser.add(pnSave);
		
		btnLogin = new JButton("Login");
		btnExit = new JButton("Exit");
		pnSouth.add(btnLogin);
		pnSouth.add(btnExit);
		
		lblPassword.setPreferredSize(lblUserName.getPreferredSize());
		
		btnLogin.setIcon(new ImageIcon("images/login.png"));
		btnExit.setIcon(new ImageIcon("images/exit.png"));
		
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				handleLogin();
			}
		});
	}
	
	protected void handleLogin() {
		// TODO Auto-generated method stub
		LoginService lgService = new LoginService();
		Login lg = lgService.login(txtUserName.getText(), txtPassword.getText());
		if(lg!=null) {
			dispose();
			AdministratorUI ad = new AdministratorUI("AdministratorUI");
			ad.showWindow();
		}else {
			JOptionPane.showMessageDialog(null, "Login Fail");
		}
		
	}

	public void showWindow() {
		
		this.setSize(500, 280);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
