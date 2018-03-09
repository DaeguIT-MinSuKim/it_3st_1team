package kr.or.dgit.it_3st_1team;

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
	
	@Test
	public void test3selectReserveNum() {
		Reserve res = new Reserve();
		res.setIsbn("9788971998014");
		int num = service.selectReserveNum(res);
	}
	
	@Test
	public void test4insertReserve() {
		Reserve res = new Reserve();
		res.setCode("6");
		res.setBkcode("122008EM0000222221");
		res.setIsbn("9788955619317");
		Date day = new Date();
		res.setResday(day);
		int num = service.insertReserve(res);
	}
	
	@Test
	public void test5selectalreadyReserve() {
		Reserve res = new Reserve();
		res.setCode("6");
		res.setIsbn("9791186588772");
		List<Reserve>list = ReserveService.getInstance().selectalreadyReserve(res);
		Assert.assertNotNull(list);
	}
}
