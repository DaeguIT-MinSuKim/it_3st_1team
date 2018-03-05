package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Employee;

public interface EmployeeDao {
	//select
	List<Employee> selectEmployeeByAll();
	// insert
	int insertEmployeeWithAPI(Employee emp);
	// update
	int updateEmployeeWithAPI(Employee emp);
	
}
