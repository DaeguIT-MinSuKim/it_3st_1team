package kr.or.dgit.it_3st_1team;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.it_3st_1team.dto.Request;
import kr.or.dgit.it_3st_1team.service.RequestService;

public class RequestServiceTest {
	private static RequestService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new RequestService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1insertRequest() {
		Request request = new Request();
		request.setAuthor("S.L 그레이");
		request.setBkname("아파트먼트");
		request.setPublish("검은숲");
		request.setPubyear(2018);
		request.setIsbn("9788952790019");
		request.setPrice(2018);
		
		int res = service.insertRequest(request);
		Assert.assertEquals(1, res);
	}

}
