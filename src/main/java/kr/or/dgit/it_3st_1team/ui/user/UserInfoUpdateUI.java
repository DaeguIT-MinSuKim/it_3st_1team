package kr.or.dgit.it_3st_1team.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.UserService;
import kr.or.dgit.it_3st_1team.ui.StartUI;
import kr.or.dgit.it_3st_1team.ui.join.SearchAddrdetailUI;

@SuppressWarnings("serial")
public class UserInfoUpdateUI extends JPanel implements ActionListener {
	private JTextField tfName;
	public JTextField tfId;
	private JPasswordField pwfPw;
	private JPasswordField pwfPwc;
	private JTextField tfPhone1;
	private JTextField tfMail;
	private JButton btnupdate;
	private JButton btnCancel;
	private JTextField tfZipCode;
	private JTextField tfAddr_id;
	private JTextField tfAddr_de;
	private JButton btnSearchAddr;
	private JLabel lblAddr;
	private JLabel lblAddrDe;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField tfPhone2;
	private JTextField tfPhone3;
	private JPanel panel;
	private JLabel lblcode;
	private JTextField tfcode;
	public JButton btnadd;
	public JButton btnsearch;

	public UserInfoUpdateUI() {
		initComponents();
	}
	private void initComponents() {
		setBounds(new Rectangle(0, 0, 1150, 800));
		setBackground(new Color(224,224,224));
		
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(224,224,224));
		panel.setBounds(130, 100, 950, 528);
		add(panel);
		panel.setLayout(null);
		
