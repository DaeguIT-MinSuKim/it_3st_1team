package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Employee;
import kr.or.dgit.it_3st_1team.service.EmployeeService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
	public void test1FindEmployeeByAll() {
		List<Employee> listEmp = service.selectEmployeeByAll();
		Assert.assertNotNull(listEmp);
		for(Employee emp : listEmp) {
			System.out.println(emp);
		}
	}
	/*@Test
	public void test2insertEmployeeWithAPI() {
		Employee emp = new Employee();
		
		int res = service.insertEmployeeWithAPI();
		Assert.assertSame(1,res);
	}*/
	
	/*@Test
	public void test1findSelectEmployeeIdByNo() {
		Employee employee = new Employee();
		employee.setId("namju");
		employee.setPw("namju");
		Employee findemployeeId = service.findSelectEmployeeIdByNo(employee);
		Assert.assertNotNull(findemployeeId);
	}*/
}
