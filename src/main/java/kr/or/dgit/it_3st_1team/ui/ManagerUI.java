package kr.or.dgit.it_3st_1team.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import kr.or.dgit.it_3st_1team.dto.Employee;
import kr.or.dgit.it_3st_1team.ui.librarian.EmployeeUI;
import kr.or.dgit.it_3st_1team.ui.librarian.InoutBookUI;
import kr.or.dgit.it_3st_1team.ui.librarian.ManagementBookUI;
import kr.or.dgit.it_3st_1team.ui.user.UserInfoUpdateUI;

@SuppressWarnings("serial")
public class ManagerUI extends JPanel implements ActionListener {
	private JButton btnlogout;
	private JButton btnBookRequest;
	private JButton btnUserUpdate;
	private JButton btnBookSearch;
	private JButton btnHistory;
	private JButton btnEmpManage;
	private JButton btnNews;
	private JPanel showpanel;
	private ManagementBookUI manager;
	public Employee emp;
	public JLabel lblname;
	
	
	
	public ManagerUI(Employee emp) {
		this.emp = emp;
		initComponents();
	}

	private void initComponents() {
		setBounds(new Rectangle(0, 0, 1150, 800));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(44,62,80));
		panel.setBounds(0, 0, 250, 800);
		add(panel);
		panel.setLayout(null);
		
		btnBookSearch = new JButton("자료 관리");
		btnBookSearch.addActionListener(this);
		btnBookSearch.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnBookSearch.setForeground(new Color(255, 255, 255));
		btnBookSearch.setBackground(new Color(158,158,158));
		btnBookSearch.setBounds(0, 50, 250, 45);
		panel.add(btnBookSearch);
		
		btnBookRequest = new JButton("도서 출납 관리");
		btnBookRequest.addActionListener(this);
		btnBookRequest.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnBookRequest.setForeground(new Color(255, 255, 255));
		btnBookRequest.setBackground(new Color(158,158,158));
		btnBookRequest.setBounds(0, 110, 250, 45);
		panel.add(btnBookRequest);
		
		btnHistory = new JButton("도서 출납 통계");
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
		
		btnUserUpdate = new JButton("회원 정보 수정");
		btnUserUpdate.addActionListener(this);
		btnUserUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnUserUpdate.setForeground(new Color(255, 255, 255));
		btnUserUpdate.setBackground(new Color(158,158,158));
		btnUserUpdate.setBounds(0, 290, 250, 45);
		panel.add(btnUserUpdate);
		
		btnEmpManage = new JButton("사원 관리");
		btnEmpManage.addActionListener(this);
		btnEmpManage.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnEmpManage.setForeground(new Color(255, 255, 255));
		btnEmpManage.setBackground(new Color(158,158,158));
		btnEmpManage.setBounds(0, 350, 250, 45);
		panel.add(btnEmpManage);
		
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
		
		showpanel = new JPanel();
		showpanel.setBounds(250, 0, 1150, 800);
		showpanel.setBackground(Color.WHITE);
		add(showpanel);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEmpManage) {
			actionPerformedBtnEmpManage(arg0);
		}
		if (arg0.getSource() == btnNews) {
			actionPerformedBtnNews(arg0);
		}
		if (arg0.getSource() == btnHistory) {
			actionPerformedBtnHistory(arg0);
		}
		if (arg0.getSource() == btnBookSearch) {
			actionPerformedBtnBookSearch(arg0);
		}
		if (arg0.getSource() == btnUserUpdate) {
			actionPerformedBtnUserUpdate(arg0);
		}
		if (arg0.getSource() == btnBookRequest) {
			actionPerformedBtnBookRequest(arg0);
		}
		if (arg0.getSource() == btnlogout) {
			actionPerformedBtnlogout(arg0);
		}
	}
	protected void actionPerformedBtnlogout(ActionEvent arg0) {
		StartUITest.contentPane.removeAll();
		MainUI mian = new MainUI();
		mian.setPreferredSize(new Dimension(1400, 800));
		StartUITest.contentPane.setVisible(true);
		StartUITest.contentPane.repaint();
		StartUITest.contentPane.revalidate();
	}
	protected void actionPerformedBtnBookRequest(ActionEvent arg0) {
		InoutBookUI iob = new InoutBookUI();
		changePanel(iob);
	}
	protected void actionPerformedBtnUserUpdate(ActionEvent arg0) {
		UserInfoUpdateUI update = new UserInfoUpdateUI();
		update.tfId.setEditable(true);
		changePanel(update);
	}
	protected void actionPerformedBtnBookSearch(ActionEvent arg0) {
		manager = new ManagementBookUI();
		changePanel(manager);
	}
	protected void actionPerformedBtnHistory(ActionEvent arg0) {
		myChartPanel chart = new myChartPanel();
		changePanel(chart);
	}
	protected void actionPerformedBtnNews(ActionEvent arg0) {
		NoticeUI no = new NoticeUI();
		changePanel(no);
	}
	protected void actionPerformedBtnEmpManage(ActionEvent arg0) {
		EmployeeUI emp = new EmployeeUI();
		changePanel(emp);
	}
	
	private void changePanel(JPanel jpanel) {
		jpanel.setPreferredSize(new Dimension(1150, 800));
		showpanel.removeAll();
		showpanel.add(jpanel);
		showpanel.repaint();
		revalidate();
	}
}
