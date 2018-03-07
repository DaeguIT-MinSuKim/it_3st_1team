package kr.or.dgit.it_3st_1team.ui.chart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

@SuppressWarnings("serial")
public class myChartPanel extends JPanel {
	
	private ChartPanel chartPanel;
	private Object[][] myTestData;
	private DefaultCategoryDataset myDataset;

	public myChartPanel() {
		initComponents();
	}
	
	private void initComponents() {
		setLayout(new BorderLayout(0, 0));
		setinitTestData();
		setChartPanel();
		
		add(chartPanel);
		chartPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));		
	}
	
	private void setChartPanel() {
		setChartData();
		
		
		CategoryPlot oPlot = new CategoryPlot(myDataset,
				new CategoryAxis("가로축"), new NumberAxis("세로축"), new BarRenderer());
		oPlot.setBackgroundPaint(Color.WHITE);
		oPlot.setRangeGridlinePaint(Color.RED);
		oPlot.setNoDataMessage("데이터가 없습니다");
		
		JFreeChart oChart = new JFreeChart("Test Graph", new Font("맑은 고딕", Font.BOLD, 20), oPlot, true);
		chartPanel = new ChartPanel(oChart);
	}
	
	private void setinitTestData() {
		myTestData = new Object[2][10];
		
		for(int i=0;i<10;i++) {
			myTestData[0][i] = String.valueOf(i);
			myTestData[1][i] = i*10;
		}
	}
	
	private void setChartData() {
		myDataset = new DefaultCategoryDataset();
		
		for(int i=0;i<10;i++) {
			myDataset.setValue((Number)myTestData[1][i], "", (String)myTestData[0][i]);
		}
	}

}
