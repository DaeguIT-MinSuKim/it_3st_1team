package kr.or.dgit.it_3st_1team.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.it_3st_1team.dto.Employee;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.EmployeeService;
import kr.or.dgit.it_3st_1team.service.UserService;
import kr.or.dgit.it_3st_1team.ui.join.IDPWsearchUI;

@SuppressWarnings("serial")
public class LoginUI extends JFrame implements MouseListener, ActionListener, FocusListener {

	private JPanel contentPane;
	private JTextField tfID;
	private JPasswordField pwtf;
	private IDPanel idpanel = new IDPanel();
	private PwPanel pwpanel = new PwPanel();
	private JLabel label;
	private JButton btnUserLogin;
	private JButton btnMngLogin;
	public static User LOGINUSER;
	public static Employee LOGINEMP;
	private StartUI staui;

	public LoginUI(StartUI staui) {
		this.staui = staui;
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		idpanel.setBounds(70, 37, 50, 50);
		contentPane.add(idpanel);
		
		pwpanel.setBounds(70, 110, 50, 50);
		contentPane.add(pwpanel);
		
		tfID = new JTextField();
		tfID.addMouseListener(this);
		tfID.setForeground(new Color(94, 94, 94));
		tfID.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfID.setColumns(10);
		tfID.setBorder(new CompoundBorder(null, new EmptyBorder(0, 20, 0, 0)));
		tfID.setBounds(160, 36, 200, 50);
		contentPane.add(tfID);
		
		pwtf = new JPasswordField();
		pwtf.addActionListener(this);
		pwtf.addFocusListener(this);
		pwtf.setText("****");
		pwtf.setBorder(new CompoundBorder(null, new EmptyBorder(0, 20, 0, 0)));
		pwtf.setBounds(160, 108, 200, 50);
		contentPane.add(pwtf);
		
		label = new JLabel("아이디 / 비밀번호 찾기");
		label.addMouseListener(this);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		label.setBounds(248, 224, 174, 27);
		contentPane.add(label);
				
		btnUserLogin = new JButton("회원 로그인");
		btnUserLogin.addActionListener(this);
		btnUserLogin.setBorder(null);
		btnUserLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		btnUserLogin.setForeground(new Color(64,64,64));
		btnUserLogin.setBackground(new Color(190,190,190));
		btnUserLogin.setBounds(80, 185, 130, 30);
		contentPane.add(btnUserLogin);
		
		btnMngLogin = new JButton("관리자 로그인");	
		btnMngLogin.addActionListener(this);
		btnMngLogin.setBorder(null);
		btnMngLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		btnMngLogin.setForeground(new Color(64,64,64));
		btnMngLogin.setBackground(new Color(190,190,190));
		btnMngLogin.setBounds(230, 185, 150, 30);
		contentPane.add(btnMngLogin);
	}
	

	class IDPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/id4.png");
		private Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	class PwPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/pw.png");
		private Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == tfID) {
			mouseClickedTfID(e);
		}
		if (e.getSource() == label) {
			mouseClickedLabel(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLabel(MouseEvent e) {
		IDPWsearchUI idpwsearch = new IDPWsearchUI();
		idpwsearch.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pwtf) {
			actionPerformedPwtf(e);
		}
		if (e.getSource() == btnMngLogin) {
			actionPerformedBtnMngLogin(e);
		}
		if (e.getSource() == btnUserLogin) {
			actionPerformedBtnUserLogin(e);
		}
	}
	protected void actionPerformedBtnUserLogin(ActionEvent e) {
		char[] pwchar = pwtf.getPassword();
		String pw = new String(pwchar);
		UserService service = new UserService();
		User user = new User();
		user.setId(tfID.getText());
		user.setPw(pw);
		User selectUser = service.selectIdPw(user);
		if(user.getId().equals(selectUser.getId()) && user.getPw().equals(selectUser.getPw())) {
			LOGINUSER = selectUser;
			UserUI userui = new UserUI(selectUser);
			userui.setBounds(0, 0, 1400, 800);
			userui.lblname.setText((selectUser.getName()));
			staui.changepanel(userui);
			dispose();
		}else {
			JOptionPane.showMessageDialog(null, "아이디, 비밀번호가 올바르지 않습니다.");
		}
	}
	protected void actionPerformedBtnMngLogin(ActionEvent e) {
		char[] pwchar = pwtf.getPassword();
		String pw = new String(pwchar);
		JOptionPane.showMessageDialog(null, pw);
		EmployeeService service = new EmployeeService();
		Employee emp = new Employee();
		emp.setId(tfID.getText());
		emp.setPw(pw);
		Employee selectEmp = service.selectIdPw(emp);
		if(emp.getId().equals(selectEmp.getId()) && emp.getPw().equals(selectEmp.getPw())) {
			LOGINEMP = selectEmp;
			ManagerUI empui = new ManagerUI(selectEmp);
			empui.setBounds(0, 0, 1400, 800);
			empui.lblname.setText((selectEmp.getName()));
			staui.changepanel(empui);
			dispose();
		}else {
			JOptionPane.showMessageDialog(null, "아이디, 비밀번호가 올바르지 않습니다.");
		}
	}
	protected void mouseClickedTfID(MouseEvent e) {
		tfID.setText("");
	}
	public void focusGained(FocusEvent e) {
		if (e.getSource() == pwtf) {
			focusGainedPwtf(e);
		}
	}
	public void focusLost(FocusEvent e) {
	}
	protected void focusGainedPwtf(FocusEvent e) {
		pwtf.setText("");
	}
	protected void actionPerformedPwtf(ActionEvent e) {
		actionPerformedBtnUserLogin(e);
	}
}
