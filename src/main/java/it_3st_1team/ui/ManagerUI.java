package it_3st_1team.ui;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ManagerUI extends JPanel implements ActionListener {
	private JPanel showpanel;
	private JButton btnBookSearch;
	private JButton btnBookRequest;
	private JButton btnHistory;
	private JButton btnUserUpdate;
	private JButton btnlogout;
	private JButton btnNews;

	public ManagerUI() {
		initComponents();
	}

	private void initComponents() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(44,62,80));
		panel.setBounds(0, 0, 250, 800);
		add(panel);
		panel.setLayout(null);
		
		btnBookSearch = new JButton("도서 검색");
		btnBookSearch.addActionListener(this);
		btnBookSearch.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnBookSearch.setForeground(new Color(255, 255, 255));
		btnBookSearch.setBackground(new Color(158,158,158));
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
		
		btnUserUpdate = new JButton("개인 정보 수정");
		btnUserUpdate.addActionListener(this);
		btnUserUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnUserUpdate.setForeground(new Color(255, 255, 255));
		btnUserUpdate.setBackground(new Color(158,158,158));
		btnUserUpdate.setBounds(0, 290, 250, 45);
		panel.add(btnUserUpdate);
		
		btnlogout = new JButton("로그아웃");
		btnlogout.addActionListener(this);
		btnlogout.setBorder(null);
		btnlogout.setBackground(new Color(224,224,224));
		btnlogout.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnlogout.setBounds(70, 650, 100, 30);
		panel.add(btnlogout);
		
		showpanel = new JPanel();
		showpanel.setBounds(250, 0, 1150, 800);
		showpanel.setBackground(Color.pink);
		add(showpanel);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBookRequest) {
			actionPerformedBtnBookRequest(e);
		}
		if (e.getSource() == btnHistory) {
			actionPerformedBtnHistory(e);
		}
		if (e.getSource() == btnNews) {
			actionPerformedBtnNews(e);
		}
		if (e.getSource() == btnBookSearch) {
			actionPerformedBtnBookSearch(e);
		}
		if (e.getSource() == btnlogout) {
			actionPerformedBtnlogout(e);
		}
		if (e.getSource() == btnUserUpdate) {
			actionPerformedBtnUserUpdate(e);
		}
	}
	protected void actionPerformedBtnUserUpdate(ActionEvent e) {
	}
	protected void actionPerformedBtnlogout(ActionEvent e) {
	}
	protected void actionPerformedBtnBookSearch(ActionEvent e) {
	}
	protected void actionPerformedBtnNews(ActionEvent e) {
	}
	protected void actionPerformedBtnHistory(ActionEvent e) {
	}
	protected void actionPerformedBtnBookRequest(ActionEvent e) {
	}
}
