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

import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.UserService;
import kr.or.dgit.it_3st_1team.ui.join.IDPWsearchUI;
import kr.or.dgit.it_3st_1team.ui.join.JoinUI;
import kr.or.dgit.it_3st_1team.ui.user.VisitorUI;


@SuppressWarnings("serial")
public class StartUI extends JFrame implements ActionListener, MouseListener, FocusListener{
	private JPanel contentPane;
	private MyPanel bgpanel = new MyPanel();
	private IDPanel idpanel = new IDPanel();
	private PwPanel pwpanel = new PwPanel();
	public JTextField tfId;
	private JButton btnUserLogin;
	public JPasswordField pwtf;
	private JButton btnMngLogin;
	private JButton btnjoin;
	private JButton btnSearch;
	private JLabel lblNewLabel;
	public static User LOGINUSER;

	public StartUI() {
		initComponents();
	}
	private void initComponents() {
		setTitle("도서 관리 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1420, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bgpanel.setBounds(0, 0, 1000, 800);
		contentPane.add(bgpanel);
		
		idpanel.setBounds(1050, 200, 50, 50);
		contentPane.add(idpanel);
		
		pwpanel.setBounds(1050, 270, 50, 50);
		contentPane.add(pwpanel);
		
		btnUserLogin = new JButton("회원 로그인");
		btnUserLogin.addActionListener(this);
		btnUserLogin.setBorder(null);
		btnUserLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		btnUserLogin.setForeground(new Color(64,64,64));
		btnUserLogin.setBackground(new Color(190,190,190));
		btnUserLogin.setBounds(1040, 350, 130, 30);
		contentPane.add(btnUserLogin);
		
		btnMngLogin = new JButton("관리자 로그인");
		btnMngLogin.addActionListener(this);
		
		tfId = new JTextField();
		tfId.addMouseListener(this);
		tfId.setBorder(new CompoundBorder(null, new EmptyBorder(0, 20, 0, 0)));
		tfId.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfId.setForeground(new Color(94,94,94));
		tfId.setBounds(1100, 200, 200, 50);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		
		btnMngLogin.setBorder(null);
		btnMngLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		btnMngLogin.setForeground(new Color(64,64,64));
		btnMngLogin.setBackground(new Color(190,190,190));
		btnMngLogin.setBounds(1182, 350, 150, 30);
		contentPane.add(btnMngLogin);
		
		btnSearch = new JButton("도서 검색");
		btnSearch.addActionListener(this);
		btnSearch.setBorder(null);
		btnSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		btnSearch.setBackground(new Color(94, 94, 94));
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setBounds(1031, 427, 318, 30);
		contentPane.add(btnSearch);
		
		pwtf = new JPasswordField();
		pwtf.addActionListener(this);
		pwtf.addFocusListener(this);
		pwtf.setBorder(new CompoundBorder(null, new EmptyBorder(0, 20, 0, 0)));
		pwtf.setText("bomi");
		pwtf.setBounds(1100, 270, 200, 50);
		contentPane.add(pwtf);
		
		btnjoin = new JButton("회원가입");
		btnjoin.addActionListener(this);
		btnjoin.setForeground(new Color(255, 255, 255));
		btnjoin.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		btnjoin.setBorder(null);
		btnjoin.setBackground(new Color(204, 51, 102));
		btnjoin.setBounds(1122, 477, 130, 30);
		contentPane.add(btnjoin);
		
		lblNewLabel = new JLabel("아이디 / 비밀번호 찾기");
		lblNewLabel.addMouseListener(this);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lblNewLabel.setBounds(1175, 390, 174, 27);
		contentPane.add(lblNewLabel);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/main.jpg");
		private Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
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
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pwtf) {
			actionPerformedPwtf(e);
		}
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
		if (e.getSource() == btnjoin) {
			actionPerformedBtnjoin(e);
		}
		if (e.getSource() == btnMngLogin) {
			actionPerformedBtnMngLogin(e);
		}
		if (e.getSource() == btnUserLogin) {
			actionPerformedBtnUserLogin(e);
		}
	}
	protected void actionPerformedBtnUserLogin(ActionEvent e) {
		UserService service = new UserService();
		User user = new User();
		user.setId(tfId.getText());
		user.setPw(pwtf.getText());
		User selectUser = service.selectIdPw(user);
		if(user.getId().equals(selectUser.getId()) && user.getPw().equals(selectUser.getPw())) {
			contentPane.removeAll();
			LOGINUSER = selectUser;
			UserUI userui = new UserUI(selectUser);
			userui.setBounds(0, 0, 1400, 800);
			userui.lblname.setText((selectUser.getName()));
			contentPane.add(userui);
			contentPane.repaint();
			contentPane.revalidate();
			repaint();
			revalidate();
		}else {
			JOptionPane.showMessageDialog(null, "아이디, 비밀번호가 올바르지 않습니다.");
		}
	}
	protected void actionPerformedBtnMngLogin(ActionEvent e) {
		contentPane.removeAll();
		ManagerUI mng = new ManagerUI();
		mng.setBounds(0, 0, 1400, 800);
		contentPane.add(mng);
		contentPane.repaint();
	}
	protected void actionPerformedBtnjoin(ActionEvent e) {
		JoinUI frame = new JoinUI();
		frame.setVisible(true);
	}
	protected void actionPerformedBtnSearch(ActionEvent e) {
		contentPane.removeAll();
		VisitorUI vis = new VisitorUI();
		vis.setBounds(0, 0, 1400, 800);
		contentPane.add(vis);
		contentPane.repaint();
		contentPane.revalidate();
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == tfId) {
			mouseClickedTfId(e);
		}
		if (e.getSource() == lblNewLabel) {
			mouseClickedLblNewLabel(e);
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
	protected void mouseClickedLblNewLabel(MouseEvent e) {		
		IDPWsearchUI idpwsearch = new IDPWsearchUI();
		idpwsearch.setVisible(true);
	}
	protected void mouseClickedTfId(MouseEvent e) {
		tfId.setText("");
	}
	public void focusGained(FocusEvent e) {
		if (e.getSource() == pwtf) {
			focusGainedPwdBomi(e);
		}
	}
	public void focusLost(FocusEvent e) {
	}
	protected void focusGainedPwdBomi(FocusEvent e) {
		pwtf.setText("");
	}
	protected void actionPerformedPwtf(ActionEvent e) {
		actionPerformedBtnUserLogin(e);
	}
}
