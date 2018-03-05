package kr.or.dgit.it_3st_1team;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import kr.or.dgit.it_3st_1team.dto.Employee;
import kr.or.dgit.it_3st_1team.service.EmployeeService;


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