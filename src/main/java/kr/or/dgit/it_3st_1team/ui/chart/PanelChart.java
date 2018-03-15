package kr.or.dgit.it_3st_1team.ui.chart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import kr.or.dgit.it_3st_1team.ui.chart.panel.PanelCategoryChart;
import kr.or.dgit.it_3st_1team.ui.chart.panel.PanelMonthlyChart;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Font;

public class PanelChart extends JPanel implements ActionListener {
	private JButton btnNewButton;
	private JButton pMonth;
	private JPanel pMain;

	public PanelChart() {

		initComponents();
	}
	private void initComponents() {
		setBounds(new Rectangle(0, 0, 1150, 800));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBounds(new Rectangle(0, 0, 1150, 800));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel pNorth = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pNorth.getLayout();
		flowLayout.setHgap(55);
		pNorth.setBounds(new Rectangle(0, 0, 0, 100));
		pNorth.setBackground(Color.WHITE);
		panel.add(pNorth, BorderLayout.NORTH);
		
		pMonth = new JButton("월별 대여 도서");
		pMonth.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		pMonth.setBounds(new Rectangle(0, 0, 300, 100));
		pMonth.addActionListener(this);
		pMonth.setBorder(new EmptyBorder(8, 20, 8, 20));
		pMonth.setForeground(Color.WHITE);
		pMonth.setBackground(new Color(94,94,94));
		pNorth.add(pMonth);
		
		btnNewButton = new JButton("분류별 도서 통계");
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		btnNewButton.addActionListener(this);
		btnNewButton.setBorder(new EmptyBorder(8, 20, 8, 20));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(94,94,94));
		
		pNorth.add(btnNewButton);
		
		pMain = new JPanel();
		pMain.setBackground(Color.WHITE);
		panel.add(pMain, BorderLayout.CENTER);
		pMain.setLayout(new BorderLayout(0, 0));
		
		PanelMonthlyChart mChart = new PanelMonthlyChart();
		changePanel(mChart);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == pMonth) {
			actionPerformedPMonth(arg0);
		}
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton_1(arg0);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent arg0) {
		PanelCategoryChart cChart = new PanelCategoryChart();
		changePanel(cChart);
	}
	protected void actionPerformedPMonth(ActionEvent arg0) {
		PanelMonthlyChart mChart = new PanelMonthlyChart();
		changePanel(mChart);
	}
	
	private void changePanel(JPanel jpanel) {
		jpanel.setPreferredSize(new Dimension(1150, 800));
		pMain.removeAll();
		pMain.add(jpanel, BorderLayout.CENTER);
		pMain.repaint();
		revalidate();
	}
}
