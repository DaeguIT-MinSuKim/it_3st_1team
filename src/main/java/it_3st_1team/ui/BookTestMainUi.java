package it_3st_1team.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class BookTestMainUi extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnInout;
	private JPanel pMain;
	private JButton btnChart;
	private JButton btnUser;
	private JButton btnInsert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookTestMainUi frame = new BookTestMainUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BookTestMainUi() {
		initComponents();
	}
	private void initComponents() {
		setTitle("도서관리프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(6, 0, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		
		btnInsert = new JButton("자료관리");
		btnInsert.addActionListener(this);
		panel_2.add(btnInsert);
		
		btnInout = new JButton("도서출납관리");
		btnInout.addActionListener(this);
		panel_2.add(btnInout);
		
		btnChart = new JButton("도서출납통계");
		btnChart.addActionListener(this);
		panel_2.add(btnChart);
		
		btnUser = new JButton("회원정보수정");
		btnUser.addActionListener(this);
		panel_2.add(btnUser);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		pMain = new JPanel();
		pMain.setBounds(100, 100, 720, 480);
		contentPane.add(pMain, BorderLayout.CENTER);
	}
	
	private void changePanel(JPanel jpanel) {
		pMain.removeAll();
		pMain.add(jpanel);
		pMain.repaint();
		revalidate();
		pack();
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnInsert) {
			actionPerformedBtnInsert(arg0);
		}
		if (arg0.getSource() == btnUser) {
			actionPerformedBtnUser(arg0);
		}
		if (arg0.getSource() == btnChart) {
			actionPerformedBtnChart(arg0);
		}
		if (arg0.getSource() == btnInout) {
			actionPerformedBtnNewButton_1(arg0);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent arg0) {
		PBook_Inout pio = new PBook_Inout();
		changePanel(pio);
	}
	protected void actionPerformedBtnChart(ActionEvent arg0) {
		PBook_Chart pc = new PBook_Chart();
		changePanel(pc);
	}
	protected void actionPerformedBtnUser(ActionEvent arg0) {
	}
	protected void actionPerformedBtnInsert(ActionEvent arg0) {
		PBook_Management pm = new PBook_Management();
		changePanel(pm);
	}
}
