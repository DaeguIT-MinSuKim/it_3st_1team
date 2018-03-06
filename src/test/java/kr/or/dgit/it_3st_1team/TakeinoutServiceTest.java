package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Takeinout;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.TakeinoutService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TakeinoutServiceTest {
	private static TakeinoutService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new TakeinoutService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}
	
	@Test
	public void test1selectBookStartAll() {
		Takeinout inout = new Takeinout();
		User user = new User();
		user.setCode("4");
		inout.setUser(user);
		List<Takeinout> booklist = service.selectUserForBookByAll(inout);
		Assert.assertNotNull(booklist);
		for(Takeinout b: booklist) {
			System.out.println(b);
		}
	}
	
	@Test
	public void test2selectMatchingBook() {
		Takeinout inout = new Takeinout();
		Book book = new Book();
		book.setBkCode("122008EM0000393415");
		inout.setBook(book);
		inout = service.selectMatchingBook(book);
		//Assert.assertNotNull(inout);
	}	

	@Test
	public void test3selectOutNum() {
		String Isbn = "9788962880069";
		int res = service.selectOutNum(Isbn);
	}	
}
