package it_3st_1team.ui.join;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class IDPWsearchUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfMail;
	private JTextField tfName2;
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
		labelName.setBounds(12, 29, 110, 40);
		panelID.add(labelName);
		
		tfName = new JTextField();
		tfName.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfName.setColumns(10);
		tfName.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfName.setBounds(140, 35, 250, 30);
		panelID.add(tfName);
		
		JLabel lblMail = new JLabel("이메일");
		lblMail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMail.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblMail.setBounds(12, 79, 110, 40);
		panelID.add(lblMail);
		
		tfMail = new JTextField();
		tfMail.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfMail.setColumns(10);
		tfMail.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfMail.setBounds(140, 85, 250, 30);
		panelID.add(tfMail);
		
		btnIdfind = new JButton("찾기");
		btnIdfind.addActionListener(this);
		btnIdfind.setForeground(Color.DARK_GRAY);
		btnIdfind.setBorder(null);
		btnIdfind.setBackground(new Color(190, 190, 190));
		btnIdfind.setBounds(359, 170, 85, 30);
		panelID.add(btnIdfind);
		
		JPanel panelPw = new JPanel();
		tabbedPane.addTab("비밀번호 찾기", null, panelPw, null);
		panelPw.setLayout(null);
		
		JLabel lblName2 = new JLabel("이름");
		lblName2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblName2.setBounds(12, 19, 110, 40);
		panelPw.add(lblName2);
		
		tfName2 = new JTextField();
		tfName2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfName2.setColumns(10);
		tfName2.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfName2.setBounds(140, 25, 250, 30);
		panelPw.add(tfName2);
		
		JLabel lblId2 = new JLabel("아이디");
		lblId2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblId2.setBounds(12, 69, 110, 40);
		panelPw.add(lblId2);
		
		tfId2 = new JTextField();
		tfId2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfId2.setColumns(10);
		tfId2.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfId2.setBounds(140, 75, 250, 30);
		panelPw.add(tfId2);
		
		JLabel lblMail2 = new JLabel("이메일");
		lblMail2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMail2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblMail2.setBounds(12, 119, 110, 40);
		panelPw.add(lblMail2);
		
		tfMail2 = new JTextField();
		tfMail2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfMail2.setColumns(10);
		tfMail2.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfMail2.setBounds(140, 125, 250, 30);
		panelPw.add(tfMail2);
		
		btnPwfind = new JButton("찾기");
		btnPwfind.addActionListener(this);
		btnPwfind.setForeground(Color.DARK_GRAY);
		btnPwfind.setBorder(null);
		btnPwfind.setBackground(new Color(190, 190, 190));
		btnPwfind.setBounds(359, 170, 85, 30);
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
		IDsearchdetailUI searchId = new IDsearchdetailUI();
		searchId.setVisible(true);
	}
	protected void actionPerformedBtnPwfind(ActionEvent e) {
		PWsearchdetailUI searchPw = new PWsearchdetailUI();
		searchPw.setVisible(true);
	}
}
