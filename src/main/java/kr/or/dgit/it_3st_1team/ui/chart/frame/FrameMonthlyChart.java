package kr.or.dgit.it_3st_1team.ui.chart.frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.it_3st_1team.ui.chart.panel.PanelMonthlyChart;

public class FrameMonthlyChart extends JFrame {

	private JPanel contentPane;

	public FrameMonthlyChart() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		PanelMonthlyChart mChart = new PanelMonthlyChart();
		contentPane.add(mChart);
	}

}
