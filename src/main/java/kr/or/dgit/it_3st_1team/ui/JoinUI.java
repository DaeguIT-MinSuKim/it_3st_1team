package kr.or.dgit.it_3st_1team.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class JoinUI extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfId;
	private JPasswordField pwfPw;
	private JPasswordField pwfPwc;
	private JTextField tfPhone;
	private JTextField tfMail;
	private JButton btnJoin;
	private JButton btnCancel;
	private JButton btnIdc;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnSearchAddr;
	private JLabel label;
	private JLabel label_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinUI frame = new JoinUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JoinUI() {
		initComponents();
	}
	private void initComponents() {
		setTitle("회원 가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 630, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblName.setBounds(20, 25, 120, 40);
		contentPane.add(lblName);
		
		JLabel lblId = new JLabel("아이디");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblId.setBounds(20, 65, 120, 40);
		contentPane.add(lblId);
		
		JLabel lblPw = new JLabel("비밀번호");
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPw.setBounds(20, 105, 120, 40);
		contentPane.add(lblPw);
		
		JLabel lblPwc = new JLabel("비밀번호 확인");
		lblPwc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPwc.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPwc.setBounds(20, 145, 120, 40);
		contentPane.add(lblPwc);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPhone.setBounds(20, 185, 120, 40);
		contentPane.add(lblPhone);
		
		JLabel lblMail = new JLabel("이메일");
		lblMail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMail.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblMail.setBounds(20, 225, 120, 40);
		contentPane.add(lblMail);
		
		JLabel lblAddr = new JLabel("우편번호");
		lblAddr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddr.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblAddr.setBounds(20, 265, 120, 40);
		contentPane.add(lblAddr);
		
		label = new JLabel("주소");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label.setBounds(20, 305, 120, 40);
		contentPane.add(label);
		
		label_1 = new JLabel("상세주소");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label_1.setBounds(20, 345, 120, 40);
		contentPane.add(label_1);
		
		tfName = new JTextField();
		tfName.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfName.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfName.setBounds(150, 30, 120, 30);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfId = new JTextField();
		tfId.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfId.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfId.setBounds(150, 70, 150, 30);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		pwfPw = new JPasswordField();
		pwfPw.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		pwfPw.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		pwfPw.setBounds(150, 110, 150, 30);
		contentPane.add(pwfPw);
		
		pwfPwc = new JPasswordField();
		pwfPwc.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		pwfPwc.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		pwfPwc.setBounds(150, 150, 150, 30);
		contentPane.add(pwfPwc);
		
		tfPhone = new JTextField();
		tfPhone.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfPhone.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfPhone.setBounds(150, 190, 120, 30);
		contentPane.add(tfPhone);
		tfPhone.setColumns(10);
		
		tfMail = new JTextField();
		tfMail.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfMail.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfMail.setBounds(150, 230, 200, 30);
		contentPane.add(tfMail);
		tfMail.setColumns(10);
		
		textField = new JTextField();
		textField.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField.setBounds(150, 270, 120, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		textField_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField_1.setBounds(150, 310, 400, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		textField_2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(150, 350, 400, 30);
		contentPane.add(textField_2);
		
		btnJoin = new JButton("회원가입");
		btnJoin.setBorder(null);
		btnJoin.setForeground(new Color(64,64,64));
		btnJoin.setBackground(new Color(190,190,190));
		btnJoin.setBounds(170, 410, 97, 30);
		contentPane.add(btnJoin);
		
		btnCancel = new JButton("취소");
		btnCancel.setBorder(null);
		btnCancel.setForeground(new Color(64,64,64));
		btnCancel.setBackground(new Color(190,190,190));
		btnCancel.setBounds(310, 410, 97, 30);
		contentPane.add(btnCancel);
		
		btnIdc = new JButton("중복확인");
		btnIdc.setBorder(null);
		btnIdc.setForeground(new Color(64,64,64));
		btnIdc.setBackground(new Color(190,190,190));
		btnIdc.setBounds(310, 70, 80, 30);
		contentPane.add(btnIdc);
		
		btnSearchAddr = new JButton("주소찾기");
		btnSearchAddr.setBorder(null);
		btnSearchAddr.setForeground(new Color(64,64,64));
		btnSearchAddr.setBackground(new Color(190,190,190));
		btnSearchAddr.setBounds(280, 270, 90, 30);
		contentPane.add(btnSearchAddr);
	}
}
