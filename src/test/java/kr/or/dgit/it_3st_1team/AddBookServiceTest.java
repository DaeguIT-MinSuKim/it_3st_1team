package kr.or.dgit.it_3st_1team;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.service.ManageBookService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddBookServiceTest {
	private static ManageBookService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new ManageBookService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

}
