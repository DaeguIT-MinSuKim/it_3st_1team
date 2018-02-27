package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.service.BookService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookServiceTest {
	private static BookService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new BookService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1FindBookByAll() {
		List<Book> listStd = service.findBookWithTakeInoutByAll();
		Assert.assertNotNull(listStd);
	}
}
