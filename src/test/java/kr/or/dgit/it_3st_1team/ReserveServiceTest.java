package kr.or.dgit.it_3st_1team;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Reserve;
import kr.or.dgit.it_3st_1team.service.ReserveService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReserveServiceTest {
	private static ReserveService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = ReserveService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1selectReserveByCode() {
		Reserve res = new Reserve();
		res.setCode("6");
		List<Reserve> list = service.selectReserveByCode(res);
		Assert.assertNotNull(list);
	}
	
	@Test
	public void test2selectAllReserve() {
		List<Reserve> list = service.selectAllReserve();
		Assert.assertNotNull(list);
	}
}
