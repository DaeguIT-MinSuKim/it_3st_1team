package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.MonthChart;
import kr.or.dgit.it_3st_1team.service.MonthChartService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MonthChartServiceTest {
	private static MonthChartService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new MonthChartService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1selectMonthChartByAllWithAPI() {
		List<MonthChart> list = service.selectByAllWithAPI();
		Assert.assertNotNull(list);
		System.out.println(list);
	}
}
