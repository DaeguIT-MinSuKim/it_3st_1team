package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Employee;

public interface EmployeeDao {
	//select
	List<Employee> selectEmployeeByAll();
	// insert
	int insertEmployeeWithAPI(Employee emp);
	// update 사원정보 수정시 비번 노변경
	int updateEmployeeWithAPI(Employee emp);
	// 비번만 변경용
	int updatePasswordWithAPI(Employee emp);

	//select
	//사원 로그인 - 아이디, 비밀번호
	Employee selectIdPw(Employee emp);
	//아이디찾기 - 이름, 이메일
	Employee selectNameEmail(Employee emp);
	//비밀번호찾기 - 아이디, 이메일
	Employee selectIdEmail(Employee emp);

}
