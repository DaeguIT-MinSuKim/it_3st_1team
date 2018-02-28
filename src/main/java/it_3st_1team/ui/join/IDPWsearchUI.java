package it_3st_1team.ui.join;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.UserService;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class IDPWsearchUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfMail;
	private JTextField tfId2;
	private JTextField tfMail2;
	private JButton btnIdfind;
	private JButton btnPwfind;

	
	public IDPWsearchUI() {
		initComponents();
	}
	private void initComponents() {
		setBounds(new Rectangle(0, 0, 600, 500));

		setTitle("아이디/비밀번호 찾기");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 300, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		contentPane.add(tabbedPane);
		
		JPanel panelID = new JPanel();
		panelID.setToolTipText("");
		tabbedPane.addTab("아이디 찾기", null, panelID, null);
		panelID.setLayout(null);
		
		JLabel labelName = new JLabel("이름");
		labelName.setHorizontalAlignment(SwingConstants.RIGHT);
		labelName.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		labelName.setBounds(12, 45, 110, 40);
		panelID.add(labelName);
		
		tfName = new JTextField();
		tfName.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfName.setColumns(10);
		tfName.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfName.setBounds(140, 51, 250, 30);
		panelID.add(tfName);
		
		JLabel lblMail = new JLabel("이메일");
		lblMail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMail.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblMail.setBounds(12, 95, 110, 40);
		panelID.add(lblMail);
		
		tfMail = new JTextField();
		tfMail.addActionListener(this);
		tfMail.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfMail.setColumns(10);
		tfMail.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfMail.setBounds(140, 101, 250, 30);
		panelID.add(tfMail);
		
		btnIdfind = new JButton("찾기");

		btnIdfind.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnIdfind.addActionListener(this);
		btnIdfind.setForeground(Color.DARK_GRAY);
		btnIdfind.setBorder(null);
		btnIdfind.setBackground(new Color(190, 190, 190));
		btnIdfind.setBounds(347, 159, 85, 30);
		panelID.add(btnIdfind);
		
		JPanel panelPw = new JPanel();
		tabbedPane.addTab("비밀번호 찾기", null, panelPw, null);
		panelPw.setLayout(null);
		
		JLabel lblId2 = new JLabel("아이디");
		lblId2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblId2.setBounds(12, 45, 110, 40);
		panelPw.add(lblId2);
		
		tfId2 = new JTextField();
		tfId2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfId2.setColumns(10);
		tfId2.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfId2.setBounds(140, 51, 250, 30);
		panelPw.add(tfId2);
		
		JLabel lblMail2 = new JLabel("이메일");
		lblMail2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMail2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblMail2.setBounds(12, 95, 110, 40);
		panelPw.add(lblMail2);
		
		tfMail2 = new JTextField();
		tfMail2.addActionListener(this);
		tfMail2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfMail2.setColumns(10);
		tfMail2.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfMail2.setBounds(140, 101, 250, 30);
		panelPw.add(tfMail2);
		
		btnPwfind = new JButton("찾기");
		btnPwfind.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnPwfind.addActionListener(this);
		btnPwfind.setForeground(Color.DARK_GRAY);
		btnPwfind.setBorder(null);
		btnPwfind.setBackground(new Color(190, 190, 190));
		btnPwfind.setBounds(347, 159, 85, 30);
		panelPw.add(btnPwfind);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPwfind) {
			actionPerformedBtnPwfind(e);
		}
		if (e.getSource() == btnIdfind) {
			actionPerformedBtnIdfind(e);
		}
	}

	protected void actionPerformedBtnIdfind(ActionEvent e) {
		UserService service = new UserService();
		User user = new User();
		user.setName(tfName.getText());
		user.setEmail(tfMail.getText());
		User selectuser = service.selectNameEmail(user);
		if(user.getName().equals(selectuser.getName()) && user.getEmail().equals(selectuser.getEmail())) {
			dispose();
			JOptionPane.showMessageDialog(null, String.format("찾으신 아이디는 %s입니다", selectuser.getId()));
		}else {
			JOptionPane.showMessageDialog(null, "없는 정보입니다");
		}
	}
	protected void actionPerformedTfMail(ActionEvent e) {
		actionPerformedBtnIdfind(e);
	}
	protected void actionPerformedBtnPwfind(ActionEvent e) {
		UserService service = new UserService();
		User user = new User();
		user.setId(tfId2.getText());
		user.setEmail(tfMail2.getText());
		User selectuser = service.selectIdEmail(user);
		if(user.getId().equals(selectuser.getId()) && user.getEmail().equals(selectuser.getEmail())) {
			dispose();
			ChangePwUI chan = new ChangePwUI(user);
			chan.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "없는 정보입니다");
		}
	}
	protected void actionPerformedTfMail2(ActionEvent e) {
		actionPerformedBtnPwfind(e);
	}
}
