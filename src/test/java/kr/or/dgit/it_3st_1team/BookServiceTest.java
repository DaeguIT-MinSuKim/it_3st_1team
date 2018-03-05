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
		service = BookService.getInstance();
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
	
	@Test
	public void test4selectBookDetail() {
		Book book = new Book();
		book.setAuthor("톤 텔레헨");
		List<Book> booklist1 = service.selectBookDetail(book);
		Assert.assertNotNull(booklist1);
		for(Book b: booklist1) {
			System.out.println(b);
		}
		
		Book book2 = new Book();
		book2.setPublish("북라이프");
		List<Book> booklist2 = service.selectBookDetail(book2);
		Assert.assertNotNull(booklist2);
		for(Book b: booklist2) {
			System.out.println(b);
		}
		
		Book book3 = new Book();
		book3.setBkname("언어의 온도");
		book3.setPubyear(2016);
		List<Book> booklist3 = service.selectBookDetail(book3);
		Assert.assertNotNull(booklist3);
		for(Book b: booklist3) {
			System.out.println(b);
		}
	}

}
