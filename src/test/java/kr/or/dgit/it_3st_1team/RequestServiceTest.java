package kr.or.dgit.it_3st_1team;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Request;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.RequestService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
		User user = new User("6");
		request.setCode(user.getCode());
		request.setAuthor("S.L 그레이");
		request.setBkname("아파트먼트");
		request.setPublish("검은숲");
		request.setPubyear(2018);
		request.setIsbn("9788952790019");
		request.setPrice(19900);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date today = new Date();
		sd.format(today);
		request.setReqday(today);
		
		int res = service.insertRequest(request);
		Assert.assertEquals(1, res);
	}

	/*@Test
	public void test2deleteRequest() {
		Request request = new Request();
		request.setIsbn("9788952790019");
		
		int res = service.deleteRequest(request);
		Assert.assertEquals(1, res);
	}*/
	
	@Test
	public void test3selectAllhistory() {
		Request req = new Request();
		req.setCode("6");
		List<Request> list = service.selectRequestByCode(req);
		Assert.assertNotNull(list);
	}
	
	@Test
	public void test4selectAllRequest() {
		List<Request> list = service.selectAllRequest();
		Assert.assertNotNull(list);
	}
	
	@Test
	public void test5selectRequestByCodeIsbn() {
		Request req = new Request();
		req.setCode("6");
		req.setIsbn("9788972838785");
		if (service.selectRequestByCodeIsbn(req).size() == 0) {
			System.out.println("도서신청이 완료되었습니다.");
		} else {
			System.out.println("이미 신청한 도서입니다.");
		}
	}
}
