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
	private JButton btnBookRequest;
	private JButton btnHistory;
	private JButton btnNews;
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
		
		btnBookRequest = new JButton("도서 신청");
		btnBookRequest.addActionListener(this);
		btnBookRequest.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnBookRequest.setForeground(new Color(255, 255, 255));
		btnBookRequest.setBackground(new Color(158,158,158));
		btnBookRequest.setBounds(0, 110, 250, 45);
		panel.add(btnBookRequest);
		
		btnHistory = new JButton("대출/반납 이력");
		btnHistory.addActionListener(this);
		btnHistory.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnHistory.setForeground(new Color(255, 255, 255));
		btnHistory.setBackground(new Color(158,158,158));
		btnHistory.setBounds(0, 170, 250, 45);
		panel.add(btnHistory);
		
		btnNews = new JButton("공지 사항");
		btnNews.addActionListener(this);
		btnNews.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNews.setForeground(new Color(255, 255, 255));
		btnNews.setBackground(new Color(158,158,158));
		btnNews.setBounds(0, 230, 250, 45);
		panel.add(btnNews);
		
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
		if (e.getSource() == btnNews) {
			actionPerformedBtnNews(e);
		}
		if (e.getSource() == btnHistory) {
			actionPerformedBtnHistory(e);
		}
		if (e.getSource() == btnBookRequest) {
			actionPerformedBtnBookRequest(e);
		}
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
	protected void actionPerformedBtnBookRequest(ActionEvent e) {
		actionPerformedbtnlogin(e);
	}
	protected void actionPerformedBtnHistory(ActionEvent e) {
		actionPerformedbtnlogin(e);
	}
	protected void actionPerformedBtnNews(ActionEvent e) {
		actionPerformedbtnlogin(e);
	}
}
