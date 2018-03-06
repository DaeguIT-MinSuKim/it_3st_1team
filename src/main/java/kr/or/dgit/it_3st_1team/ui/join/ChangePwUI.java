package kr.or.dgit.it_3st_1team.ui.join;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.it_3st_1team.dto.Employee;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.EmployeeService;
import kr.or.dgit.it_3st_1team.service.UserService;

public class ChangePwUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPasswordField passwordFieldpw;
	private JPasswordField passwordFieldpwc;
	private JButton btnNewButton;
	private User user;
	private Employee emp;

	public ChangePwUI(Employee emp) {
		this.emp = emp;
		initComponents();
	}

	public ChangePwUI(User user) {
		this.user = user;
		initComponents();
	}

	private void initComponents() {
		setBounds(new Rectangle(0, 0, 600, 500));

		setTitle("비밀번호 수정");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 300, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblpw = new JLabel("비밀번호");
		lblpw.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblpw.setBounds(42, 45, 110, 40);
		contentPane.add(lblpw);

		JLabel lblpwc = new JLabel("비밀번호 수정");
		lblpwc.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblpwc.setBounds(42, 95, 110, 40);
		contentPane.add(lblpwc);

		passwordFieldpw = new JPasswordField();
		passwordFieldpw.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		passwordFieldpw.setBounds(170, 51, 250, 30);
		contentPane.add(passwordFieldpw);

		passwordFieldpwc = new JPasswordField();
		passwordFieldpwc.addActionListener(this);
		passwordFieldpwc.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		passwordFieldpwc.setBounds(170, 101, 250, 30);
		contentPane.add(passwordFieldpwc);

		btnNewButton = new JButton("수정");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnNewButton.setBounds(347, 159, 85, 30);
		btnNewButton.setBackground(new Color(190, 190, 190));
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == passwordFieldpwc) {
			actionPerformedPasswordFieldpwc(e);
		}
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		String pw1 = new String(passwordFieldpw.getPassword());
		String pw2 = new String(passwordFieldpwc.getPassword());
		if(pw1.equals(pw2)) {
			if (user == null) {
				EmployeeService serviceEmp = new EmployeeService();
				emp.setCode(emp.getCode());
				emp.setPw(pw1);
				serviceEmp.updateEmployeeWithAPI(emp);		
				
			}else{
				UserService service = new UserService();
				user.setId(user.getId());
				user.setPw(pw1);
				service.updateUser(user);
			}
			dispose();
			JOptionPane.showMessageDialog(null, String.format("비밀번호가 수정되었습니다. %n다시 로그인해주세요."));
		}
		else {
			JOptionPane.showMessageDialog(null, "비밀번호를 다시 확인해주세요.");
		}
		System.out.println(emp + "emp");
		System.out.println(user + "user");
	}

	protected void actionPerformedPasswordFieldpwc(ActionEvent e) {
		actionPerformedBtnNewButton(e);
	}
}
