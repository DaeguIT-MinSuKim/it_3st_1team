package kr.or.dgit.it_3st_1team.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.it_3st_1team.ui.join.IDPWsearchUI;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class LoginUI extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private IDPanel idpanel = new IDPanel();
	private PwPanel pwpanel = new PwPanel();
	private JLabel label;

	public LoginUI() {
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
		
		textField = new JTextField();
		textField.setText("User Id");
		textField.setForeground(new Color(94, 94, 94));
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new CompoundBorder(null, new EmptyBorder(0, 20, 0, 0)));
		textField.setBounds(160, 36, 200, 50);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setText("****");
		passwordField.setBorder(new CompoundBorder(null, new EmptyBorder(0, 20, 0, 0)));
		passwordField.setBounds(160, 108, 200, 50);
		contentPane.add(passwordField);
		
		label = new JLabel("아이디 / 비밀번호 찾기");
		label.addMouseListener(this);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		label.setBounds(248, 224, 174, 27);
		contentPane.add(label);
		
		JButton button = new JButton("회원 로그인");
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		button.setBorder(null);
		button.setBackground(new Color(190, 190, 190));
		button.setBounds(141, 184, 130, 30);
		contentPane.add(button);
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
}
