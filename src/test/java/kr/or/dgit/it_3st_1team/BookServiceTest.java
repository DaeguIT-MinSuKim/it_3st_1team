package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Book;
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
	public void test1selectBookStartAll() {
		List<Book> booklist = service.selectBookStartAll();
		Assert.assertNotNull(booklist);
		for(Book b: booklist) {
			System.out.println(b);
		}
	}
/*	@Test
	public void test2selectBookAll() {
		Book book = new Book();
		Location loca = new Location();
		loca.setLoca_num("000010");
		book.setLocation(loca);
		List<Book> booklist = service.selectBookAll(book);
		Assert.assertNotNull(booklist);
		for(Book b: booklist) {
			System.out.println(b);
		}
	}*/
	@Test
	public void test3selectExistNum() {
		int bookNum = service.selectExistNum("9788962880069");
		Assert.assertNotNull(bookNum);
	}

}
