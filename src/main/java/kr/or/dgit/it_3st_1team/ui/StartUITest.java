package kr.or.dgit.it_3st_1team.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartUITest extends JFrame {
	public static JPanel contentPane;
	public static MainUI main;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartUITest frame = new StartUITest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StartUITest() {
		setTitle("도서 관리 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1420, 800);
		main = new MainUI();
		contentPane = main;
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 1400, 800);
		repaint();
		revalidate();
	}
	
}
