package kr.or.dgit.it_3st_1team.ui.user;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import kr.or.dgit.it_3st_1team.ui.LoginUI;
import kr.or.dgit.it_3st_1team.ui.StartUI;
import kr.or.dgit.it_3st_1team.ui.join.JoinUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VisitorUI extends JPanel implements ActionListener {
	private JButton btnlogin;
	private JButton btnJoin;
	private StartUI staui;

	public VisitorUI(StartUI staui) {
		this.staui = staui;
		initComponents();
	}
	private void initComponents() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(41, 128, 185));
		panel.setBounds(0, 0, 250, 800);
		add(panel);
		panel.setLayout(null);
		
		JButton btnBookSearch = new JButton("도서 검색");
		btnBookSearch.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnBookSearch.setForeground(new Color(255, 255, 255));
		btnBookSearch.setBackground(new Color(127,127,127));
		btnBookSearch.setBounds(0, 50, 250, 45);
		panel.add(btnBookSearch);
		
		btnlogin = new JButton("로그인");
		btnlogin.addActionListener(this);
		btnlogin.setBorder(null);
		btnlogin.setBackground(new Color(224,224,224));
		btnlogin.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnlogin.setBounds(15, 650, 100, 30);
		panel.add(btnlogin);
		
		btnJoin = new JButton("회원가입");
		btnJoin.addActionListener(this);
		btnJoin.setBounds(135, 650, 100, 30);
		btnJoin.setBorder(null);
		btnJoin.setBackground(new Color(224,224,224));
		btnJoin.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel.add(btnJoin);
		
		SearchBookUI showpanel = new SearchBookUI();
		showpanel.setStartUI(staui);
		showpanel.setBounds(250, 0, 1150, 800);
		showpanel.setBackground(Color.WHITE);
		add(showpanel);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnJoin) {
			actionPerformedBtnJoin(e);
		}
		if (e.getSource() == btnlogin) {
			actionPerformedbtnlogin(e);
		}
	}
	protected void actionPerformedbtnlogin(ActionEvent e) {
		LoginUI login = new LoginUI(staui);
		login.setVisible(true);
	}
	protected void actionPerformedBtnJoin(ActionEvent e) {
		JoinUI join = new JoinUI();
		join.setVisible(true);
	}
}
