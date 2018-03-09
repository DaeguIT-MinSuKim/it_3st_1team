package kr.or.dgit.it_3st_1team.ui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.ui.user.HistoryUI;
import kr.or.dgit.it_3st_1team.ui.user.RequestBookUI;
import kr.or.dgit.it_3st_1team.ui.user.SearchBookUI;
import kr.or.dgit.it_3st_1team.ui.user.UserInfoUpdateUI;

@SuppressWarnings("serial")
public class UserUI extends JPanel implements ActionListener {
	private JButton btnBookSearch;
	private JPanel show;
	private JButton btnBookRequest;
	private JButton btnHistory;
	private JButton btnNews;
	private JButton btnUserUpdate;
	public JLabel lblname;
	public User user;
	private JButton btnlogout;
	
	public UserUI() {
		initComponents();
	}
	
	public UserUI(User user) {
		this.user = user;
		initComponents();
	}

	private void initComponents() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(41, 128, 185));
		panel.setBounds(0, 0, 250, 800);
		add(panel);
		panel.setLayout(null);
		
		btnBookSearch = new JButton("도서 검색");
		btnBookSearch.addActionListener(this);
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
		
		btnHistory = new JButton("도서 이력");
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
		
		lblname = new JLabel("");
		lblname.setForeground(Color.WHITE);
		lblname.setFont(new Font("굴림", Font.PLAIN, 14));
		lblname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblname.setBounds(31, 25, 81, 15);
		panel.add(lblname);
		
		JLabel label = new JLabel("님의 도서관");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("굴림", Font.PLAIN, 14));
		label.setBounds(114, 25, 84, 15);
		panel.add(label);
		
		show = new JPanel();
		show.setBackground(Color.WHITE);
		show.setBounds(250, 0, 1150, 800);
		add(show);
		
		SearchBookUI showpanel = new SearchBookUI();
		showpanel.setBounds(250, 0, 1150, 800);
		showpanel.setBackground(Color.WHITE);
		changePanel(showpanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnlogout) {
			actionPerformedBtnlogout(e);
		}
		if (e.getSource() == btnNews) {
			actionPerformedBtnNews(e);
		}
		if (e.getSource() == btnHistory) {
			actionPerformedBtnHistory(e);
		}
		if (e.getSource() == btnUserUpdate) {
			actionPerformedBtnUserUpdate(e);
		}
		if (e.getSource() == btnBookRequest) {
			actionPerformedBtnBookRequest(e);
		}
		if (e.getSource() == btnBookSearch) {
			actionPerformedBtnBookSearch(e);
		}
	}
	protected void actionPerformedBtnBookSearch(ActionEvent e) {
		btnBookSearch.setBackground(new Color(127,127,127));
		btnBookRequest.setBackground(new Color(158,158,158));
		btnHistory.setBackground(new Color(158,158,158));
		btnNews.setBackground(new Color(158,158,158));
		btnUserUpdate.setBackground(new Color(158,158,158));
		SearchBookUI search = new SearchBookUI();
		changePanel(search);
	}
	protected void actionPerformedBtnBookRequest(ActionEvent e) {
		btnBookRequest.setBackground(new Color(127,127,127));
		btnBookSearch.setBackground(new Color(158,158,158));
		btnHistory.setBackground(new Color(158,158,158));
		btnNews.setBackground(new Color(158,158,158));
		btnUserUpdate.setBackground(new Color(158,158,158));
		RequestBookUI request = new RequestBookUI();
		changePanel(request);
	}
	protected void actionPerformedBtnUserUpdate(ActionEvent e) {
		btnUserUpdate.setBackground(new Color(127,127,127));
		btnBookSearch.setBackground(new Color(158,158,158));
		btnHistory.setBackground(new Color(158,158,158));
		btnNews.setBackground(new Color(158,158,158));
		btnBookRequest.setBackground(new Color(158,158,158));
		UserInfoUpdateUI update = new UserInfoUpdateUI();
		update.btnadd.setVisible(false);
		update.btnsearch.setVisible(false);
		changePanel(update);
		update.userinfo(user);
	}
	protected void actionPerformedBtnHistory(ActionEvent e) {
		btnHistory.setBackground(new Color(127,127,127));
		btnBookSearch.setBackground(new Color(158,158,158));
		btnUserUpdate.setBackground(new Color(158,158,158));
		btnNews.setBackground(new Color(158,158,158));
		btnBookRequest.setBackground(new Color(158,158,158));
		HistoryUI history = new HistoryUI();
		changePanel(history);
	}
	
	private void changePanel(JPanel jpanel) {
		jpanel.setPreferredSize(new Dimension(1150, 800));
		show.removeAll();
		show.add(jpanel);
		show.repaint();
		revalidate();
	}
	protected void actionPerformedBtnNews(ActionEvent e) {
		NoticeUI no = new NoticeUI();
		changePanel(no);
	}
	protected void actionPerformedBtnlogout(ActionEvent e) {
		((StartUI) getTopLevelAncestor()).dispose();
		StartUI starui = new StartUI();
		starui.setVisible(true);
	}
}
