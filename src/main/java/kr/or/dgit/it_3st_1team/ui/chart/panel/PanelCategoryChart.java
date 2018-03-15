package kr.or.dgit.it_3st_1team.ui.chart.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

import kr.or.dgit.it_3st_1team.dto.CategoryChart;
import kr.or.dgit.it_3st_1team.service.CategoryChartService;

public class PanelCategoryChart extends JPanel {

	public PanelCategoryChart() {
		initComponents();
	}

	private void initComponents() {
		setBackground(Color.WHITE);
		PieDataset dataset = createDataset();
		JFreeChart chart = createChart(dataset);
		chart.getTitle().setFont(new Font("맑은고딕", Font.BOLD, 24));
		chart.getLegend().setItemFont(new Font("맑은고딕", Font.BOLD, 14));
//		setCategoryPlot(chart);
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setBackground(Color.WHITE);
		chartPanel.setPreferredSize(new Dimension(960, 700));
		add(chartPanel);
		chartPanel.setLayout(new BorderLayout(0, 0));
	}

	private void setCategoryPlot(final JFreeChart chart) {
		CategoryPlot p = chart.getCategoryPlot();
		// 차트의 배경색 설정입니다.
		p.setBackgroundPaint(Color.white);
		// 차트의 배경 라인 색상입니다.
		p.setRangeGridlinePaint(Color.gray);
		// X 축의 라벨 설정입니다. (보조 타이틀)
		p.getDomainAxis().setLabelFont(new Font("맑은고딕", Font.BOLD, 20));
		// X 축의 도메인 설정입니다.
		p.getDomainAxis().setTickLabelFont(new Font("맑은고딕", Font.BOLD, 16));
		// Y 축의 라벨 설정입니다. (보조 타이틀)
		p.getRangeAxis().setLabelFont(new Font("맑은고딕", Font.BOLD, 20));
		// Y 축의 도메인 설정입니다.
		p.getRangeAxis().setTickLabelFont(new Font("맑은고딕", Font.BOLD, 16));
		p.setWeight(110);
		// 타이틀
		chart.getTitle().setFont(new Font("맑은고딕", Font.BOLD, 24));
		
	}

	private PieDataset createDataset() {
		DefaultPieDataset dataset = new DefaultPieDataset();
		CategoryChartService service = new CategoryChartService();
		List<CategoryChart> list = service.selectCategoryByAllWithAPI();
		for(CategoryChart ca : list) {
			switch(ca.getCate()) {
			case "000":
				dataset.setValue("총류", ca.getResult());
				break;
			case "100":
				dataset.setValue("철학", ca.getResult());
				break;
			case "200":
				dataset.setValue("종교", ca.getResult());
				break;
			case "300":
				dataset.setValue("사회과학", ca.getResult());
				break;
			case "400":
				dataset.setValue("순수과학", ca.getResult());
				break;
			case "500":
				dataset.setValue("기술과학", ca.getResult());
				break;
			case "600":
				dataset.setValue("예술", ca.getResult());
				break;
			case "700":
				dataset.setValue("언어", ca.getResult());
				break;
			case "800":
				dataset.setValue("문학", ca.getResult());
				break;
			case "900":
				dataset.setValue("역사", ca.getResult());
				break;
			}
		}
		return dataset;
	}

	private JFreeChart createChart(PieDataset dataset) {

		JFreeChart chart = ChartFactory.createPieChart3D("분류별 도서 통계", // chart title
				dataset, // data
				true, // include legend
				true, false);

		PiePlot3D plot = (PiePlot3D) chart.getPlot();
		plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 16));
		plot.setNoDataMessage("No data available");
		plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.9f);
      
		return chart;

	}

}
