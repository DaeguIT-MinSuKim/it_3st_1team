package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.ui.chart.panel.PanelCategoryChart;

public interface CategoryChartDao {

	// 월별 통계
	List<PanelCategoryChart> selectCategoryByAllWithAPI();
}
