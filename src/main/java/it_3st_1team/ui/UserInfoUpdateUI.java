package it_3st_1team.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class UserInfoUpdateUI extends JPanel {
	private JTextField tfName;
	private JTextField tfId;
	private JPasswordField pwfPw;
	private JPasswordField pwfPwc;
	private JTextField tfPhone;
	private JTextField tfMail;
	private JButton btnJoin;
	private JButton btnCancel;
	private JTextField tfpostnum;
	private JTextField tfAddr;
	private JTextField tfAddrDe;
	private JButton btnSearchAddr;
	private JLabel lblAddr;
	private JLabel lblAddrDe;
	private JLabel label;

	public UserInfoUpdateUI() {

		initComponents();
	}
	private void initComponents() {
		setBackground(new Color(224,224,224));
		
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224,224,224));
		panel.setBounds(130, 100, 950, 528);
		add(panel);
		panel.setLayout(null);
		
		label = new JLabel("회원 정보");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 36));
		label.setBounds(173, 21, 360, 53);
		panel.add(label);
		
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblName.setBounds(173, 84, 120, 40);
		panel.add(lblName);
		
		JLabel lblId = new JLabel("아이디");
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		lblId.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblId.setBounds(173, 124, 120, 40);
		panel.add(lblId);
		
		JLabel lblPw = new JLabel("비밀번호");
		lblPw.setHorizontalAlignment(SwingConstants.LEFT);
		lblPw.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPw.setBounds(173, 164, 120, 40);
		panel.add(lblPw);
		
		JLabel lblPwc = new JLabel("비밀번호 확인");
		lblPwc.setHorizontalAlignment(SwingConstants.LEFT);
		lblPwc.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPwc.setBounds(173, 204, 120, 40);
		panel.add(lblPwc);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhone.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPhone.setBounds(173, 244, 120, 40);
		panel.add(lblPhone);
		
		JLabel lblMail = new JLabel("이메일");
		lblMail.setHorizontalAlignment(SwingConstants.LEFT);
		lblMail.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblMail.setBounds(173, 284, 120, 40);
		panel.add(lblMail);
		
		JLabel lblPostnum = new JLabel("우편번호");
		lblPostnum.setHorizontalAlignment(SwingConstants.LEFT);
		lblPostnum.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPostnum.setBounds(173, 324, 120, 40);
		panel.add(lblPostnum);
		
		lblAddr = new JLabel("주소");
		lblAddr.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddr.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblAddr.setBounds(173, 364, 120, 40);
		panel.add(lblAddr);
		
		lblAddrDe = new JLabel("상세주소");
		lblAddrDe.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddrDe.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblAddrDe.setBounds(173, 404, 120, 40);
		panel.add(lblAddrDe);
		
		tfName = new JTextField();
		tfName.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfName.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfName.setBounds(294, 89, 120, 30);
		panel.add(tfName);
		tfName.setColumns(10);
		
		tfId = new JTextField();
		tfId.setEditable(false);
		tfId.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfId.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfId.setBounds(294, 129, 150, 30);
		panel.add(tfId);
		tfId.setColumns(10);
		
		pwfPw = new JPasswordField();
		pwfPw.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		pwfPw.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		pwfPw.setBounds(294, 169, 150, 30);
		panel.add(pwfPw);
		
		pwfPwc = new JPasswordField();
		pwfPwc.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		pwfPwc.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		pwfPwc.setBounds(294, 209, 150, 30);
		panel.add(pwfPwc);
		
		tfPhone = new JTextField();
		tfPhone.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfPhone.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfPhone.setBounds(294, 249, 120, 30);
		panel.add(tfPhone);
		tfPhone.setColumns(10);
		
		tfMail = new JTextField();
		tfMail.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfMail.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfMail.setBounds(294, 289, 200, 30);
		panel.add(tfMail);
		tfMail.setColumns(10);
		
		tfpostnum = new JTextField();
		tfpostnum.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpostnum.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpostnum.setBounds(294, 329, 120, 30);
		panel.add(tfpostnum);
		tfpostnum.setColumns(10);
		
		tfAddr = new JTextField();
		tfAddr.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfAddr.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfAddr.setBounds(294, 369, 400, 30);
		panel.add(tfAddr);
		tfAddr.setColumns(10);
		
		tfAddrDe = new JTextField();
		tfAddrDe.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfAddrDe.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfAddrDe.setColumns(10);
		tfAddrDe.setBounds(294, 409, 400, 30);
		panel.add(tfAddrDe);
		
		btnJoin = new JButton("수정");
		btnJoin.setBorder(null);
		btnJoin.setForeground(Color.WHITE);
		btnJoin.setBackground(new Color(52,152,219));
		btnJoin.setBounds(343, 469, 97, 30);
		panel.add(btnJoin);
		
		btnCancel = new JButton("취소");
		btnCancel.setBorder(null);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(new Color(94,94,94));
		btnCancel.setBounds(483, 469, 97, 30);
		panel.add(btnCancel);
		
		btnSearchAddr = new JButton("주소찾기");
		btnSearchAddr.setBorder(null);
		btnSearchAddr.setForeground(new Color(64,64,64));
		btnSearchAddr.setBackground(new Color(190,190,190));
		btnSearchAddr.setBounds(424, 329, 90, 30);
		panel.add(btnSearchAddr);
		
	}
}
