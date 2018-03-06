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
	@Test
	public void test3selectIdPw() {
		Employee emp = new Employee();
		emp.setId("namju");
		emp.setPw("namju");
		
		Employee selectEmp = service.selectIdPw(emp);
		Assert.assertEquals(emp.getId(), selectEmp.getId());
		Assert.assertEquals(emp.getPw(), selectEmp.getPw());
		System.out.println(selectEmp);
	}
	
	@Test
	public void test4selectNameEmail() {
		Employee emp = new Employee();
		emp.setName("김남주");
		emp.setEmail("namju@dgit.com");
		
		Employee selectEmp = service.selectNameEmail(emp);
		Assert.assertEquals(emp.getName(), selectEmp.getName());
		Assert.assertEquals(emp.getEmail(), selectEmp.getEmail());
		System.out.println(selectEmp);
	}
	
	@Test
	public void test5selectIdEmail() {
		Employee emp = new Employee();
		emp.setId("namju");
		emp.setEmail("namju@dgit.com");
		
		Employee selectEmp = service.selectIdEmail(emp);
		Assert.assertEquals(emp.getId(), selectEmp.getId());
		Assert.assertEquals(emp.getEmail(), selectEmp.getEmail());
		System.out.println(selectEmp);
	}
}
