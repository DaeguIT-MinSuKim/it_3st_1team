package kr.or.dgit.it_3st_1team;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.IDPWsearchService;

public class IDPWServiceTest {
	private static IDPWsearchService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new IDPWsearchService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}
	
	@Test
	public void test1SelectIdByName() {
		User user = new User();
		user.setName("배주현");
		user.setEmail("juhyun@dgit.com");
		User finduser = service.selectIdByName(user);
		Assert.assertNotNull(finduser);
	}

	@Test
	public void test1SelectPwByNo() {
		User user = new User();
		user.setName("배주현");
		user.setId("juhyun");
		user.setEmail("juhyun@dgit.com");
		User finduser = service.selectPwByNo(user);
		Assert.assertNotNull(finduser);
	}

}

