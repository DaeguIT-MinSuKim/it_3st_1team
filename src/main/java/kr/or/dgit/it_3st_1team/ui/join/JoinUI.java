package kr.or.dgit.it_3st_1team.ui.join;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

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
import javax.swing.border.LineBorder;

import kr.or.dgit.it_3st_1team.dto.Phone;
import kr.or.dgit.it_3st_1team.dto.Post;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.UserService;

import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JoinUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfId;
	private JPasswordField pwfPw;
	private JPasswordField pwfPwc;
	private JTextField tfPhone1;
	private JTextField tfMail;
	private JButton btnJoin;
	private JButton btnCancel;
	private JButton btnIdc;
	private JTextField tfpostnum;
	private JTextField tfone;
	private JTextField tftwo;
	private JButton btnSearchAddr;
	private JLabel lblAddr;
	private JLabel lblAddrDe;
	private JTextField tfPhone2;
	private JTextField tfPhone3;
	private JLabel label;
	private JLabel label_1;
	private int checkID;
	
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		JLabel lblPostnum = new JLabel("우편번호");
		lblPostnum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPostnum.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPostnum.setBounds(20, 265, 120, 40);
		contentPane.add(lblPostnum);
		
		lblAddr = new JLabel("주소");
		lblAddr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddr.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblAddr.setBounds(20, 305, 120, 40);
		contentPane.add(lblAddr);
		
		lblAddrDe = new JLabel("상세주소");
		lblAddrDe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddrDe.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblAddrDe.setBounds(20, 345, 120, 40);
		contentPane.add(lblAddrDe);
		
		tfName = new JTextField();
		tfName.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfName.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfName.setBounds(150, 30, 120, 30);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfId = new JTextField();
		tfId.addActionListener(this);
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
		
		tfPhone1 = new JTextField();
		tfPhone1.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfPhone1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfPhone1.setBounds(150, 190, 50, 30);
		contentPane.add(tfPhone1);
		tfPhone1.setColumns(10);
		
		tfPhone2 = new JTextField();
		tfPhone2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfPhone2.setColumns(10);
		tfPhone2.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfPhone2.setBounds(220, 190, 50, 30);
		contentPane.add(tfPhone2);
		
		tfPhone3 = new JTextField();
		tfPhone3.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfPhone3.setColumns(10);
		tfPhone3.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfPhone3.setBounds(290, 190, 50, 30);
		contentPane.add(tfPhone3);
		
		tfMail = new JTextField();
		tfMail.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfMail.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfMail.setBounds(150, 230, 200, 30);
		contentPane.add(tfMail);
		tfMail.setColumns(10);
		
		tfpostnum = new JTextField();
		tfpostnum.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpostnum.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpostnum.setBounds(150, 270, 120, 30);
		contentPane.add(tfpostnum);
		tfpostnum.setColumns(10);
		
		tfone = new JTextField();
		tfone.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfone.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfone.setBounds(150, 310, 400, 30);
		contentPane.add(tfone);
		tfone.setEditable(false);
		tfone.setColumns(10);
		
		tftwo = new JTextField();
		tftwo.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tftwo.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tftwo.setColumns(10);
		tftwo.setBounds(150, 350, 400, 30);
		contentPane.add(tftwo);
		
		btnJoin = new JButton("회원가입");
		btnJoin.addActionListener(this);
		btnJoin.setBorder(null);
		btnJoin.setForeground(new Color(64,64,64));
		btnJoin.setBackground(new Color(190,190,190));
		btnJoin.setBounds(170, 410, 97, 30);
		contentPane.add(btnJoin);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		btnCancel.setBorder(null);
		btnCancel.setForeground(new Color(64,64,64));
		btnCancel.setBackground(new Color(190,190,190));
		btnCancel.setBounds(310, 410, 97, 30);
		contentPane.add(btnCancel);
		
		btnIdc = new JButton("중복확인");
		btnIdc.addActionListener(this);
		btnIdc.setBorder(null);
		btnIdc.setForeground(new Color(64,64,64));
		btnIdc.setBackground(new Color(190,190,190));
		btnIdc.setBounds(310, 70, 80, 30);
		contentPane.add(btnIdc);
		
		btnSearchAddr = new JButton("주소찾기");
		btnSearchAddr.addActionListener(this);
		btnSearchAddr.setBorder(null);
		btnSearchAddr.setForeground(new Color(64,64,64));
		btnSearchAddr.setBackground(new Color(190,190,190));
		btnSearchAddr.setBounds(280, 270, 90, 30);
		contentPane.add(btnSearchAddr);

		
		label = new JLabel("-");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		label.setBounds(200, 195, 20, 15);
		contentPane.add(label);
		
		label_1 = new JLabel("-");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		label_1.setBounds(270, 195, 20, 15);
		contentPane.add(label_1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnJoin) {
			actionPerformedBtnJoin(e);
		}
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
		if (e.getSource() == tfId) {
			actionPerformedTfId(e);
		}
		if (e.getSource() == btnIdc) {
			actionPerformedBtnIdc(e);
		}
		if (e.getSource() == btnSearchAddr) {
			actionPerformedBtnSearchAddr(e);
		}
	}
	protected void actionPerformedBtnSearchAddr(ActionEvent e) {
		SearchAddrdetailUI addr = new SearchAddrdetailUI(tfone, tfpostnum);
		addr.setVisible(true);
		addr.getTfPostAddr(tfone);
		addr.getTfPostNum(tfpostnum);
	}
	protected void actionPerformedBtnIdc(ActionEvent e) {
		User user = new User();
		user.setId(tfId.getText());
		UserService service = new UserService();
		User selectUser = service.selectUserById(user);
		if(tfId.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "사용하실 아이디를 입력하세요.");
		}else if(selectUser==null) {
			JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다.");
			checkID=1;
		}else {
			JOptionPane.showMessageDialog(null, "중복된 아이디입니다.");
		}
	}
	protected void actionPerformedTfId(ActionEvent e) {		actionPerformedBtnIdc(e);
	}
	protected void actionPerformedBtnCancel(ActionEvent e) {		dispose();
	}
	protected void actionPerformedBtnJoin(ActionEvent e) {
		String pw = new String(pwfPw.getPassword());
		String pwc = new String(pwfPwc.getPassword());
		
		if(tfName.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "이름을 입력하세요.");
			tfName.requestFocus();
		}else if(tfId.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "사용하실 아이디를 입력하세요.");
			tfId.requestFocus();
		}else if(checkID!=1) {
			JOptionPane.showMessageDialog(null, "아이디 중복체크를 해주세요.");
		}else if(pw.equals("") || pwc.equals("") || !(pw.equals(pwc))) {
			JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요.");
			pwfPw.requestFocus();
		}else if(tfPhone1.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요.");
			tfPhone1.requestFocus();
		}else if(tfPhone2.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요.");
			tfPhone2.requestFocus();
		}else if(tfPhone3.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요.");
			tfPhone3.requestFocus();
		}else if(tfMail.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "이메일을 입력해주세요.");
			tfMail.requestFocus();
		}else {
			User user = new User();
			int randomNum = (int) System.currentTimeMillis();
			user.setCode(Integer.toString(randomNum));
			user.setName(tfName.getText());
			user.setId(tfId.getText());
			user.setPw(pw);
			Phone phone = new Phone();
			phone.setPhone1(tfPhone1.getText());
			phone.setPhone2(tfPhone2.getText());
			phone.setPhone3(tfPhone3.getText());
			user.setEmail(tfMail.getText());
			user.setZipcode(tfpostnum.getText());
			user.setAddr_id(tfone.getText());
			user.setAddr_de(tftwo.getText());
			user.setEntryday(new Date());
			UserService service = new UserService();
			service.insertUser(user);
			JOptionPane.showMessageDialog(null, "가입이 완료되었습니다.");
			dispose();
		}
	}
}
