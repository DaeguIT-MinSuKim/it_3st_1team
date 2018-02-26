package it_3st_1team;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import it_3st_1team.ui.service.IDPWsearchService;
import kr.or.dgit.it_3st_1team.dto.User;

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

