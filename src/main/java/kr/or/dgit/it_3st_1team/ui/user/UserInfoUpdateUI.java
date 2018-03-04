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
import kr.or.dgit.it_3st_1team.dto.Post;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.UserService;
import kr.or.dgit.it_3st_1team.ui.StartUI;
import kr.or.dgit.it_3st_1team.ui.join.SearchAddrdetailUI;

@SuppressWarnings("serial")
public class UserInfoUpdateUI extends JPanel implements ActionListener {
	private JTextField tfName;
	private JTextField tfId;
	private JPasswordField pwfPw;
	private JPasswordField pwfPwc;
	private JTextField tfPhone1;
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
	private JLabel label_1;
	private JLabel label_2;
	private JTextField tfPhone2;
	private JTextField tfPhone3;
	private JPanel panel;
	private JLabel label_3;
	private JTextField textField;
	private JButton button;

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
		label.setBounds(173, 21, 360, 53);
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
		tfName.setBounds(294, 114, 120, 30);
		panel.add(tfName);
		tfName.setColumns(10);
		
		tfId = new JTextField();
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
		
		tfpostnum = new JTextField();
		tfpostnum.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpostnum.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpostnum.setBounds(294, 354, 120, 30);
		panel.add(tfpostnum);
		tfpostnum.setColumns(10);
		
		tfAddr = new JTextField();
		tfAddr.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfAddr.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfAddr.setBounds(294, 394, 400, 30);
		panel.add(tfAddr);
		tfAddr.setColumns(10);
		
		tfAddrDe = new JTextField();
		tfAddrDe.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfAddrDe.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfAddrDe.setColumns(10);
		tfAddrDe.setBounds(294, 434, 400, 30);
		panel.add(tfAddrDe);
		
		btnJoin = new JButton("수정");
		btnJoin.addActionListener(this);
		btnJoin.setBorder(null);
		btnJoin.setForeground(Color.WHITE);
		btnJoin.setBackground(new Color(52,152,219));
		btnJoin.setBounds(343, 494, 97, 30);
		panel.add(btnJoin);
		
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
		
		label_3 = new JLabel("회원코드");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label_3.setBounds(173, 70, 120, 40);
		panel.add(label_3);
		
		textField = new JTextField();
		textField.setText((String) null);
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		textField.setBounds(294, 75, 259, 30);
		panel.add(textField);
		
		button = new JButton("추  가");
		button.setForeground(Color.WHITE);
		button.setBorder(null);
		button.setBackground(new Color(52, 152, 219));
		button.setBounds(578, 74, 97, 30);
		panel.add(button);
		
		userinfo();
	}
	
	private void userinfo() {
		User user = StartUI.LOGINUSER;
		tfName.setText(user.getName());
		tfId.setText(user.getId());
		tfMail.setText(user.getEmail());
		Phone tel = user.getTel();
		tfPhone1.setText(tel.getPhone1());
		tfPhone2.setText(tel.getPhone2());
		tfPhone3.setText(tel.getPhone3());
		Post post = user.getAddr_id();
		//tfpostnum.setText(post.getZipcode());
		//tfAddr.setText(post.getWithoutZipcode());
		tfAddrDe.setText(user.getAddr_de());
		/*Post post = user.getAddr_id();
		tfpostnum.setText(post.getZipcode());*/
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancel) {
			actionPerformedBtnCancel(arg0);
		}
		if (arg0.getSource() == btnJoin) {
			actionPerformedBtnJoin(arg0);
		}
		if (arg0.getSource() == btnSearchAddr) {
			actionPerformedBtnSearchAddr(arg0);
		}
	}
	protected void actionPerformedBtnSearchAddr(ActionEvent arg0) {
		SearchAddrdetailUI addr = new SearchAddrdetailUI();
		addr.setVisible(true);
	}
	protected void actionPerformedBtnJoin(ActionEvent arg0) {
		User user = StartUI.LOGINUSER;		UserService service = new UserService();
		String pw = new String(pwfPw.getPassword());
		String pwc = new String(pwfPwc.getPassword());
		
		user.setName(tfName.getText());
		user.setPw(pw);
		//phone 수정
		Phone phone = new Phone();
		phone.setPhone1(tfPhone1.getText());
		phone.setPhone2(tfPhone2.getText());
		phone.setPhone3(tfPhone3.getText());
		user.setTel(phone);
		user.setEmail(tfMail.getText());
		//post 수정
		user.setAddr_de(tfAddrDe.getText());
		
		if(pw.equals("") || pwc.equals("") || !(pw.equals(pwc))) {
			JOptionPane.showMessageDialog(null, ("비밀번호를 확인해주세요."));
		}else {
			service.updateUser(user);
			JOptionPane.showMessageDialog(null, ("회원정보가 수정되었습니다."));	
			userinfo();
			pwfPw.setText("");
			pwfPwc.setText("");
		}
	}
	protected void actionPerformedBtnCancel(ActionEvent arg0) {		userinfo();
		pwfPw.setText("");
		pwfPwc.setText("");
	}
}
