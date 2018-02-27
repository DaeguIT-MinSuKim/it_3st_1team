package kr.or.dgit.it_3st_1team.dao;

import kr.or.dgit.it_3st_1team.dto.Employee;

public interface EmployeeDao {
		//select
		Employee selectEmployeeIdByNo(Employee employee);
		Employee selectEmployeePwByNo(Employee employee);
}
