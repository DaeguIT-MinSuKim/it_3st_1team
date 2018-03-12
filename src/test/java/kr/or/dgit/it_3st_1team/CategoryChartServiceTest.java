package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.CategoryChart;
import kr.or.dgit.it_3st_1team.service.CategoryChartService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CategoryChartServiceTest {
	private static CategoryChartService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new CategoryChartService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1selectMonthChartByAllWithAPI() {
		List<CategoryChart> list = service.selectCategoryByAllWithAPI();
		Assert.assertNotNull(list);
		System.out.println(list);
	}
}
