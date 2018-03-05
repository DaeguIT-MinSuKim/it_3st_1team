package kr.or.dgit.it_3st_1team.ui.join;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class PWsearchdetailUI extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField2;
	private JPasswordField passwordField1;

	public PWsearchdetailUI() {
		initComponents();
	}
	private void initComponents() {
		setTitle("비밀번호 변경");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPw = new JLabel("비밀번호");
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPw.setBounds(22, 36, 130, 40);
		contentPane.add(lblPw);
		
		passwordField1 = new JPasswordField();
		passwordField1.setText("****");
		passwordField1.setBorder(new CompoundBorder(null, new EmptyBorder(0, 20, 0, 0)));
		passwordField1.setBounds(198, 44, 171, 30);
		contentPane.add(passwordField1);
		
		JLabel lblPwc = new JLabel("비밀번호 확인");
		lblPwc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPwc.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPwc.setBounds(22, 96, 130, 40);
		contentPane.add(lblPwc);
		
		passwordField2 = new JPasswordField();
		passwordField2.setText("****");
		passwordField2.setBorder(new CompoundBorder(null, new EmptyBorder(0, 20, 0, 0)));
		passwordField2.setBounds(198, 102, 171, 30);
		contentPane.add(passwordField2);
		
		JButton btnOk = new JButton("확인");
		btnOk.setForeground(Color.DARK_GRAY);
		btnOk.setBorder(null);
		btnOk.setBackground(new Color(190, 190, 190));
		btnOk.setBounds(312, 155, 85, 30);
		contentPane.add(btnOk);
	}

}
