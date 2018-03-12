package kr.or.dgit.it_3st_1team.ui.chart;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.ui.RefineryUtilities;

import kr.or.dgit.it_3st_1team.ui.chart.panel.PanelCategoryChart;
import kr.or.dgit.it_3st_1team.ui.chart.panel.PanelMonthlyChart;

public class ChartTest extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChartTest frame = new ChartTest();
					frame.pack();
			        RefineryUtilities.centerFrameOnScreen(frame);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChartTest() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
//		PanelMonthlyChart mChart = new PanelMonthlyChart();
		PanelCategoryChart mChart = new PanelCategoryChart();
		contentPane.add(mChart);
	}

}
