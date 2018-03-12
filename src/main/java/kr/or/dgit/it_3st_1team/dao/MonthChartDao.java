package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.MonthChart;

public interface MonthChartDao {

	// 월별 통계
	List<MonthChart> selectByAllWithAPI();
}
