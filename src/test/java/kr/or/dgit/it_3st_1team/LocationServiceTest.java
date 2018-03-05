package kr.or.dgit.it_3st_1team;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Location;
import kr.or.dgit.it_3st_1team.service.LocationService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocationServiceTest {
	private static LocationService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = LocationService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1selectSectionBynum() {
		Location loca = new Location();
		loca.setLoca_num("000030");
		String section = service.selectSectionBynum(loca);
		Assert.assertNotNull(section);
	}
}
