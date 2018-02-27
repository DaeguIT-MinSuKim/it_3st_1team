package it_3st_1team;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import it_3st_1team.ui.service.EmployeeService;
import kr.or.dgit.it_3st_1team.dto.Employee;


public class EmployeeServiceTest {
	private static EmployeeService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new EmployeeService();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}
	
	@Test
	public void test1findSelectEmployeeIdByNo() {
		Employee employee = new Employee();
		employee.setId("namju");
		employee.setPw("namju");
		Employee findemployeeId = service.findSelectEmployeeIdByNo(employee);
		Assert.assertNotNull(findemployeeId);
	}
	
}
