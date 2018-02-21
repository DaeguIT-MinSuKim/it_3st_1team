package it_3st_1team.ui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PBook_Chart extends JPanel {

	/**
	 * Create the panel.
	 */
	public PBook_Chart() {

		initComponents();
	}
	private void initComponents() {
		setLayout(new BorderLayout(0, 0));
		setBounds(100, 100, 720, 480);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("대여현황");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("분류별현황");
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("월별현황");
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("년도별 현황");
		panel_2.add(btnNewButton_3);
	}

}
