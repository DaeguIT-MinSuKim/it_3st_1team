package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.History;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.HistoryService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HistoryServiceTest {
	private static HistoryService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = HistoryService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1selectAllhistory() {
		History his = new History();
		his.setCode("6");
		List<History> list = service.selectAllhistory(his);
		Assert.assertNotNull(list);
	}
}
