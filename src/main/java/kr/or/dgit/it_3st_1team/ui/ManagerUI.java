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
import kr.or.dgit.it_3st_1team.ui.chart.PanelChart;
import kr.or.dgit.it_3st_1team.ui.librarian.EmployeeUI;
import kr.or.dgit.it_3st_1team.ui.librarian.InoutBookUI;
import kr.or.dgit.it_3st_1team.ui.librarian.ManagementBookUI;
import kr.or.dgit.it_3st_1team.ui.user.UserInfoUpdateUI;

@SuppressWarnings("serial")
public class ManagerUI extends JPanel implements ActionListener {
	private JButton btnlogout;
	private JButton btnBookinout;
	public JButton btnUserUpdate;
	private JButton btnBookmanager;
	public JButton btnHistory;
	public JButton btnEmpManage;
	private InoutBookUI showpanel;
	private ManagementBookUI manager;
	public Employee emp;
	public JLabel lblname;
	
	public ManagerUI() {
		initComponents();
	}
	
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
		
		btnBookmanager = new JButton("자료 관리");
		btnBookmanager.addActionListener(this);
		btnBookmanager.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnBookmanager.setForeground(new Color(255, 255, 255));
		btnBookmanager.setBackground(new Color(158,158,158));
		btnBookmanager.setBounds(0, 50, 250, 45);
		panel.add(btnBookmanager);
		
		btnBookinout = new JButton("도서 출납 관리");
		btnBookinout.addActionListener(this);
		btnBookinout.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnBookinout.setForeground(new Color(255, 255, 255));
		btnBookinout.setBackground(new Color(94, 94, 94));
		btnBookinout.setBounds(0, 110, 250, 45);
		panel.add(btnBookinout);
		
		btnHistory = new JButton("도서 출납 통계");
		btnHistory.addActionListener(this);
		btnHistory.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnHistory.setForeground(new Color(255, 255, 255));
		btnHistory.setBackground(new Color(158,158,158));
		btnHistory.setBounds(0, 170, 250, 45);
		panel.add(btnHistory);
		
		btnUserUpdate = new JButton("회원 정보 수정");
		btnUserUpdate.addActionListener(this);
		btnUserUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnUserUpdate.setForeground(new Color(255, 255, 255));
		btnUserUpdate.setBackground(new Color(158,158,158));
		btnUserUpdate.setBounds(0, 230, 250, 45);
		panel.add(btnUserUpdate);
		
		btnEmpManage = new JButton("사원 관리");
		btnEmpManage.addActionListener(this);
		btnEmpManage.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnEmpManage.setForeground(new Color(255, 255, 255));
		btnEmpManage.setBackground(new Color(158,158,158));
		btnEmpManage.setBounds(0, 290, 250, 45);
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
		
		showpanel = new InoutBookUI();
		showpanel.setBounds(250, 0, 1150, 800);
		showpanel.setBackground(Color.WHITE);
		add(showpanel);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEmpManage) {
			actionPerformedBtnEmpManage(arg0);
		}
		if (arg0.getSource() == btnHistory) {
			actionPerformedBtnHistory(arg0);
		}
		if (arg0.getSource() == btnBookmanager) {
			actionPerformedbtnBookmanager(arg0);
		}
		if (arg0.getSource() == btnUserUpdate) {
			actionPerformedBtnUserUpdate(arg0);
		}
		if (arg0.getSource() == btnBookinout) {
			actionPerformedbtnBookinout(arg0);
		}
		if (arg0.getSource() == btnlogout) {
			actionPerformedBtnlogout(arg0);
		}
	}
	protected void actionPerformedBtnlogout(ActionEvent arg0) {
		/*StartUITest.contentPane.removeAll();
		MainUI mian = new MainUI();
		mian.setPreferredSize(new Dimension(1400, 800));
		StartUITest.contentPane.setVisible(true);
		StartUITest.contentPane.repaint();
		StartUITest.contentPane.revalidate();*/
		((StartUI) getTopLevelAncestor()).dispose();
		StartUI starui = new StartUI();
		starui.setVisible(true);
	}
	protected void actionPerformedbtnBookinout(ActionEvent arg0) {
		btnBookinout.setBackground(new Color(94, 94, 94));
		btnBookmanager.setBackground(new Color(158,158,158));
		btnEmpManage.setBackground(new Color(158,158,158));
		btnHistory.setBackground(new Color(158,158,158));
		btnUserUpdate.setBackground(new Color(158,158,158));
		InoutBookUI iob = new InoutBookUI();
		changePanel(iob);
	}
	protected void actionPerformedBtnUserUpdate(ActionEvent arg0) {
		btnBookinout.setBackground(new Color(158,158,158));
		btnBookmanager.setBackground(new Color(158,158,158));
		btnEmpManage.setBackground(new Color(158,158,158));
		btnHistory.setBackground(new Color(158,158,158));
		btnUserUpdate.setBackground(new Color(94, 94, 94));
		UserInfoUpdateUI update = new UserInfoUpdateUI();
		update.tfId.setEditable(true);
		changePanel(update);
	}
	protected void actionPerformedbtnBookmanager(ActionEvent arg0) {
		btnBookinout.setBackground(new Color(158,158,158));
		btnBookmanager.setBackground(new Color(94, 94, 94));
		btnEmpManage.setBackground(new Color(158,158,158));
		btnHistory.setBackground(new Color(158,158,158));
		btnUserUpdate.setBackground(new Color(158,158,158));
		manager = new ManagementBookUI();
		changePanel(manager);
	}
	protected void actionPerformedBtnHistory(ActionEvent arg0) {
		btnBookinout.setBackground(new Color(158,158,158));
		btnBookmanager.setBackground(new Color(158,158,158));
		btnEmpManage.setBackground(new Color(158,158,158));
		btnHistory.setBackground(new Color(94,94,94));
		btnUserUpdate.setBackground(new Color(158,158,158));
		PanelChart pchart = new PanelChart();
		changePanel(pchart);
	}
	protected void actionPerformedBtnEmpManage(ActionEvent arg0) {
		btnBookinout.setBackground(new Color(158,158,158));
		btnBookmanager.setBackground(new Color(158,158,158));
		btnEmpManage.setBackground(new Color(94,94,94));
		btnHistory.setBackground(new Color(158,158,158));
		btnUserUpdate.setBackground(new Color(158,158,158));
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
