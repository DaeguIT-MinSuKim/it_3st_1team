package kr.or.dgit.it_3st_1team;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Location;
import kr.or.dgit.it_3st_1team.service.ManageBookService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManageBookServiceTest {
	private static ManageBookService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new ManageBookService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1selectBookByAllForResultMapExtends() {
		Book book = new Book();
		Location loca = new Location();
		book.setLocation(loca);
		List<Book> listStd = service.selectBookByAllForResultMapExtendsWithAPI(book);
		Assert.assertNotNull(listStd);
		System.out.println(listStd);
	}
	
	@Test
	public void test2selectBookByNameForResultMapExtends() {
		Book book = new Book();
		Location loca = new Location();
		book.setLocation(loca);
		book.setBkname("%코끼리%");
		List<Book> listStd = service.selectBookByNameForResultMapExtendsWithAPI(book);
		Assert.assertNotNull(listStd);
		System.out.println(listStd);
	}
	
/*	@Test
	public void test3selectBookByMapWithAPI() {
		Map<String, Book> map = service.selectBookByMapWithAPI();
		Assert.assertNotNull(map);
		for(Entry<String, Book>entry : map.entrySet()){
            System.out.printf("key(%s) - value(%s)%n", entry.getKey(), entry.getValue());
        }
	}*/
}