		label = new JLabel("회원 정보");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 36));
		label.setBounds(173, 15, 360, 53);
		panel.add(label);
		
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblName.setBounds(173, 109, 120, 40);
		panel.add(lblName);
		
		JLabel lblId = new JLabel("아이디");
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		lblId.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblId.setBounds(173, 149, 120, 40);
		panel.add(lblId);
		
		JLabel lblPw = new JLabel("비밀번호 수정");
		lblPw.setHorizontalAlignment(SwingConstants.LEFT);
		lblPw.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPw.setBounds(173, 189, 120, 40);
		panel.add(lblPw);
		
		JLabel lblPwc = new JLabel("비밀번호 확인");
		lblPwc.setHorizontalAlignment(SwingConstants.LEFT);
		lblPwc.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPwc.setBounds(173, 229, 120, 40);
		panel.add(lblPwc);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhone.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPhone.setBounds(173, 269, 120, 40);
		panel.add(lblPhone);
		
		JLabel lblMail = new JLabel("이메일");
		lblMail.setHorizontalAlignment(SwingConstants.LEFT);
		lblMail.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblMail.setBounds(173, 309, 120, 40);
		panel.add(lblMail);
		
		JLabel lblPostnum = new JLabel("우편번호");
		lblPostnum.setHorizontalAlignment(SwingConstants.LEFT);
		lblPostnum.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblPostnum.setBounds(173, 349, 120, 40);
		panel.add(lblPostnum);
		
		lblAddr = new JLabel("주소");
		lblAddr.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddr.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblAddr.setBounds(173, 389, 120, 40);
		panel.add(lblAddr);
		
		lblAddrDe = new JLabel("상세주소");
		lblAddrDe.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddrDe.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblAddrDe.setBounds(173, 429, 120, 40);
		panel.add(lblAddrDe);
		
		tfName = new JTextField();
		tfName.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfName.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfName.setBounds(294, 114, 150, 30);
		panel.add(tfName);
		tfName.setColumns(10);
		
		tfId = new JTextField();
		tfId.addActionListener(this);
		tfId.setEditable(false);
		tfId.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfId.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfId.setBounds(294, 154, 150, 30);
		panel.add(tfId);
		tfId.setColumns(10);
		
		pwfPw = new JPasswordField();
		pwfPw.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		pwfPw.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		pwfPw.setBounds(294, 194, 150, 30);
		panel.add(pwfPw);
		
		pwfPwc = new JPasswordField();
		pwfPwc.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		pwfPwc.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		pwfPwc.setBounds(294, 234, 150, 30);
		panel.add(pwfPwc);
		
		tfPhone1 = new JTextField();
		tfPhone1.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfPhone1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfPhone1.setBounds(294, 274, 50, 30);
		panel.add(tfPhone1);
		tfPhone1.setColumns(10);
		
		tfPhone2 = new JTextField();
		tfPhone2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfPhone2.setColumns(10);
		tfPhone2.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfPhone2.setBounds(364, 274, 50, 30);
		panel.add(tfPhone2);
		
		tfPhone3 = new JTextField();
		tfPhone3.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfPhone3.setColumns(10);
		tfPhone3.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfPhone3.setBounds(434, 274, 50, 30);
		panel.add(tfPhone3);
		
		tfMail = new JTextField();
		tfMail.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfMail.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfMail.setBounds(294, 314, 200, 30);
		panel.add(tfMail);
		tfMail.setColumns(10);
		
		tfZipCode = new JTextField();
		tfZipCode.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfZipCode.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfZipCode.setBounds(294, 354, 120, 30);
		panel.add(tfZipCode);
		tfZipCode.setColumns(10);
		
		tfAddr_id = new JTextField();
		tfAddr_id.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfAddr_id.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfAddr_id.setBounds(294, 394, 400, 30);
		panel.add(tfAddr_id);
		tfAddr_id.setColumns(10);
		
		tfAddr_de = new JTextField();
		tfAddr_de.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfAddr_de.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfAddr_de.setColumns(10);
		tfAddr_de.setBounds(294, 434, 400, 30);
		panel.add(tfAddr_de);
		
		btnupdate = new JButton("수정");
		btnupdate.addActionListener(this);
		btnupdate.setBorder(null);
		btnupdate.setForeground(Color.WHITE);
		btnupdate.setBackground(new Color(52,152,219));
		btnupdate.setBounds(343, 494, 97, 30);
		panel.add(btnupdate);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		btnCancel.setBorder(null);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(new Color(94,94,94));
		btnCancel.setBounds(483, 494, 97, 30);
		panel.add(btnCancel);
		
		btnSearchAddr = new JButton("주소찾기");
		btnSearchAddr.addActionListener(this);
		btnSearchAddr.setBorder(null);
		btnSearchAddr.setForeground(new Color(64,64,64));
		btnSearchAddr.setBackground(new Color(190,190,190));
		btnSearchAddr.setBounds(424, 354, 90, 30);
		panel.add(btnSearchAddr);
		
		label_1 = new JLabel("-");
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(344, 281, 20, 15);
		panel.add(label_1);
		
		label_2 = new JLabel("-");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		label_2.setBounds(414, 281, 20, 15);
		panel.add(label_2);
		
		lblcode = new JLabel("회원코드");
		lblcode.setHorizontalAlignment(SwingConstants.LEFT);
		lblcode.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblcode.setBounds(173, 70, 120, 40);
		panel.add(lblcode);
		
		tfcode = new JTextField();
		tfcode.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfcode.setColumns(10);
		tfcode.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfcode.setBounds(294, 75, 150, 30);
		panel.add(tfcode);
		
		btnadd = new JButton("추가");
		btnadd.addActionListener(this);
		btnadd.setForeground(new Color(64,64,64));
		btnadd.setBorder(null);
		btnadd.setBackground(new Color(190,190,190));
		btnadd.setBounds(460, 75, 97, 30);
		panel.add(btnadd);
		
		btnsearch = new JButton("검색");
		btnsearch.addActionListener(this);
		btnsearch.setForeground(new Color(64,64,64));
		btnsearch.setBorder(null);
		btnsearch.setBackground(new Color(190,190,190));
		btnsearch.setBounds(460, 154, 97, 30);
		panel.add(btnsearch);
	}
	
	public void userinfo() {
		User user = StartUI.LOGINUSER;
		tfcode.setText(user.getCode());
		tfcode.setEditable(false);
		tfName.setText(user.getName());
		tfId.setText(user.getId());
		tfMail.setText(user.getEmail());
		Phone tel = user.getTel();
		tfPhone1.setText(tel.getPhone1());
		tfPhone2.setText(tel.getPhone2());
		tfPhone3.setText(tel.getPhone3());
		tfZipCode.setText(user.getZipcode());
		tfAddr_id.setText(user.getAddr_id());
		tfAddr_de.setText(user.getAddr_de());
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnadd) {
			actionPerformedBtnadd(arg0);
		}
		if (arg0.getSource() == tfId) {
			actionPerformedTfId(arg0);
		}
		if (arg0.getSource() == btnsearch) {
			actionPerformedBtnsearch(arg0);
		}
		if (arg0.getSource() == btnCancel) {
			actionPerformedBtnCancel(arg0);
		}
		if (arg0.getSource() == btnupdate) {
			actionPerformedBtnupdate(arg0);
		}
		if (arg0.getSource() == btnSearchAddr) {
			actionPerformedBtnSearchAddr(arg0);
		}
	}
	protected void actionPerformedBtnSearchAddr(ActionEvent arg0) {
		SearchAddrdetailUI addr = new SearchAddrdetailUI(tfAddr_id, tfZipCode);
		addr.setVisible(true);
	}
	protected void actionPerformedBtnupdate(ActionEvent arg0) {
		String pw = new String(pwfPw.getPassword());
		String pwc = new String(pwfPwc.getPassword());
		User user = StartUI.LOGINUSER;
		if(user != null) {
			UserService service = new UserService();
			
			user.setName(tfName.getText());
			user.setPw(pw);
			Phone phone = new Phone();
			phone.setPhone1(tfPhone1.getText());
			phone.setPhone2(tfPhone2.getText());
			phone.setPhone3(tfPhone3.getText());
			user.setTel(phone);
			user.setEmail(tfMail.getText());
			user.setZipcode(tfZipCode.getText());
			user.setAddr_id(tfAddr_id.getText());
			user.setAddr_de(tfAddr_de.getText());
			
			if(pw.equals("") || pwc.equals("") || !(pw.equals(pwc))) {
				JOptionPane.showMessageDialog(null, ("비밀번호를 확인해주세요."));
			}else {
				service.updateUser(user);
				JOptionPane.showMessageDialog(null, ("회원정보가 수정되었습니다."));	
				userinfo();
				pwfPw.setText("");
				pwfPwc.setText("");
			}
		}else{
			User searchuser = new User();
			searchuser.setId(tfId.getText());
			UserService service = new UserService();
			User selectUser = service.selectUserById(searchuser);
			
			selectUser.setName(tfName.getText());
			selectUser.setPw(pw);
			Phone phone = new Phone();
			phone.setPhone1(tfPhone1.getText());
			phone.setPhone2(tfPhone2.getText());
			phone.setPhone3(tfPhone3.getText());
			selectUser.setTel(phone);
			selectUser.setEmail(tfMail.getText());
			selectUser.setZipcode(tfZipCode.getText());
			selectUser.setAddr_id(tfAddr_id.getText());
			selectUser.setAddr_de(tfAddr_de.getText());

			if(pw.equals("") || pwc.equals("") || !(pw.equals(pwc))) {
				JOptionPane.showMessageDialog(null, ("비밀번호를 확인해주세요."));
			}else {
				service.updateUser(selectUser);
				JOptionPane.showMessageDialog(null, ("회원정보가 수정되었습니다."));	
				pwfPw.setText("");
				pwfPwc.setText("");
			}
		}
	}
	protected void actionPerformedBtnCancel(ActionEvent arg0) {
		User user = StartUI.LOGINUSER;
		if(user == null) {
			pwfPw.setText("");
			pwfPwc.setText("");
			tfcode.setText("");
			tfName.setText("");
			tfId.setText("");
			tfMail.setText("");
			tfPhone1.setText("");
			tfPhone2.setText("");
			tfPhone3.setText("");
			tfZipCode.setText("");
			tfAddr_id.setText("");
			tfAddr_de.setText("");
		}else {
			userinfo();
			pwfPw.setText("");
			pwfPwc.setText("");
		}
	}
	protected void actionPerformedBtnsearch(ActionEvent arg0) {
		User user = new User();
		user.setId(tfId.getText());		UserService service = new UserService();
		User selectUser = service.selectUserById(user);
		System.out.println(selectUser);
		tfcode.setText(selectUser.getCode());
		tfId.setText(selectUser.getId());
		tfName.setText(selectUser.getName());
		tfZipCode.setText(selectUser.getZipcode());
		tfAddr_id.setText(selectUser.getAddr_id());
		tfAddr_de.setText(selectUser.getAddr_de());
		tfMail.setText(selectUser.getEmail());
		Phone phone = selectUser.getTel();
		tfPhone1.setText(phone.getPhone1());
		tfPhone2.setText(phone.getPhone2());
		tfPhone3.setText(phone.getPhone3());
	}
	protected void actionPerformedTfId(ActionEvent arg0) {		actionPerformedBtnsearch(arg0);
	}
	protected void actionPerformedBtnadd(ActionEvent arg0) {		User user = new User();
		user.setId(tfId.getText());
		user.setCode(tfcode.getText());
		UserService service = new UserService();
		User result = service.selectCode(user);
		System.out.println(result);
		if(result != null) {
			JOptionPane.showMessageDialog(null, "이미 존재하는 코드입니다.");
		}else{
			service.updateUser(user);
			JOptionPane.showMessageDialog(null, "회원코드가 변경되었습니다.");
		}
	}
}
