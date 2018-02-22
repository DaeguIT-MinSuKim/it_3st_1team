package it_3st_1team.ui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class UserUI extends JPanel implements ActionListener {
	private JButton btnBookSearch;
	private JPanel show;
	private JButton btnBookRequest;
	private JButton btnHistory;
	private JButton btnNews;
	private JButton btnUserUpdate;
	private RequestBookUI request;
	private Loan loan;
	
	public UserUI() {
		initComponents();
	}
	private void initComponents() {
		setBounds(new Rectangle(0, 0, 1450, 800));
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
		btnNews.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNews.setForeground(new Color(255, 255, 255));
		btnNews.setBackground(new Color(158,158,158));
		btnNews.setBounds(0, 230, 250, 45);
		panel.add(btnNews);
		
		btnUserUpdate = new JButton("개인 정보 수정");
		btnUserUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnUserUpdate.setForeground(new Color(255, 255, 255));
		btnUserUpdate.setBackground(new Color(158,158,158));
		btnUserUpdate.setBounds(0, 290, 250, 45);
		panel.add(btnUserUpdate);
		
		JButton btnlogout = new JButton("로그아웃");
		btnlogout.setBorder(null);
		btnlogout.setBackground(new Color(224,224,224));
		btnlogout.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnlogout.setBounds(70, 650, 100, 30);
		panel.add(btnlogout);	
		
		show = new JPanel();
		show.setBounds(new Rectangle(0, 0, 1150, 800));
		show.setBounds(250, 0, 1150, 800);
		add(show);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnHistory) {
			actionPerformedBtnHistory(e);
		}
		if (e.getSource() == btnBookRequest) {
			actionPerformedBtnBookRequest(e);
		}
		if (e.getSource() == btnBookSearch) {
			actionPerformedBtnBookSearch(e);
		}
	}
	protected void actionPerformedBtnBookSearch(ActionEvent e) {
		changeBtn(btnBookSearch);
		SearchBookUI search = new SearchBookUI();
		changePanel(search);
	}
	protected void actionPerformedBtnBookRequest(ActionEvent e) {
		changeBtn(btnBookRequest);
		request = new RequestBookUI();
		changePanel(request);
	}
	
	protected void actionPerformedBtnHistory(ActionEvent e) {
		changeBtn(btnHistory);
		HistoryUI his = new HistoryUI();
		changePanel(his);
	}
	
	private void changeBtn(JButton btn) {
		btnBookSearch.setBackground(new Color(158,158,158));
		btnBookRequest.setBackground(new Color(158,158,158));
		btnHistory.setBackground(new Color(158,158,158));
		btnNews.setBackground(new Color(158,158,158));
		btnUserUpdate.setBackground(new Color(158,158,158));
		btn.setBackground(new Color(127,127,127));
	}
	private void changePanel(JPanel jpanel) {
		jpanel.setPreferredSize(new Dimension(1150, 800));
		show.removeAll();
		show.add(jpanel);
		show.repaint();
		show.revalidate();
	}
}
