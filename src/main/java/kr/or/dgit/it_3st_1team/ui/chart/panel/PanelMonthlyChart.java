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
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

import kr.or.dgit.it_3st_1team.dto.MonthChart;
import kr.or.dgit.it_3st_1team.service.MonthChartService;

public class PanelMonthlyChart extends JPanel {

	public PanelMonthlyChart() {
		initComponents();
	}

	private void initComponents() {
		setBackground(Color.WHITE);
		final CategoryDataset dataset = createDataset();
		final JFreeChart chart = createChart(dataset);
		setCategoryPlot(chart);
		final ChartPanel chartPanel = new ChartPanel(chart);
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
		chart.getLegend().setItemFont(new Font("맑은고딕", Font.BOLD, 14));
	}

	private CategoryDataset createDataset() {

		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		MonthChartService service = new MonthChartService();
		List<MonthChart> mList = service.selectByAllWithAPI();
		int i = 0;
		if (i < mList.size()) {
			for (MonthChart m : mList) {
				dataset.addValue(m.getResult(), m.getMonth().substring(0, 4) + "년",
						m.getMonth().substring(6, m.getMonth().length()) + "월");

				i++;
			}
		}
		if (i < 12) {
			for (i++; i < 13; i++) {
				dataset.addValue(0, mList.get(0).getMonth().substring(0, 4) + "년", i + "월");
			}
		}

		return dataset;

	}

	private JFreeChart createChart(final CategoryDataset dataset) {

		final JFreeChart chart = ChartFactory.createBarChart3D("월별 대여도서 통계", // chart title
				"월별 대여량", // domain axis label
				"대여량", // range axis label
				dataset, // data
				PlotOrientation.VERTICAL, // orientation
				true, // include legend
				true, // tooltips
				false // urls
		);

		final CategoryPlot plot = chart.getCategoryPlot();
		final CategoryAxis axis = plot.getDomainAxis();
		axis.setCategoryMargin(0.1);
		axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 8.0));

		final CategoryItemRenderer renderer = plot.getRenderer();
		renderer.setBaseItemLabelsVisible(true);
		final BarRenderer r = (BarRenderer) renderer;
		r.setMaximumBarWidth(0.05);

		final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();

		final ItemLabelPosition p_center = new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER);

		final ItemLabelPosition p_below = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_LEFT);
		Font f = new Font("Gulim", Font.BOLD, 14);
		Font axisF = new Font("Gulim", Font.PLAIN, 14);
		r.setBaseItemLabelGenerator(generator);
		r.setBaseItemLabelsVisible(true);
		r.setBasePositiveItemLabelPosition(p_center);
		r.setBaseItemLabelFont(f);
		r.setSeriesPaint(0, new Color(0, 162, 255));
		return chart;

	}

}
