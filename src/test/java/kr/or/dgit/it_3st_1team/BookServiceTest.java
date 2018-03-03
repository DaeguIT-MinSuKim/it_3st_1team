package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Category;
import kr.or.dgit.it_3st_1team.dto.Location;
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
	public void test1selectBookByAllForResultMapExtends() {
		List<Book> listStd = service.selectBookByAllForResultMapExtendsWithAPI();
		Assert.assertNotNull(listStd);
		System.out.println(listStd);
	}
	
	@Test
	public void test2selectBigCategoryByNameForResult() {
		Location lo = new Location();
		lo.setLoca_num("100");
		Book book = new Book();
		book.setLoca_num(lo);
		List<Book> listStd = service.selectBookByBigCategoryWithAPI(book);
		Assert.assertNotNull(listStd);
		System.out.println(listStd);
	}
}
