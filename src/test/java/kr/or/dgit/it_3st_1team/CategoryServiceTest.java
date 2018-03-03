package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Category;
import kr.or.dgit.it_3st_1team.service.CategoryService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CategoryServiceTest {
	private static CategoryService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new CategoryService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1SelectBigCategoryByAll() {
		List<Category> list = service.selectBigCategoryByAllWithAPI();
		Assert.assertNotNull(list);
	}
}
